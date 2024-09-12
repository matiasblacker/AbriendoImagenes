package com.example.ejercicio9_imagenes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView selectedImage = findViewById(R.id.selectedImage);
        Button buttonBack = findViewById(R.id.buttonBack);

        // Obtener la imagen pasada desde la primera actividad
        int imageResId = getIntent().getIntExtra("imageResId", -1);
        if (imageResId != -1) {
            selectedImage.setImageResource(imageResId); // Mostrar la imagen seleccionada
        }

        // Botón para volver a la primera actividad
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Volver a la actividad anterior
            }
        });
    }
}