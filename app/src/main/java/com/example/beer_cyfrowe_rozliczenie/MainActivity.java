package com.example.beer_cyfrowe_rozliczenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.beer_cyfrowe_rozliczenie.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.Jedzenie);
        button1 = (Button) findViewById(R.id.Sluzby);
        button2 = (Button) findViewById(R.id.login);
        button3 = (Button) findViewById(R.id.menu);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSluzby();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJedzenie();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){openMainActivity2();
            }
        });
    }


    public void openSluzby() {
        Intent intent = new Intent(this, Sluzby.class);
        startActivity(intent);
    }

    public void openJedzenie() {
        Intent intent = new Intent(this, Jedzenie.class);
        startActivity(intent);
    }

    public void openLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void openMainActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}