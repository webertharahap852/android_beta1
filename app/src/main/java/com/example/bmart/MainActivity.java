package com.example.bmart;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Metode yang akan dipanggil saat tombol diklik
    public void openMainActivity2(View view) {
        Intent intent = new Intent(this, MainActivity2.class); // Gantilah Main2Activity dengan nama aktivitas yang sesuai
        startActivity(intent);
    }
}
