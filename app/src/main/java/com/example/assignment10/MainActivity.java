package com.example.assignment10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    TextView  one,two,boths;
    Button resultbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.number);
        one=findViewById(R.id.no1);
        two=findViewById(R.id.no2);
        boths=findViewById(R.id.no3);
        resultbutton=findViewById(R.id.output);
        resultbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(String.valueOf(number1.getText()));
                if (number < 500) {
                    String three = "", five = "", both = "";
                    for (int i = 1; i <= number; i++) {
                        if (i % 3 == 0) {
                            three = three + " " + i;
                        }
                        if (i % 5 == 0) {
                            five = five + " " + i;
                        }
                        if (i % 3 == 0 && i % 5 == 0) {
                            both = both + " " + i;
                        }
                    }
                    one.setText(three);
                    two.setText(five);
                    boths.setText(both);
                }
                else{
                    one.setText("");
                    two.setText("");
                    boths.setText("");
                    Toast.makeText(MainActivity.this, "Number is too large...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}