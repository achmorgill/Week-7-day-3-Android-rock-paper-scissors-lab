package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    private Button gameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        gameButton = (Button) findViewById(R.id.game_button);
    }
    public void onGameButtonClick(View button){

        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);

    }

}
