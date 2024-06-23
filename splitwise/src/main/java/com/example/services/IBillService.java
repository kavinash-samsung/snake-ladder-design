package com.example.services;

import java.util.Map;

import com.example.models.User;

public interface IBillService {
    
    public void addBill(int id, int groupId, int amount, Map<User, Integer> contribution, User paidBy);
}
