package com.pushpendra.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.unity3d.player.UnityPlayerActivity;

public class OptionActivity extends AppCompatActivity {
    FirebaseAuth mAuth;

    ConstraintLayout Welding,paint,engineSetup;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        Welding = findViewById(R.id.car_welding);
        paint = findViewById(R.id.Paint);
        engineSetup = findViewById(R.id.EngineSetup);

        Welding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptionActivity.this, UnityPlayerActivity.class);
                startActivity(intent);
            }
        });
        paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(OptionActivity.this, UnityPlayerActivity.class);
//                startActivity(intent);
                Toast.makeText(OptionActivity.this, "Complete Level 1 First!!", Toast.LENGTH_SHORT).show();
            }
        });
        engineSetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(OptionActivity.this, UnityPlayerActivity.class);
//                startActivity(intent);
                Toast.makeText(OptionActivity.this, "Complete Level 2 First!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}