package com.example.wallypaper;

import androidx.appcompat.app.AppCompatActivity;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class natureClass extends AppCompatActivity implements View.OnClickListener {
    private int[] Wallpaper;

    private ImageView wallpaper1;
    private ImageView wallpaper2;
    private ImageView wallpaper3;
    private ImageView wallpaper4;
    private ImageView wallpaper5;

    private WallpaperManager wallpaperManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nature_layout);

        wallpaperManager = WallpaperManager.getInstance(this);

        wallpaper1 = findViewById(R.id.wallpaper1);
        wallpaper1.setOnClickListener(this);

        wallpaper2 = findViewById(R.id.wallpaper2);
        wallpaper2.setOnClickListener(this);

        wallpaper3 = findViewById(R.id.wallpaper3);
        wallpaper3.setOnClickListener(this);

        wallpaper4 = findViewById(R.id.wallpaper4);
        wallpaper4.setOnClickListener(this);

        wallpaper5 = findViewById(R.id.wallpaper5);
        wallpaper5.setOnClickListener(this);

    }

    void loadWallpaper(){
        Wallpaper = new int[4];
        Wallpaper[0] = R.drawable.jungles;
        Wallpaper[1] = R.drawable.mountains;
        Wallpaper[2] = R.drawable.sands;
        Wallpaper[3] = R.drawable.waterfalls;
        Wallpaper[4] = R.drawable.moon;
    }
    void ChangeWallpaper(int GantiWallpaper){
        try{
            wallpaperManager.setResource(GantiWallpaper);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void onClick(View view) {
        if (view == wallpaper1){
            ChangeWallpaper(Wallpaper[0]);
            return;
        }
        else if (view == wallpaper2){
            ChangeWallpaper((Wallpaper[1]));
            return;
        }
        else if (view == wallpaper3){
            ChangeWallpaper(Wallpaper[2]);
            return;
        }
        else if (view == wallpaper4){
            ChangeWallpaper(Wallpaper[3]);
            return;
        }
        else if (view == wallpaper5){
            ChangeWallpaper(Wallpaper[5]);
            return;
        }
    }
}
