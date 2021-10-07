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
public class Agent {
    
    private String name;
    private int number;
    private String address;
    private String rented;
    private String cost;
    private String comm;
    private String available;
    private String date;

    public Agent(String name, int number, String address, String rented, String cost, String comm, String available, String date) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.rented = rented;
        this.cost = cost;
        this.comm = comm;
        this.available = available;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRented() {
        return rented;
    }

    public void setRented(String rented) {
        this.rented = rented;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
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
        return "Agent{" + "name=" + name + ", number=" + number + ", address=" + address + ", rented=" + rented + ", cost=" + cost + ", comm=" + comm + ", available=" + available + ", date=" + date + '}';
    }
    
}
