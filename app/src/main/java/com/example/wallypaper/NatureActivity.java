package com.example.wallypaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NatureActivity extends AppCompatActivity implements View.OnClickListener{

    private int[] wallpapers;
    private ImageView nature1;
    private ImageView nature2;
    private ImageView nature3;
    private ImageView nature4;
    private ImageView nature5;
    private ImageView nature6;
    private WallpaperManager wallpaperManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);

        wallpaperManager = WallpaperManager.getInstance(this);
        nature1 = findViewById(R.id.nature1);
        nature1.setOnClickListener(this);
        nature2 = findViewById(R.id.nature2);
        nature2.setOnClickListener(this);
        nature3 = findViewById(R.id.nature3);
        nature3.setOnClickListener(this);
        nature4 = findViewById(R.id.nature4);
        nature4.setOnClickListener(this);
        nature5 = findViewById(R.id.nature5);
        nature5.setOnClickListener(this);
        nature6 = findViewById(R.id.nature6);
        nature6.setOnClickListener(this);

        loadWallpaper();
    }
    void loadWallpaper(){
            wallpapers = new int[7];
            wallpapers[0] = R.drawable.nature1;
            wallpapers[1] = R.drawable.nature2;
            wallpapers[2] = R.drawable.nature3;
            wallpapers[3] = R.drawable.nature4;
            wallpapers[4] = R.drawable.nature5;
            wallpapers[5] = R.drawable.nature6;
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
        if (view == nature1){
            ChangeWallpaper(wallpapers[0]);
            return;
        }
        else if (view == nature2){
            ChangeWallpaper(wallpapers[1]);
            return;
        }
        else if (view == nature3){
            ChangeWallpaper(wallpapers[2]);
            return;
        }
        else if (view == nature4){
            ChangeWallpaper(wallpapers[3]);
            return;
        }
        else if (view == nature5){
            ChangeWallpaper(wallpapers[4]);
            return;
        }
        else if (view == nature6){
            ChangeWallpaper(wallpapers[5]);
            return;
        }
        else{
            System.err.println();
        }
    }
}
