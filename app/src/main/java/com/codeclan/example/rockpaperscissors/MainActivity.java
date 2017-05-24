package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView chooseText;
    private Button rockButton;
    private Button paperButton;
    private Button scissorsButton;
    private TextView tempAnswer;
    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chooseText = (TextView) findViewById(R.id.choose_text);
        rockButton = (Button) findViewById(R.id.rock_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        tempAnswer = (TextView) findViewById(R.id.temp_answer);
    }

    public void onRockButtonClick(View button){

        game = new Game("rock");
        String result = game.getResults();
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("results",result);
        startActivity(intent);

    }

    public void onPaperButtonClick(View button){

        game = new Game("paper");
        String result = game.getResults();
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("results",result);
        startActivity(intent);
    }

    public void onScissorsButtonClick(View button){

        game = new Game("scissors");
        String result = game.getResults();
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("results",result);
        startActivity(intent);
    }
}
