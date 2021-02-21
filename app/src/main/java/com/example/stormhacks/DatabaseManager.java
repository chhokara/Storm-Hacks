package com.example.stormhacks;

import android.content.Context;

import androidx.room.Room;

import java.util.List;

public class DatabaseManager {
    private static final String DATABASE_NAME = "production";
    private static AppDatabase database;
    // Singleton support
    private static DatabaseManager instance;
    private DatabaseManager() {}

    public static DatabaseManager getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseManager();

            // Initialize the SQLite database.
            database = Room.databaseBuilder(context, AppDatabase.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .build();
        }

        return instance;
    }

    public List<Users> getAllUsers() {
        return database.usersDao().getAll();
    }

    public Users getUserByName(String name) {
        return database.usersDao().findByName(name);
    }

    public Users getUserByUniversity(String university) {
        return database.usersDao().findByUniversity(university);
    }

    public Users getUserProgrammingLanguages(String programmingLanguages) {
        return database.usersDao().findByProgrammingLanguages(programmingLanguages);
    }

    public Users getUserByInterests(String interests) {
        return database.usersDao().findByInterests(interests);
    }

    public void insertUser(Users user) {
        database.usersDao().insertAll(user);
    }

}
