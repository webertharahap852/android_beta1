package com.example.bmart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
    }

    // Metode yang akan dipanggil saat tombol diklik
    public void openMainActivity2(View view) {
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        if (username.equals("Pengguna") && password.equals("Masuk")) {
            Intent intent = new Intent(this, MainActivity2.class); // Gantilah Main2Activity dengan nama aktivitas yang sesuai
            startActivity(intent);
        } else {
            Toast.makeText(this, "Username dan password salah.", Toast.LENGTH_SHORT).show();
        }
    }
}
