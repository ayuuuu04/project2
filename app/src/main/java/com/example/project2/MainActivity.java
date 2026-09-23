package com.example.project2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText2;
    RadioButton radio6;
    RadioButton radio7;
    RadioButton radio8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText2=findViewById(R.id.editTextPhone2);
        radio6=findViewById(R.id.radioButton6);
        radio7=findViewById(R.id.radioButton7);
        radio8=findViewById(R.id.radioButton8);
        }

    public void showText(View view) {
        String nophone= editText2.getText().toString();
        String pilih = "";
        if(radio6.isChecked()) {
            pilih = "Telepon Rumah";
        } else if (radio7.isChecked()) {
            pilih = "Handphone";
        } else if (radio8.isChecked()) {
            pilih = "Telepon Kantor";
        }

        android.widget.Toast.makeText(this, "Nomor: " + nophone + "\nTipe: " + pilih, android.widget.Toast.LENGTH_SHORT).show();
    };
    }
