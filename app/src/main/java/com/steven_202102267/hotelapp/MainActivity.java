package com.steven_202102267.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://blog.tiket.com/wp-content/uploads/10-Hotel-Dekat-Pantai-di-Bangka-Harganya-Terjangkau_Blog-new-update-mei2020_Hotel-Santika-Premiere-Beach-Resort-Belitung3.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}