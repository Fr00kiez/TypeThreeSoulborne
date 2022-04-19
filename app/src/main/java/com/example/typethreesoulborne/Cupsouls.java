package com.example.typethreesoulborne;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Cupsouls extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cupsouls);

        Button back = findViewById(R.id.back2);

        back.setOnClickListener(v -> {
            Intent e = new Intent(Cupsouls.this , MainActivity.class);
            startActivity(e);
        });

    }
}
