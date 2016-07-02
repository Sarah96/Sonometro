package com.sarah.sonometro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainCrear extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public Button continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_crear);
        //-Button Continuar--
        Button continuar = (Button) findViewById(R.id.button_continuar);

        Spinner spinner = (Spinner) findViewById(R.id.proyecto_spinnerPuntos);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.lista_Puntos, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
    public void ContinuarPunt(View v) {
        switch (v.getId()) {

            case R.id.button_continuar:
                Intent i = new Intent(MainCrear.this, MainPuntos.class);
                startActivity(i);
                break;
        }
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        parent.getItemAtPosition(pos);
        ///
        Spinner spinner = (Spinner) findViewById(R.id.proyecto_spinnerPuntos);
        spinner.setOnItemSelectedListener(this);
       /* switch (pos){
            case 1:

                Toast ta = Toast.makeText(getApplicationContext(), pos, Toast.LENGTH_LONG);
                ta.show();
                break;
            case 2:
                Toast te = Toast.makeText(getApplicationContext(), pos, Toast.LENGTH_LONG);
                te.show();
                break;
            case 3:
                Toast ti = Toast.makeText(getApplicationContext(), pos, Toast.LENGTH_LONG);
                ti.show();
                break;
            case 4:
                Toast to = Toast.makeText(getApplicationContext(), pos, Toast.LENGTH_LONG);
                to.show();
                break;
            case 5:
                Toast tu = Toast.makeText(getApplicationContext(), pos, Toast.LENGTH_LONG);
                tu.show();
                break;

        }*/
        ///
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }








}

