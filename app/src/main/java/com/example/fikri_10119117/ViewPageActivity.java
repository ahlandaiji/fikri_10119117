package com.example.fikri_10119117;
//nama      = fikri muhamad fauzi
//nim       = 10119117
//kelas     = if-3

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewPageActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        Button btnAct             = findViewById(R.id.btnAct);
        btnAct.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAct:
                Intent pindahIntent1 = new Intent(ViewPageActivity.this, MainMenuActivity2.class);
                startActivity(pindahIntent1);
                break;
        }
    }

}