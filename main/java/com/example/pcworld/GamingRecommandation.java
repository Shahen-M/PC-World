package com.example.pcworld;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class GamingRecommandation extends AppCompatActivity {

    Button amdBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming_recommandation);

        amdBtn = findViewById(R.id.amd_btn);


        LayoutInflater inflate = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        RelativeLayout layoutLeft = (RelativeLayout) inflate.inflate(
                R.layout.testingfile, null);

        RelativeLayout layoutRight = (RelativeLayout) inflate.inflate(
                R.layout.testingfile2, null);

        RelativeLayout.LayoutParams relParam = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutMain.addView(layoutLeft, 100, 100);
        layoutMain.addView(layoutRight, relParam);



        amdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GamingRecommandation.this, layoutLeft));
            }
        });




    }
}
