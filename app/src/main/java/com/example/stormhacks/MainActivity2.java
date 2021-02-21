package com.example.stormhacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        signUpButton();
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, MainActivity2.class);
    }

    private boolean isFieldSet() {
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        return !username.toString().equals("") && !password.toString().equals("");
    }

    private void signUpButton() {
        Button signUpBtn = findViewById(R.id.signup_btn);
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isSet = isFieldSet();
                if(isSet) {
                    Intent intent = UserInfo.makeIntent(MainActivity2.this);
                    startActivity(intent);
                }
            }
        });
    }
}