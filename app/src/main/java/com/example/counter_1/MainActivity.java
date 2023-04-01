package com.example.counter_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.Num);

    }
    public void onButtonClick(View view) {
        count++;
        textView.setText(Integer.toString(count));
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt("count");
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }
    protected void onPause() {
        super.onPause();
    }
    protected void onRestart() {
        super.onRestart();
    }
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT);
        toast.show();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT);
        toast.show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT);
        toast.show();
        super.onDestroy();
    }
}

