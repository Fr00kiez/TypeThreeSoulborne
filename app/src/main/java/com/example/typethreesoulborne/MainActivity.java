package com.example.typethreesoulborne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton share1 = findViewById(R.id.share);
        ImageButton share2 = findViewById(R.id.share1);

        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((Intent.ACTION_SEND));
                intent.putExtra(intent.EXTRA_TEXT, "Do you even praise the sun boy?!");
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent, "Share to :"));
            }
        });

        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((Intent.ACTION_SEND));
                intent.putExtra(intent.EXTRA_TEXT, "Do you even praise the sun boy?!");
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent, "Share to :"));
            }
        });


    }

    public void Dsloss(View view) {
        Intent a = new Intent (MainActivity.this, Loss.class );
        startActivity(a);
    }

    public void Cupsouls(View view) {
        Intent a = new Intent (MainActivity.this, Cupsouls.class );
        startActivity(a);
    }
}