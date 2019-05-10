package com.example.pcworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CpuSearchActivity extends AppCompatActivity {

    RadioButton option1;
    RadioButton option2;
    RadioButton option3;
    RadioButton option4;
    RadioButton option5;


    // Action bar only
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);

        return true;
    }//END


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu_search);

        RadioGroup radioGroup = findViewById(R.id.cpu_radio_group);

        option1 = findViewById(R.id.cpu_option_1);
        option2 = findViewById(R.id.cpu_option_2);
        option3 = findViewById(R.id.cpu_option_3);
        option4 = findViewById(R.id.cpu_option_4);
        option5 = findViewById(R.id.cpu_option_5);



        // gets cpu that user choose and send value to buildyourown.java
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Intent intent = new Intent(CpuSearchActivity.this, BuildYourOwnPc.class);

                switch(checkedId){
                    case R.id.cpu_option_1:
                        intent.putExtra("cpu", option1.getText().toString());
                        startActivity(intent);
                        break;
                    case R.id.cpu_option_2:
                        intent.putExtra("cpu", option2.getText().toString());
                        startActivity(intent);
                        break;
                    case R.id.cpu_option_3:
                        intent.putExtra("cpu", option3.getText().toString());
                        startActivity(intent);
                        break;

                    case R.id.cpu_option_4:
                        intent.putExtra("cpu", option4.getText().toString());
                        startActivity(intent);
                        break;

                    case R.id.cpu_option_5:
                        intent.putExtra("cpu", option5.getText().toString());
                        startActivity(intent);
                        break;
                }
            }
        });












    }//END
}
