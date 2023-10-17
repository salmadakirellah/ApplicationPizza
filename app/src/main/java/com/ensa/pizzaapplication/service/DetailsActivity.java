package com.ensa.pizzaapplication.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ensa.pizzaapplication.R;

public class DetailsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent=this.getIntent();
        if(intent !=null){
            String nom = intent.getStringExtra("nom");

            int img=intent.getIntExtra("img",R.drawable.ic_launcher_background);
            ImageView i=findViewById(R.id.image);
            TextView n=findViewById(R.id.nom1);
            n.setText(nom);
            i.setImageResource(img);
        }
    }
}