package com.sarah.sonometro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button crear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button crear = (Button) findViewById(R.id.button_crear);


    }

    public void irsiguiente(View v) {
        switch (v.getId()) {

            case R.id.button_crear:
                Intent i = new Intent(MainActivity.this, MainCrear.class);
                startActivity(i);
                break;
        }
    }




}
