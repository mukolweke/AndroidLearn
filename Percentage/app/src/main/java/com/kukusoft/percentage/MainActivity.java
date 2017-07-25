package com.kukusoft.percentage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button convert;
    EditText percent;
    EditText num_over;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert = (Button)(findViewById(R.id.btn_calc));
        percent = (EditText)(findViewById(R.id.enter_percent));
        num_over = (EditText)(findViewById(R.id.enter_number));
        result = (TextView)(findViewById(R.id.txtDisplay));

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float perc = Float.parseFloat(percent.getText().toString());
                float decimal = perc / 100;
                float total = decimal * Float.parseFloat(num_over.getText().toString());
                result.setText(Float.toString(total));
            }
        });
    }
}
