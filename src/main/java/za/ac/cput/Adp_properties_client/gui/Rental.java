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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Rental implements ActionListener, ItemListener {
    
    
    private JFrame mainframe;
    
    private JPanel panelcenter , panelsouth;
    
    private JLabel lblcode, lblcommission, lblrentPrice;
            
            private JTextField txtcode , txtcommission ,  txtrentPrice;
            
            private JButton btnadd;
    
    
    public Rental (){
        
        mainframe = new JFrame ("Customer");
        panelcenter = new JPanel();
        panelsouth = new JPanel ();
        
        lblcode= new JLabel("Code:");
        txtcode = new JTextField (25);
        
        lblcommission= new JLabel("Commission:");
        txtcommission = new JTextField (25);
        
        lblrentPrice= new JLabel("Rent Price:");
        txtrentPrice = new JTextField (25);
        
    btnadd= new JButton ("Add");
    
    
    mainframe.setSize(900,450);
    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainframe.setVisible(true);
    
    btnadd.setEnabled(true);
    

}
    public void setGui(){
    
        panelcenter.setLayout( new GridLayout (8,2));
        panelsouth.setLayout ( new GridLayout (1,1));
        
        panelcenter.add(lblcode);
        panelcenter.add(txtcode);
        
        panelcenter.add(lblcommission);
        panelcenter.add(txtcommission);
        
        panelcenter.add(lblrentPrice);
        panelcenter.add(txtrentPrice);
        
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
//        Customer guiTwo = new Customer();
//        this.close;
//    }
    
    public static void main(String[] args) {
        
        //new Gui().setGui();
        
        Rental gui = new Rental();
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