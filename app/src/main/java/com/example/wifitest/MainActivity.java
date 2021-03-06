package com.example.wifitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button button01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button01 = findViewById(R.id.button01);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mainlogin,menu);
        return super.onCreateOptionsMenu(menu);
    }


    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.login:
                Intent main2ActivityIntent = new Intent(MainActivity.this, Login.class);
                startActivity(main2ActivityIntent);
                break;
            case R.id.history:
                Toast.makeText(this, "按下設定", Toast.LENGTH_SHORT).show();
                break;
            default:

        }
        return true;
    }

    public void buttonOnClick(View view) {
        Toast toast = Toast.makeText(this, "進行調飲", Toast.LENGTH_SHORT);
        toast.show();
        Intent main2ActivityIntent = new Intent(MainActivity.this, drink.class);
        startActivity(main2ActivityIntent);
    }
}