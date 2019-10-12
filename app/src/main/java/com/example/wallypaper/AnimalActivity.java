package com.example.wallypaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AnimalActivity extends AppCompatActivity implements View.OnClickListener{
    private int[] wallpapers;
    private ImageView animal1;
    private ImageView animal2;
    private ImageView animal3;
    private ImageView animal4;
    private ImageView animal5;
    private ImageView animal6;
    private WallpaperManager wallpaperManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        wallpaperManager = WallpaperManager.getInstance(this);
        animal1 = findViewById(R.id.animal1);
        animal1.setOnClickListener(this);
        animal2 = findViewById(R.id.animal2);
        animal2.setOnClickListener(this);
        animal3 = findViewById(R.id.animal3);
        animal3.setOnClickListener(this);
        animal4 = findViewById(R.id.animal4);
        animal4.setOnClickListener(this);
        animal5 = findViewById(R.id.animal5);
        animal5.setOnClickListener(this);
        animal6 = findViewById(R.id.animal6);
        animal6.setOnClickListener(this);

        loadWallpaper();
    }
    void loadWallpaper(){
        wallpapers = new int[7];
        wallpapers[0] = R.drawable.animal1;
        wallpapers[1] = R.drawable.animal2;
        wallpapers[2] = R.drawable.animal3;
        wallpapers[3] = R.drawable.animal4;
        wallpapers[4] = R.drawable.animal5;
        wallpapers[5] = R.drawable.animal6;
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
        if (view == animal1){
            ChangeWallpaper(wallpapers[0]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Owl",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == animal2){
            ChangeWallpaper(wallpapers[1]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Black Cat",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == animal3){
            ChangeWallpaper(wallpapers[2]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Blue Butterfly",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == animal4){
            ChangeWallpaper(wallpapers[3]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Duck",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == animal5){
            ChangeWallpaper(wallpapers[4]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Fox on Nature",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == animal6){
            ChangeWallpaper(wallpapers[5]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Turtles",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
    }
}

