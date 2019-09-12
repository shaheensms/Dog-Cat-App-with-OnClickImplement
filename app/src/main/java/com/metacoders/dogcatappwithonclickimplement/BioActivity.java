package com.metacoders.dogcatappwithonclickimplement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView animalPic;
    private TextView animalName;
    private TextView animalDesc;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        animalPic = findViewById(R.id.animal_image);
        animalName = findViewById(R.id.animal_name);
        animalDesc = findViewById(R.id.animal_desc);

        extras = getIntent().getExtras();

        if (extras != null){
            String name = extras.getString("Name");
            String desc = extras.getString("Desc");

            setUp(name, desc);
        }
    }

    public void setUp(String name, String desc){
        if (name.equals("Sheena")){

            animalPic.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            animalName.setText(name);
            animalDesc.setText(desc);

        } else if (name.equals("Kitty")){

            animalPic.setImageDrawable(getResources().getDrawable(R.drawable.cat));
            animalName.setText(name);
            animalDesc.setText(desc);

        }
    }
}
