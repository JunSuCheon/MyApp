package com.example.home.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com") );
        startActivity(intent);
    }

    public void button2(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:911") );
        startActivity(intent);
    }

    public void button3(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media") );
        startActivity(intent);
    }

    public void button4(View v) {
        finish();
    }


}
