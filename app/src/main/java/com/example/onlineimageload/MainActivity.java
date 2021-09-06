package com.example.onlineimageload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

// Overall 3 steps
// Add internet permission in manifest
// add dependency of Picasso
// Use the java code to load it 

public class MainActivity extends AppCompatActivity {

    ImageView imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // simply use image view and get it using findViewById
        imageView1=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        // save your url in a string form
        String url="https://p2.piqsels.com/preview/775/243/598/body-kit-car-car-wallpaper-custom.jpg";
        String url2="https://p2.piqsels.com/preview/839/799/651/urban-bike.jpg";
        // simply use the Picasso and upload your online images using below line of code
        Picasso.get().load(url).placeholder(R.drawable.avator).into(imageView1);
        // Placeholder is the image load until your online image is not Loaded
        Picasso.get().load(url2).placeholder(R.drawable.avator).into(imageView2);

    }
}