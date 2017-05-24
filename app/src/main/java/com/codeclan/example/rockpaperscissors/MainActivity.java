package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClick(View button){

        game = new Game(button.getTag().toString());
        button.getId();
        String result = game.getResults();
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("results",result);
        startActivity(intent);

    }

}
