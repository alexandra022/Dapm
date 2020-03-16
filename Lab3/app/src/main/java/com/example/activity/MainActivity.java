package com.example.activity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText text = (EditText)findViewById(R.id.editText);
        final EditText password = (EditText)findViewById(R.id.editText3);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueText = text.getText().toString();
                String valuePassword = password.getText().toString();

        if (valueText.equals("student") && valuePassword.equals("12345")) {
            Log.e("-----", "IF");
            Intent i = new Intent(MainActivity.this, FindTheNumberActivity.class);
            startActivity(i);
        } else {

            Log.e("-----", "Pas IF");
        }
                }

        });

    }
}