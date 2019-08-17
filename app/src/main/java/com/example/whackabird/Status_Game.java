package com.example.whackabird;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Status_Game extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.whackABird.EXTRA_TEXT";
    public String userName;
    public int results;

    private Button btn_newGame;
    private Button btn_exit;
    private TextView name_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status__game);

        Intent myIntent = getIntent();
        userName=myIntent.getStringExtra(Game_Activity.EXTRA_TEXT);
        results=myIntent.getIntExtra(Game_Activity.EXTRA_NUMBER,0);

        btn_newGame=(Button)findViewById(R.id.btn_new_game);
        btn_exit=(Button)findViewById(R.id.btn_exit);
        name_text=(TextView)findViewById(R.id.the_name) ;

        if(results==0){
            name_text.setText(userName+" ,You Lost:( try again");
        }
        else {
            name_text.setText(userName+" ,You Win:)");
        }

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                returnToMain();
            }
        });
        btn_newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewGameActivity();
            }
        });
    }

    public void returnToMain() {
        Intent intent  = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void openNewGameActivity() {
        Intent intent  = new Intent(this,Game_Activity.class);
        intent.putExtra(EXTRA_TEXT,userName);
        startActivity(intent);
    }
}
