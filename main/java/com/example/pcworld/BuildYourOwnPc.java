package com.example.pcworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BuildYourOwnPc extends AppCompatActivity {

    Button cpuBtn, cpuCoolerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_your_own_pc);

        cpuBtn = findViewById(R.id.cpu_btn);
        cpuCoolerBtn = findViewById(R.id.cpu_cooler_btn);



        cpuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildYourOwnPc.this, CpuSearchActivity.class));
            }
        });

        cpuCoolerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildYourOwnPc.this, CpuCoolerSearch.class));
            }
        });

        //set intent values to buttons
        //cpuBtn.setText(getIntent().getStringExtra("cpu"));
        //cpuCoolerBtn.setText(getIntent().getStringExtra("cpu_cooler"));

        Intent intent = getIntent();
        String cpu = intent.getStringExtra ( "cpu");
        String cooler = intent.getStringExtra ( "cpu_cooler");
        cpuBtn.setText(cpu);
        cpuCoolerBtn.setText(cooler);

        Log.d("**********COSONLE LOG:", cpuBtn.getText().toString());
        Log.d("**********COSONLE LOG:", cpuCoolerBtn.getText().toString());





    }// END
}
