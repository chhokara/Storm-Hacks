package com.example.stormhacks;

public class Profile {
    String username, university, skills, interests;

    public Profile(String username, String university, String skills, String interests) {
        this.username = username;
        this.university = university;
        this.skills = skills;
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "username='" + username + '\'' +
                ", university='" + university + '\'' +
                ", skills='" + skills + '\'' +
                ", interests='" + interests + '\'' +
                '}';
    }
}
