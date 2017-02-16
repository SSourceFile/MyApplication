package com.example.tinkerfix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnt = (Button) findViewById(R.id.btn);
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BugClass classs = new BugClass();
                String bug = classs.bug();
                Toast.makeText(MainActivity.this, bug, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
