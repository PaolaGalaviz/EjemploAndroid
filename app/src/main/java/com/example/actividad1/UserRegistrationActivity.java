package com.example.actividad1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UserRegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        EditText etNombre = findViewById(R.id.etNombre);
        EditText etApellidoPaterno = findViewById(R.id.etApellidoPaterno);
        EditText etApellidoMaterno = findViewById(R.id.etApellidoMaterno);
        EditText etCorreoElectronico = findViewById(R.id.etCorreoElectronico);
        EditText etTelefono = findViewById(R.id.etTelefono);
        EditText etGrado = findViewById(R.id.etGrado);
        EditText etGrupo = findViewById(R.id.etGrupo);
        Button btnEnviarDatos = findViewById(R.id.btnEnviarDatos);

        btnEnviarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etNombre.getText().toString().trim();
                String lastName =etApellidoPaterno.getText().toString().trim();
                String maternalLastName = etApellidoMaterno.getText().toString().trim();
                String email = etCorreoElectronico.getText().toString().trim();
                String phoneNumber = etTelefono.getText().toString().trim();
                String grade = etGrado.getText().toString().trim();
                String group = etGrupo.getText().toString().trim();


                Toast.makeText(UserRegistrationActivity.this, "Datos enviados: \n" +
                        "Nombre: " + etNombre + "\n" +
                        "Apellido Paterno: " + etApellidoPaterno + "\n" +
                        "Apellido Materno: " + etApellidoMaterno+ "\n" +
                        "Correo: " + etCorreoElectronico + "\n" +
                        "Teléfono: " + etTelefono + "\n" +
                        "Grado: " + etGrado + "\n" +
                        "Grupo: " + etGrupo, Toast.LENGTH_LONG).show();
            }
        });
    }
}