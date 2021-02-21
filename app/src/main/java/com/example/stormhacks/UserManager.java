package com.example.stormhacks;


import android.content.Context;
import android.icu.lang.UScript;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserManager implements Iterable<Users> {
    private static List<Users> users = new ArrayList<>();
    private static DatabaseManager database;
    // singleton support
    private static UserManager instance;
    private UserManager() {
        // prevent instantiation
    }
    public static UserManager getInstance(Context context) {
        if(instance == null) {
            instance = new UserManager();
        }
        database = DatabaseManager.getInstance(context);
        users = database.getAllUsers();
        return instance;
    }

    public void addUser(Users user) {
        database.insertUser(user);
        users = database.getAllUsers();
    }

    public Users getUserByName(String name) {
        return database.getUserByName(name);
    }

    public Users getUserByUniversity(String university) {
        return database.getUserByUniversity(university);
    }

    public Users getUserByProgrammingLanguages(String programmingLanguages) {
        return database.getUserProgrammingLanguages(programmingLanguages);
    }

    public Users getUserByInterests(String interests) {
        return database.getUserByInterests(interests);
    }

    public Users getUsers(int n) {
        return users.get(n);
    }

    public int getSize() {
        return users.size();
    }

    @NonNull
    @Override
    public Iterator<Users> iterator() {
        return users.iterator();
    }
}
