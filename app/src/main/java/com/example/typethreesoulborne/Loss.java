package com.example.typethreesoulborne;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Loss extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ini_loss);

        Button back = findViewById(R.id.back1);

        back.setOnClickListener(v -> {
            Intent d = new Intent(Loss.this , MainActivity.class);
            startActivity(d);
        });

    }
}
