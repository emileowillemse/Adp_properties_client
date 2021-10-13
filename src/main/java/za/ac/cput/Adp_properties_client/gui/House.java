/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Adp_properties_client.gui;

/**
 *
 * @author emile
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class House implements ActionListener, ItemListener {
    
    
    private JFrame mainframe;
    
    private JPanel panelcenter , panelsouth;
    
    private JLabel lblID, lbllocation, lblrooms , lblrent , lblcanRent;
            
            private JTextField txtID , txtlocation ,  txtrooms, txtrent;
            
            private JComboBox ccanRent;
            
            private JButton btnadd;
    
    
    public House (){
        
        mainframe = new JFrame ("Admin");
        panelcenter = new JPanel();
        panelsouth = new JPanel ();
        
        lblID= new JLabel("House ID:");
        txtID = new JTextField (25);
        
        lbllocation = new JLabel("Address:");
        txtlocation = new JTextField (25);
        
        lblrooms = new JLabel("Amount of rooms:");
        txtrooms = new JTextField (25);
        
        lblrent = new JLabel("Rent:");
        txtrent = new JTextField (25);
        
        String [] choose = {"-no selction made-" ,"yes", "no"};
        ccanRent = new JComboBox(choose);
        lblcanRent =new JLabel("Can you rent?");
    
    btnadd= new JButton ("Add");
    
    
    mainframe.setSize(900,450);
    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainframe.setVisible(true);
    
    btnadd.setEnabled(true);
    

}
    public void setGui(){
    
        panelcenter.setLayout( new GridLayout (7,2));
        panelsouth.setLayout ( new GridLayout (1,1));
        
        
        panelcenter.add(lblID);
        panelcenter.add(txtID);
        
        panelcenter.add(lbllocation);
        panelcenter.add(txtlocation);
        
        panelcenter.add(lblrooms);
        panelcenter.add(txtrooms);
        
        panelcenter.add(lblrent);
        panelcenter.add(txtrent);
        
        panelcenter.add(lblcanRent);
        panelcenter.add(ccanRent);
        
        panelsouth.add(btnadd);
        
        
        mainframe.add(panelcenter, BorderLayout.CENTER);
        mainframe.add(panelsouth, BorderLayout.SOUTH);
   
   
   btnadd.addActionListener(this);
         
        
    
    }
    
//    adminButton.addActionListner() {
//    
//        House guiOne = new House();
//        this.close;
//    }
    
//    agentButton.addActionListner() {
//    
//        AgentGui guiTwo = new AgentGui();
//        this.close;
//    }
    
    public static void main(String[] args) {
        
        //new Gui().setGui();
        
        House gui = new House();
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
