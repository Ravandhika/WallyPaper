package com.example.wallypaper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.wallypaper.Fragments.AboutFragment;

public class MainActivity extends AppCompatActivity {

    private AboutFragment aboutFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        aboutFragment = AboutFragment.newInstance("Adetya Ravandhika");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
