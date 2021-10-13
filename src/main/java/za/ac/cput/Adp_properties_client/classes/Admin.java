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
    
    private String house;
    private String address;
    private String location;
    private String cost;
    private String agent;
    private String available;
    private String date;
    

    public Admin(String house, String address, String location, String cost, String agent, String available, String date) {
        this.house = house;
        this.address = address;
        this.location = location;
        this.cost = cost;
        this.agent = agent;
        this.available = available;
        this.date = date;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Admin{" + "house=" + house + ", address=" + address + ", location=" + location + ", cost=" + cost + ", agent=" + agent + ", available=" + available + ", date=" + date + '}';
    }

}
