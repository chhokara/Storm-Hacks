package com.example.stormhacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        nextButton();
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, UserInfo.class);
    }

    private boolean isFieldSet() {
        EditText name = findViewById(R.id.name);
        EditText university = findViewById(R.id.university);
        EditText programmingLanguages = findViewById(R.id.programming_languages);
        EditText interests = findViewById(R.id.interests);

        return !name.toString().equals("") && !university.toString().equals("")&& !programmingLanguages.toString().equals("")&& !interests.toString().equals("");
    }

    private void nextButton() {
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isSet = isFieldSet();
                if(isSet) {
                    Intent intent = Dashboard.makeIntent(UserInfo.this);
                    startActivity(intent);
                }
            }
        });
    }
}