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
   
    private int agentID;

    public Agent(int agentID) {
        this.agentID = agentID;
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    @Override
    public String toString() {
        return "Agent{" + "agentID=" + agentID + '}';
    }
     
}
