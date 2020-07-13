package com.appstone.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.tl_main);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//            getSupportActionBar().setDisplayShowTitleEnabled(false); // for not showing the title.
            getSupportActionBar().setTitle("Nextstacks");
        }
    }

    // access_specifier return_type method/function_name (parameters)


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (item.getItemId() == android.R.id.home) {
//            onBackPressed();
//        } else if (item.getItemId() == R.id.action_search) {
//            Toast.makeText(MainActivity.this, "Search is clicked", Toast.LENGTH_LONG).show();
//        }

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;

            case R.id.action_search:
                Toast.makeText(MainActivity.this, "Search is clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.action_logout:
                Toast.makeText(MainActivity.this, "Logout is clicked", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

}