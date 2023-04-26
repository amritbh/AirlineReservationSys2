package com.mpp.airlinereservationsys.model;

import java.util.HashMap;
import java.util.Map;


public interface Authenticator {

    private static Map<String,String> getUsers() {
        Map<String,String> stringStringMap = new HashMap<>();
        stringStringMap.put("admin","admin");
        stringStringMap.put("user","user");
        return stringStringMap;
    }

    public default void authorize(String username, String password, RoleType roleType) {
        if (!checkAdminUser(username, roleType)) {
            throw new RuntimeException("Invalid user.");
        }
        if (!checkPassword(username, password)) {
            throw new RuntimeException("Invalid user.");
        }
    }

    private boolean checkAdminUser(String username, RoleType roleType) {
        return username.equals("admin") && roleType == RoleType.ADMIN;
    }

    private boolean checkPassword(String username, String password) {
        Map<String,String> users = getUsers();
        return users.containsKey(username) && users.get(username).equals(password);
    }
}



