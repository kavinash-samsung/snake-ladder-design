package com.example.models;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    int id;
    int groupId;
    int amount;
    Map<User, Integer> contribution;
    Map<User, Integer> paidBy;
    
    public Bill(int id, int groupId) {
        this.id = id;
        this.groupId = groupId;
        this.amount = 0;
        this.contribution = new HashMap<>();
        this.paidBy = new HashMap<>();
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getGroupId() {
        return groupId;
    }
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Map<User, Integer> getContribution() {
        return contribution;
    }
    public void setContribution(Map<User, Integer> contribution) {
        this.contribution = contribution;
    }
    public Map<User, Integer> getPaidBy() {
        return paidBy;
    }
    public void setPaidBy(Map<User, Integer> paidBy) {
        this.paidBy = paidBy;
    }

    
}
