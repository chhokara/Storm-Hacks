package com.example.stormhacks;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Users {
    @PrimaryKey (autoGenerate = true)
    public int uid;

    @ColumnInfo (name = "name")
    public String name;

    @ColumnInfo (name = "university")
    public String university;

    @ColumnInfo (name = "programming_languages")
    public String programming_languages;

    @ColumnInfo (name = "interests")
    public String interests;

    public Users(String name, String university, String programming_languages, String interests) {
        this.name = name;
        this.university = university;
        this.programming_languages = programming_languages;
        this.interests = interests;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getProgramming_languages() {
        return programming_languages;
    }

    public void setProgramming_languages(String programming_languages) {
        this.programming_languages = programming_languages;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }
}
