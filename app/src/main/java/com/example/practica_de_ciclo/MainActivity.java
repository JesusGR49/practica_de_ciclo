
package com.example.practica_de_ciclo;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrarMensaje("onCreate(): Activity Creada");
    }

    @Override
    protected void onStart(){
        super.onStart();

        mostrarMensaje("onStart(): Activity visible");
    }

    @Override
    protected void onResume(){
        super.onResume();

        mostrarMensaje("onResume(): Activity en primer plano");
    }

    @Override
    protected void onPause(){
        super.onPause();

        mostrarMensaje("onPause(): Activity parcialmente oculta");
    }

    @Override
    protected void onStop(){
        super.onStop();

        mostrarMensaje("onStop(): Activity no visible");
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        mostrarMensaje("onRestart(): Activity Reiniciandose");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        mostrarMensaje("onDestroy(): Activity destruida");
    }

    protected void mostrarMensaje(String mensaje){
        Toast.makeText(
                getApplicationContext(),
                mensaje,
                Toast.LENGTH_LONG
        ).show();
    }


}