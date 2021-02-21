package com.example.stormhacks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DiscoveryPage extends AppCompatActivity {
    UserManager users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discovery_page);
        users = UserManager.getInstance(DiscoveryPage.this);
        setupAdapter();
    }

    @Override
    protected void onStart() {
        super.onStart();
        setupAdapter();
    }
    private void setupAdapter() {
        RecyclerView recyclerView = findViewById(R.id.home_page_recycler_view);
        List<Profile> profiles = new ArrayList<>();
        for(int i = 0; i < users.getSize(); i++) {
            String name = users.getUsers(i).getName();
            String university = users.getUsers(i).getUniversity();
            String skills = users.getUsers(i).getProgramming_languages();
            String interests = users.getUsers(i).getInterests();
            profiles.add(new Profile(name, university, skills, interests));
        }
        recyclerView.setAdapter(new RecyclerAdapter(profiles));
        recyclerView.setLayoutManager(new LinearLayoutManager(DiscoveryPage.this));
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, DiscoveryPage.class);
    }

}