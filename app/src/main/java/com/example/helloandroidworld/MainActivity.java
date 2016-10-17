package com.example.helloandroidworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.tv);
        LinearLayout linear1, linear2;

        linear1 = (LinearLayout) findViewById(R.id.linear1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);

        String lang = getResources().getConfiguration().locale.getLanguage();

        switch (lang){
            case "pl":
                textView.setText(R.string.helloPL);
                linear1.setBackgroundColor(getResources().getColor(R.color.plup));
                linear2.setBackgroundColor(getResources().getColor(R.color.pldown));
                break;
            case "uk":
                textView.setText(R.string.helloUK);
                linear1.setBackgroundColor(getResources().getColor(R.color.Ukrainup));
                linear2.setBackgroundColor(getResources().getColor(R.color.UkrainDown));
                break;
            case "en":
                textView.setText(R.string.hello);
                break;
        }

        Toast.makeText(MainActivity.this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(MainActivity.this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(MainActivity.this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(MainActivity.this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(MainActivity.this, "onStart", Toast.LENGTH_SHORT).show();
    }
}
