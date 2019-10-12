package com.example.wallypaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MinimalistActivity extends AppCompatActivity implements View.OnClickListener{
    private int[] wallpapers;
    private ImageView minimalist1;
    private ImageView minimalist2;
    private ImageView minimalist3;
    private ImageView minimalist4;
    private ImageView minimalist5;
    private ImageView minimalist6;
    private WallpaperManager wallpaperManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minimalist);
        wallpaperManager = WallpaperManager.getInstance(this);
        minimalist1 = findViewById(R.id.minimalist1);
        minimalist1.setOnClickListener(this);
        minimalist2 = findViewById(R.id.minimalist2);
        minimalist2.setOnClickListener(this);
        minimalist3 = findViewById(R.id.minimalist3);
        minimalist3.setOnClickListener(this);
        minimalist4 = findViewById(R.id.minimalist4);
        minimalist4.setOnClickListener(this);
        minimalist5 = findViewById(R.id.minimalist5);
        minimalist5.setOnClickListener(this);
        minimalist6 = findViewById(R.id.minimalist6);
        minimalist6.setOnClickListener(this);

        loadWallpaper();
    }
    void loadWallpaper(){
        wallpapers = new int[7];
        wallpapers[0] = R.drawable.minimalist1;
        wallpapers[1] = R.drawable.minimalist2;
        wallpapers[2] = R.drawable.minimalist3;
        wallpapers[3] = R.drawable.minimalist4;
        wallpapers[4] = R.drawable.minimalist5;
        wallpapers[5] = R.drawable.minimalist6;
    }
    void ChangeWallpaper(int image){
        try{
            wallpaperManager.setResource(image);
        }
        catch (Exception E){
            System.err.println(E.getMessage());
        }
    }
    @Override
    public void onClick(View view){
        if (view == minimalist1){
            ChangeWallpaper(wallpapers[0]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Whale on Deep Sea",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == minimalist2){
            ChangeWallpaper(wallpapers[1]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Boat in the Cloud",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == minimalist3){
            ChangeWallpaper(wallpapers[2]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Bike on Saturn",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == minimalist4){
            ChangeWallpaper(wallpapers[3]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Dream Bike",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == minimalist5){
            ChangeWallpaper(wallpapers[4]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Red Button",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == minimalist6){
            ChangeWallpaper(wallpapers[5]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Star Wars",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
    }

}
