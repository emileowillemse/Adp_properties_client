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
public class User {
    private String username;
    private int password;
    private String role;

    public User(String name, int ID) {
        this.username = name;
        this.password = ID;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String name) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password  + ", role=" + role + '}';
    }
    
    
}
