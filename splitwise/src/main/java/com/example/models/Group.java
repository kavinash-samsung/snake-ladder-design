package com.example.models;

import java.util.ArrayList;
import java.util.List;

public class Group {
    int id;
    String groupName;
    List<User> members;
    public Group(int id, String groupName) {
        this.id = id;
        this.groupName = groupName;
        members = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public List<User> getMembers() {
        return members;
    }
    public void setMembers(List<User> members) {
        this.members = members;
    }
    
    
}
