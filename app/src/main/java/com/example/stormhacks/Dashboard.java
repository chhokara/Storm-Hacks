package com.example.stormhacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    UserManager users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        users = UserManager.getInstance();
        setText();
    }

    private void setText() {
        TextView name = findViewById(R.id.user_name);
        TextView university = findViewById(R.id.user_university);
        TextView programmingLanguages = findViewById(R.id.user_programming_languages);
        TextView interests = findViewById(R.id.user_interests);
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, Dashboard.class);
    }
}