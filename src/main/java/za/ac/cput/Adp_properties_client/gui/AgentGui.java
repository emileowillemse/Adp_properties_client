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


public class AgentGui implements ActionListener, ItemListener {
    
    
    private JFrame mainframe;
    
    private JPanel panelcenter , panelsouth;
    
    private JLabel lblname, lblnumber, lbladdress, lblrented , lblcost , lblcomm , lblavailable , lbldate;
            
            private JTextField txtname , txtnumber ,  txtcost, txtcomm, txtavailable, txtdate;
            
            private JComboBox caddress, crented;
            
            private JButton btnadd;
    
    
    public AgentGui (){
        
        mainframe = new JFrame ("Agent");
        panelcenter = new JPanel();
        panelsouth = new JPanel ();
        
        lblname= new JLabel("Customers Name:");
        txtname = new JTextField (25);
        
        lblnumber = new JLabel("Customers Number:");
        txtnumber = new JTextField (25);
        
        String [] choose = {"-no selction made-" , "9 Terblanche street" , "10 Terblanche street" , "11 Terblanche street", "12 Terblanche street"};
        caddress = new JComboBox(choose);
        lbladdress =new JLabel("Address:");
        
        String [] rent = {"-no selction made-" , "9 Terblanche street" , "10 Terblanche street" , "11 Terblanche street", "12 Terblanche street"};
        crented = new JComboBox(rent);
        lblrented =new JLabel("Houses rented:");
        
        lblcost = new JLabel("Rental Price:");
        txtcost = new JTextField (25);
        
        
        lblcomm = new JLabel("Agent Commission:");
        txtcomm = new JTextField (25);
        
        lblavailable = new JLabel("Availability for rent:");
        txtavailable = new JTextField (25);
        
        lbldate = new JLabel("Date:");
        txtdate = new JTextField (25);
        
        
        
        
        
        
        
        
        
    
    btnadd= new JButton ("Add");
    
    
    mainframe.setSize(900,450);
 mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainframe.setVisible(true);
    
    btnadd.setEnabled(true);
    

}
    public void setGui(){
    
        panelcenter.setLayout( new GridLayout (8,2));
        panelsouth.setLayout ( new GridLayout (1,1));
        
        
        panelcenter.add(lblname);
        panelcenter.add(txtname);
        
        panelcenter.add(lblnumber);
        panelcenter.add(txtnumber);
        
        panelcenter.add(lbladdress);
        panelcenter.add(caddress);
        
        panelcenter.add(lblrented);
        panelcenter.add(crented);
        
        panelcenter.add(lblcost);
        panelcenter.add(txtcost);
        
        panelcenter.add(lblcomm);
        panelcenter.add(txtcomm);
        
        panelcenter.add(lblavailable);
        panelcenter.add(txtavailable);
        
        panelcenter.add(lbldate);
        panelcenter.add(txtdate);
        
        panelsouth.add(btnadd);
        
        
        mainframe.add(panelcenter, BorderLayout.CENTER);
   mainframe.add(panelsouth, BorderLayout.SOUTH);
   
   
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
        
        AgentGui gui = new AgentGui();
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