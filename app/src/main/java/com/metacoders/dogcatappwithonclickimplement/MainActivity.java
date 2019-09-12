package com.metacoders.dogcatappwithonclickimplement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView dogImage;
    private ImageView catImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogImage = findViewById(R.id.dog_imageView);
        catImage = findViewById(R.id.cat_imageView);

        dogImage.setOnClickListener(this);
        catImage.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.dog_imageView:
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("Name", "Sheena");
                dogIntent.putExtra("Desc", "Nice Dog, Loves everyone. \n Barks alot");

                startActivity(dogIntent);
//                Toast.makeText(MainActivity.this, "Dog", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cat_imageView:
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("Name", "Kitty");
                catIntent.putExtra("Desc", "Nice Cat, Loves everyone. \n Mews alot");

                startActivity(catIntent);
//                Toast.makeText(MainActivity.this, "Cat", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
