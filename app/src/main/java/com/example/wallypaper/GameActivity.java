package com.example.wallypaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity implements View.OnClickListener{
    private int[] wallpapers;
    private ImageView game1;
    private ImageView game2;
    private ImageView game3;
    private ImageView game4;
    private ImageView game5;
    private ImageView game6;
    private WallpaperManager wallpaperManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        wallpaperManager = WallpaperManager.getInstance(this);
        game1 = findViewById(R.id.game1);
        game1.setOnClickListener(this);
        game2 = findViewById(R.id.game2);
        game2.setOnClickListener(this);
        game3 = findViewById(R.id.game3);
        game3.setOnClickListener(this);
        game4 = findViewById(R.id.game4);
        game4.setOnClickListener(this);
        game5 = findViewById(R.id.game5);
        game5.setOnClickListener(this);
        game6 = findViewById(R.id.game6);
        game6.setOnClickListener(this);

        loadWallpaper();
    }
    void loadWallpaper(){
        wallpapers = new int[7];
        wallpapers[0] = R.drawable.game1;
        wallpapers[1] = R.drawable.game2;
        wallpapers[2] = R.drawable.game3;
        wallpapers[3] = R.drawable.game4;
        wallpapers[4] = R.drawable.game5;
        wallpapers[5] = R.drawable.game6;
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
        if (view == game1){
            ChangeWallpaper(wallpapers[0]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Titanfall",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == game2){
            ChangeWallpaper(wallpapers[1]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Assassin Creed",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == game3){
            ChangeWallpaper(wallpapers[2]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi One Piece",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == game4){
            ChangeWallpaper(wallpapers[3]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Archer",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == game5){
            ChangeWallpaper(wallpapers[4]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Fallout",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else if (view == game6){
            ChangeWallpaper(wallpapers[5]);
            Toast toast = Toast.makeText(getApplicationContext(), "Wallpaper Diganti Menjadi Angry Bird",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
    }
}

