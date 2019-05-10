package com.example.pcworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView buildYourPcImageView;
    ImageView preBuiltPCImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        buildYourPcImageView = findViewById(R.id.build_your_pc_imageview);
        preBuiltPCImageView = findViewById(R.id.pre_built_pc_imageview);

        buildYourPcImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BuildYourOwnPc.class));
            }
        });

        preBuiltPCImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PreBuiltPc.class));
            }
        });













    }
}
