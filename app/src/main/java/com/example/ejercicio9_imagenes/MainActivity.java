package com.example.ejercicio9_imagenes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image1 = findViewById(R.id.imagen1);
        ImageView image2 = findViewById(R.id.imagen2);
        ImageView image3 = findViewById(R.id.imagen3);
        ImageView image4 = findViewById(R.id.imagen4);
        Button btnSalir = findViewById(R.id.btnSalir);

        // Configurar listener para cada imagen
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(R.drawable.cw);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(R.drawable.bb);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(R.drawable.swtj);
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(R.drawable.swte);
            }
        });
        // Botón para cerrar la aplicación
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity(); // Cierra la aplicación y libera los recursos
            }
        });
    }

    // Método para abrir la segunda actividad y pasar el recurso de la imagen
    private void openSecondActivity(int imageResId) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("imageResId", imageResId); // Pasar el ID de la imagen seleccionada
        startActivity(intent);
    }
}