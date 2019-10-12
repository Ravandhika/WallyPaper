package com.example.wallypaper;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void NatureActivityHandler(View view) {
        Intent intent = new Intent(this, NatureActivity.class);
        startActivity(intent);
    }

    public void AnimalActivityHandler(View view) {
        Intent intent = new Intent(this, AnimalActivity.class);
        startActivity(intent);
    }

    public void GameActivityHandler(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    public void MinimalistActivityHandler(View view) {
        Intent intent = new Intent(this, MinimalistActivity.class);
        startActivity(intent);
    }

    public void Quitbtn(View view) {
        finish();
    }
}
