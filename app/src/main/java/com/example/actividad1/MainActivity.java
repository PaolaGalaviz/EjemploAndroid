package com.example.actividad1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnWebPage = findViewById(R.id.btnWebPage);
        Button btnCallPhoneNumber = findViewById(R.id.btnCallPhoneNumber);
        Button btnRegistrationUser = findViewById(R.id.btnRegistrationUser);

        btnWebPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webPage = Uri.parse("http://fic.uas.edu.mx");
                Intent webPageIntent = new Intent(Intent.ACTION_VIEW,webPage);
                startActivity(webPageIntent);
            }
        });


        btnCallPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri phoneNumber = Uri.parse("tel:6675072103");
                Intent phoneNumberIntent = new Intent(Intent.ACTION_DIAL,phoneNumber);
                startActivity(phoneNumberIntent);
            }
        });

        btnRegistrationUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrationUserIntent = new Intent(MainActivity.this, UserRegistrationActivity.class);
                startActivity(registrationUserIntent);
            }
        });

    }
}