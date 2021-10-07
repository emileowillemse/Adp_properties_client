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


public class AdminGui implements ActionListener, ItemListener {
    
    
    private JFrame mainframe;
    
    private JPanel panelcenter , panelsouth;
    
    private JLabel lblhouse, lbladdress, lbllocation , lblcost , lblagent , lblavailable , lbldate;
            
            private JTextField txthouse , txtaddress ,  txtcost, txtagent, txtavailable, txtdate;
            
            private JComboBox clocation;
            
            private JButton btnadd;
    
    
    public AdminGui (){
        
        mainframe = new JFrame ("Admin");
        panelcenter = new JPanel();
        panelsouth = new JPanel ();
        
        lblhouse= new JLabel("House ID:");
        txthouse = new JTextField (25);
        
        lbladdress = new JLabel("Address:");
        txtaddress = new JTextField (25);
        
        String [] choose = {"-no selction made-" , "Kuils River" , "Cape Town" , "Durbanville", "Strand"};
        clocation = new JComboBox(choose);
        lbllocation =new JLabel("Location");
        
        lblcost = new JLabel("Cost of rent:");
        txtcost = new JTextField (25);
        
        
        lblagent = new JLabel("Agents Details:");
        txtagent = new JTextField (25);
        
        lblavailable = new JLabel("Availability:");
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
    
        panelcenter.setLayout( new GridLayout (7,2));
        panelsouth.setLayout ( new GridLayout (1,1));
        
        
        panelcenter.add(lblhouse);
        panelcenter.add(txthouse);
        
        panelcenter.add(lbladdress);
        panelcenter.add(txtaddress);
        
        panelcenter.add(lbllocation);
        panelcenter.add(clocation);
        //
        panelcenter.add(lblcost);
        panelcenter.add(txtcost);
        
        panelcenter.add(lblagent);
        panelcenter.add(txtagent);
        
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
        
        AdminGui gui = new AdminGui();
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
