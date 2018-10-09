package com.example.habibnurrohman.appberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void open1 (View view){
            Intent intent = new Intent(this, Berita1.class);
            startActivity(intent);
        }

        public void open2 (View view){
            Intent intent = new Intent(this, Berita2.class);
            startActivity(intent);
        }

        public void open3 (View view){
            Intent intent = new Intent(this, Berita3.class);
            startActivity(intent);
        }


}
