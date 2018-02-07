package com.example.jaspering21.password_validator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import javax.xml.validation.Validator;

public class MainActivity extends AppCompatActivity {
    private Button validate;
    private TextView strength;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        validate = (Button) findViewById(R.id.button);
        strength = (TextView) findViewById(R.id.textView);
        password = (EditText) findViewById(R.id.editText);

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String word = password.getText().toString();
                if(word.length()<8||word.equals("password")){
                    strength.setText("Use another password");
                }
                else{
                    if(word.matches("[a-zA-Z0-9!@#$%^&*]*")){
                        //strength.setTextColor(Color.RED);
                        strength.setText("Password Valid");
                    }
                    else {
                        //strength.setTextColor(Color.GREEN);
                        strength.setText("password not strong");
                    }
                }
            }
        }
        );
    }
}
