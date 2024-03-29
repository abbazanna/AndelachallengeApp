package com.example.andelachallengeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAboutALC(View v){

        Intent intent = new Intent(this,AboutALCActivity.class);
        startActivity(intent);
    }

    public void openProfile(View v){

        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }
}
