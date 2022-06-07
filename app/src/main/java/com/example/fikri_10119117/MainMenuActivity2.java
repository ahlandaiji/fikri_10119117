package com.example.fikri_10119117;
//nama      = fikri muhamad fauzi
//nim       = 10119117
//kelas     = if-3

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu2);

        Button btnNote             = findViewById(R.id.btnNote);
        Button btnAbout             = findViewById(R.id.btnAbout);

        btnNote.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNote:
                Intent movei1 = new Intent(MainMenuActivity2.this, MainActivity.class);
                startActivity(movei1);
                break;
            case R.id.btnAbout:
                Intent movei12 = new Intent(MainMenuActivity2.this, AboutActivity2.class);
                startActivity(movei12);
                break;
        }
    }

}