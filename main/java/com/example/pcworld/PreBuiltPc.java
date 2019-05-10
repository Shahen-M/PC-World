package com.example.pcworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreBuiltPc extends AppCompatActivity {

    Button gamingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_built_pc);


        gamingBtn = findViewById(R.id.gaming_button);

        gamingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PreBuiltPc.this, GamingRecommandation.class));
            }
        });












    }
}
