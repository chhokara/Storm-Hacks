package com.example.stormhacks;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface UsersDAO {
    @Query("SELECT * FROM users")
    List<Users> getAll();

    @Query("SELECT * FROM users WHERE uid IN (:userIds)")
    List<Users> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM users WHERE name LIKE :name LIMIT 1")
    Users findByName(String name);

    @Query("SELECT * FROM users WHERE university LIKE :university LIMIT 1")
    Users findByUniversity(String university);

    @Query("SELECT * FROM users WHERE programming_languages LIKE :programming_languages LIMIT 1")
    Users findByProgrammingLanguages(String programming_languages);

    @Query("SELECT * FROM users WHERE interests LIKE :interests LIMIT 1")
    Users findByInterests(String interests);

    @Insert
    void insertAll(Users... users);

    @Delete
    void delete(Users user);
}
