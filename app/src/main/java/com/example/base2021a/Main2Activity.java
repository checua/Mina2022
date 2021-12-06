package com.example.base2021a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main2 );

        Switch mySwitch = findViewById(R.id.switch1);
        mySwitch.setChecked ( true );

        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SharedPreferences sharedpreferences = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("user1", null);
                editor.putString("user2", null);
                editor.apply();

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
            }
        });

        Button btnAlmacen = findViewById ( R.id.btnAlmacen );
        Button btnBitacora = findViewById ( R.id.btnBitacora );
        Button btnManifiesto = findViewById ( R.id.btnManifiesto );
        Button btnReporte = findViewById ( R.id.btnReporte );


        btnAlmacen.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Toast.makeText ( getApplicationContext (), "Almacén", Toast.LENGTH_LONG ).show ();
                Intent intentReg = new Intent ( Main2Activity.this, AlmacenActivity.class );
                startActivity(intentReg);
            }
        } );

        btnBitacora.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Toast.makeText ( getApplicationContext (), "Bitácora", Toast.LENGTH_LONG ).show ();
                Intent intentReg = new Intent ( Main2Activity.this, BitacoraActivity.class );
                startActivity(intentReg);
            }
        } );

        btnManifiesto.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Toast.makeText ( getApplicationContext (), "Manifiesto", Toast.LENGTH_LONG ).show ();
                Intent intentReg = new Intent ( Main2Activity.this, ManifiestoActivity.class );
                startActivity(intentReg);
            }
        } );

        btnReporte.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Toast.makeText ( getApplicationContext (), "Reporte", Toast.LENGTH_LONG ).show ();
                Intent intentReg = new Intent ( Main2Activity.this, AlmacenActivity.class );
                startActivity(intentReg);
            }
        } );

    }
}