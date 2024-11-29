package com.example.actividad1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);

        EditText etEmail = findViewById(R.id.etEmail);
        Button btnSubmitEmail = findViewById(R.id.btnSubmitEmail);
        Button btnConfigWifi = findViewById(R.id.btnConfigWifi);

        btnConfigWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ForgotPasswordActivity.this, "Abriendo configuración de Wi-Fi...", Toast.LENGTH_SHORT).show();
                openWifiSettings();
            }
        });
    }

    private void openWifiSettings() {
        Intent intent = new Intent(android.provider.Settings.ACTION_WIFI_SETTINGS);
        startActivity(intent);
    }
}