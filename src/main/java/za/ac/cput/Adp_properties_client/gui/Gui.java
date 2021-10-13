
package za.ac.cput.Adp_properties_client.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Gui implements ActionListener, ItemListener {
    
    
    private JFrame mainframe;
    
    private JPanel panelcenter , panelsouth;
    
            private JLabel lblname, lblID;
            
            private JTextField txtname , txtID; 
            
            private JButton btnadmin;
            private JButton btnagent;
            private JButton btnadd;
    
    public Gui (){
        
        mainframe = new JFrame ("Login");
        panelcenter = new JPanel();
        panelsouth = new JPanel ();
        
        lblname= new JLabel("Customer Name:");
        txtname = new JTextField (25);
        
        lblID= new JLabel("Customer ID:");
        txtID = new JTextField (25);
        
    btnadmin= new JButton ("Admin");
    btnagent= new JButton ("Agent");
    btnadd= new JButton ("Sign-Up");
    
    
    mainframe.setSize(900,450);
    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainframe.setVisible(true);
    
    btnadd.setEnabled(true);
    

}
    public void setGui(){
    
        panelcenter.setLayout( new GridLayout (2,2));
        panelsouth.setLayout ( new GridLayout (3,3));
        
        
        panelcenter.add(lblname);
        panelcenter.add(txtname);
        
        panelcenter.add(lblID);
        panelcenter.add(txtID);
        
        panelsouth.add(btnadmin);
        panelsouth.add(btnagent);
        panelsouth.add(btnadd);
        
        
        mainframe.add(panelcenter, BorderLayout.CENTER);
        mainframe.add(panelsouth, BorderLayout.SOUTH);
   
   btnadmin.addActionListener(this);
   btnagent.addActionListener(this);
   btnadd.addActionListener(this);
         
        
    
    }
    
//    adminButton.addActionListner() {
//    
//        AdminGui guiOne = new AdminGui();
//        this.close;
//    }
    
//    agentButton.addActionListner() {
//    
//        AgentGui guiTwo = new AgentGui();
//        this.close;
//    }
    
    public static void main(String[] args) {
        
        //new Gui().setGui();
        
        Gui gui = new Gui();
        gui.setGui();
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
