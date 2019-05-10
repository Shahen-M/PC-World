package com.example.pcworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CpuCoolerSearch extends AppCompatActivity {

    RadioButton option1, option2, option3, option4, option5;
    RadioGroup coolerRadioGroup;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);

        return true;
    }//END

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu_cooler_search);


        option1 = findViewById(R.id.cooler_option_1);
        option2 = findViewById(R.id.cooler_option_2);
        option3 = findViewById(R.id.cooler_option_3);
        option4 = findViewById(R.id.cooler_option_4);
        option5 = findViewById(R.id.cooler_option_5);

        coolerRadioGroup = findViewById(R.id.cooler_radio_group);

        // gets cpu that user choose and send value to buildyourown.java
        coolerRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Intent intent = new Intent(CpuCoolerSearch.this, BuildYourOwnPc.class);

                switch(checkedId) {
                    case R.id.cooler_option_1:
                        intent.putExtra("cpu_cooler", option1.getText().toString());
                        startActivity(intent);
                        break;
                    case R.id.cooler_option_2:
                        intent.putExtra("cpu_cooler", option2.getText().toString());
                        startActivity(intent);
                        break;
                    case R.id.cooler_option_3:
                        intent.putExtra("cpu_cooler", option3.getText().toString());
                        startActivity(intent);
                        break;

                    case R.id.cooler_option_4:
                        intent.putExtra("cpu_cooler", option4.getText().toString());
                        startActivity(intent);
                        break;

                    case R.id.cooler_option_5:
                        intent.putExtra("cpu_cooler", option5.getText().toString());
                        startActivity(intent);
                        break;

                }
            }
        });

















    }//END
}
