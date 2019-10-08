package com.example.wallypaper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.wallypaper.Fragments.AboutFragment;

public class MainActivity extends AppCompatActivity {

    private AboutFragment aboutFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        aboutFragment = AboutFragment.newInstance("Adetya Ravandhika");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.menu_about){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, aboutFragment)
                    .addToBackStack(null)
                    .commit();
        }

        return super.onOptionsItemSelected(item);
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
}
