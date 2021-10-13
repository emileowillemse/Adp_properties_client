/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Adp_properties_client.classes;

/**
 *
 * @author emile
 */
public class Admin {
   
    private int adminID;

    public Admin(int adminID) {
        this.adminID = adminID;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    @Override
    public String toString() {
        return "Admin{" + "adminID=" + adminID + '}';
    }
    
     
}