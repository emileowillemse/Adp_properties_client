/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Adp_properties_client.connectiontoserver;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author emile
 */
public class Client extends JFrame{
       //variables        
    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private String message = "";
    private String serverIP;
    private Socket connection;  
    
    //constructor
    public Client(String host)
    {
        super("Client Gui ");
        serverIP = host;
        userText = new JTextField();
        userText.setEditable(false);
        userText.addActionListener
        (
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        sendMessage(event.getActionCommand());
                        userText.setText("");
                    }
                }
        );
        add(userText, BorderLayout.NORTH);
        chatWindow = new JTextArea();
        add(new JScrollPane(chatWindow), BorderLayout.CENTER);
        setSize(300,150);
        setVisible(true);
    }
    
    //connect to server
    public void startRunning()
    {
        try{
            connectToServer();
            setupStreams();
            whileChatting();
        }catch(EOFException eofException){
            showMessage("\n Client has started the connection");
        }catch(IOException ioException){
            ioException.printStackTrace();
        }finally{
            closeCrap();
        }
    }
    
    //connect to the server
    private void connectToServer()throws IOException
    {
        showMessage("Attemping to connect...\n");
        connection = new Socket(InetAddress.getByName(serverIP), 6789);
        showMessage("Connected to: " + connection.getInetAddress().getHostName());
    }
    
    //set up streams to send and recieve messages
    private void setupStreams() throws IOException
    {
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        showMessage("\n Sreams are good to go! \n");
    }
    
    //while chatting with server
    private void whileChatting()throws IOException
    {
        ableToType(true);
        do{
            try{
                message = (String) input.readObject();
                showMessage("\n" + message);
            }catch(ClassNotFoundException classNotfoundException){
                showMessage("\n I dont know that Object type");
            }
        }while(!message.equals("Server - End"));
    }
    
    //close the streams and sockets
    private void closeCrap()
    {
        showMessage("\n closing crap down...");
        ableToType(false);
        try{
            output.close();
            input.close();
            connection.close();
        }catch(IOException ioException)
        {
            ioException.printStackTrace();
        }
    }
    
    //send messages to server
    private void sendMessage(String message)
    {
        try{
            output.writeObject("Client -" + message);
            output.flush();
            showMessage("\n Client -" + message);
        }catch(IOException ioException){
            chatWindow.append("\n something messed up sending messages to host!");
        }        
    }
    
    //change/update chatWindow
    private void showMessage(final String m)
    {
        SwingUtilities.invokeLater(
            new Runnable()
            {
                public void run()
                {
                    chatWindow.append(m);
                }
            }
        );
    }
    
    //gives user permission to trype crap in the text box
    private void ableToType(final boolean tof)
    {
        SwingUtilities.invokeLater(
            new Runnable()
            {
                public void run()
                {
                    userText.setEditable(tof);
                }
            }
        );
    }
    
     //main method
    public static void main(String[] args)
    {
        za.ac.cput.Adp_properties_client.gui.Client milo;
        milo = new za.ac.cput.Adp_properties_client.gui.Client("127.0.0.1");
        milo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        milo.startRunning();
    }
    
}
