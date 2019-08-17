package com.example.whackabird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import static com.example.whackabird.R.drawable.*;

public class Game_Activity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.whackABird.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.application.whackABird.EXTRA_NUMBER";

    public String userName;
    public int result=0;

    private int counter= 30;
    Random random = new Random();

    private TextView miss;
    private TextView score;
    private int scoreCounter=0;
    private int missCounter=0;

    private ImageButton bt1;
    private ImageButton bt2;
    private ImageButton bt3;
    private ImageButton bt4;
    private ImageButton bt5;
    private ImageButton bt6;
    private ImageButton bt7;
    private ImageButton bt8;
    private ImageButton bt9;

    private boolean press1;
    private boolean press2;
    private boolean press3;
    private boolean press4;
    private boolean press5;
    private boolean press6;
    private boolean press7;
    private boolean press8;
    private boolean press9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_);

        Intent myIntent = getIntent();
        userName=myIntent.getStringExtra(MainActivity.EXTRA_TEXT);

        miss=(TextView)findViewById(R.id.miss_text);
        score =(TextView)findViewById(R.id.score_text);

        bt1 = (ImageButton)findViewById(R.id.button_00);
        bt2 = (ImageButton)findViewById(R.id.button_01);
        bt3 = (ImageButton)findViewById(R.id.button_02);
        bt4 = (ImageButton)findViewById(R.id.button_03);
        bt5 = (ImageButton)findViewById(R.id.button_04);
        bt6 = (ImageButton)findViewById(R.id.button_05);
        bt7 = (ImageButton)findViewById(R.id.button_06);
        bt8 = (ImageButton)findViewById(R.id.button_07);
        bt9 = (ImageButton)findViewById(R.id.button_08);

        final TextView count_timer = (TextView) findViewById(R.id.text_timer);

        CountDownTimer SecondsTimer;
        SecondsTimer = new CountDownTimer(30000,1000){

            @Override
            public void onTick(long l) {
                count_timer.setText(String.valueOf(counter));
                counter--;
            }

            @Override
            public void onFinish() {
                //count_timr.setText("Finished");
                showResults();
            }
        };
        SecondsTimer.start();

        CountDownTimer jobTimer;
        jobTimer = new CountDownTimer(30000,500){

            @Override
            public void onTick(long l) {
                doJob();
            }

            @Override
            public void onFinish() {
            }
        };
        jobTimer.start();




        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getApplicationContext(),"1", Toast.LENGTH_LONG).show();
                if(press1){
                    scoreCounter++;
                    UpdateScoreText(scoreCounter);
                    goToSleepButton(1);
                }
                else{
                    missCounter++;
                    UpdateMissText(missCounter);
                }
                press1=false;
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"2", Toast.LENGTH_LONG).show();
                if(press2){
                    scoreCounter++;
                    UpdateScoreText(scoreCounter);
                    goToSleepButton(2);
                }
                else{
                    missCounter++;
                    UpdateMissText(missCounter);
                }
                press2=false;
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"3", Toast.LENGTH_LONG).show();
                if(press3){
                    scoreCounter++;
                    UpdateScoreText(scoreCounter);
                    goToSleepButton(3);
                }
                else{
                    missCounter++;
                    UpdateMissText(missCounter);
                }
                press3=false;
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"4", Toast.LENGTH_LONG).show();
                if(press4){
                    scoreCounter++;
                    UpdateScoreText(scoreCounter);
                    goToSleepButton(4);
                }
                else{
                    missCounter++;
                    UpdateMissText(missCounter);
                }
                press4=false;
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(getApplicationContext(),"5", Toast.LENGTH_LONG).show();
                if(press5){
                    scoreCounter++;
                    UpdateScoreText(scoreCounter);
                    goToSleepButton(5);
                }
                else{
                    missCounter++;
                    UpdateMissText(missCounter);
                }
                press5=false;
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getApplicationContext(),"6", Toast.LENGTH_LONG).show();
                if(press6){
                    scoreCounter++;
                    UpdateScoreText(scoreCounter);
                    goToSleepButton(6);
                }
                else{
                    missCounter++;
                    UpdateMissText(missCounter);
                }
                press6=false;
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"7", Toast.LENGTH_LONG).show();
                if(press7){
                    scoreCounter++;
                    UpdateScoreText(scoreCounter);
                    goToSleepButton(7);
                }
                else{
                    missCounter++;
                    UpdateMissText(missCounter);
                }
                press7=false;
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getApplicationContext(),"8", Toast.LENGTH_LONG).show();
                if(press8){
                    scoreCounter++;
                    UpdateScoreText(scoreCounter);
                    goToSleepButton(8);
                }
                else{
                    missCounter++;
                    UpdateMissText(missCounter);
                }
                press8=false;
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"9", Toast.LENGTH_LONG).show();
                if(press9){
                    scoreCounter++;
                    UpdateScoreText(scoreCounter);
                    goToSleepButton(9);
                }
                else{
                    missCounter++;
                    UpdateMissText(missCounter);
                }
                press9=false;
            }
        });
    }


    public void ResponseTime(final int locate) {
        CountDownTimer showTime;

        showTime = new CountDownTimer(4000,50){

            @Override
            public void onTick(long l) {
                switch (locate){
                    case 0: if(press1==false){onFinish();}
                        break;
                    case 1: if(press2==false){onFinish();}
                        break;
                    case 2: if(press3==false){onFinish();}
                        break;
                    case 3: if(press4==false){onFinish();}
                        break;
                    case 4: if(press5==false){onFinish();}
                        break;
                    case 5: if(press6==false){onFinish();}
                        break;
                    case 6: if(press7==false){onFinish();}
                        break;
                    case 7: if(press8==false){onFinish();}
                        break;
                    case 8: if(press9==false){onFinish();}
                        break;
                }
            }

            @Override
            public void onFinish() {
                // didn't press the putton
                goToSleepButton(locate);
            }
        };
        showTime.start();
    }

    public void doJob() {
        int number = random.nextInt(5);

        for(int i=0; i<number; i++){
            int locate = random.nextInt(10);
            wakeButton(locate);
        }
    }

    public void wakeButton(int locate) {
        switch (locate){
            case 0: bt1.setImageResource(bird2); press1=true;
                break;
            case 1: bt2.setImageResource(bird2); press2=true;
                break;
            case 2: bt3.setImageResource(bird2); press3=true;
                break;
            case 3: bt4.setImageResource(bird2); press4=true;
                break;
            case 4: bt5.setImageResource(bird2); press5=true;
                break;
            case 5: bt6.setImageResource(bird2); press6=true;
                break;
            case 6: bt7.setImageResource(bird2); press7=true;
                break;
            case 7: bt8.setImageResource(bird2); press8=true;
                break;
            case 8: bt9.setImageResource(bird2); press9=true;
                break;
                default: bt1.setImageResource(bird2); press1=true;
                break;
        }
        ResponseTime(locate);
    }

    public void goToSleepButton(int locate){
        switch (locate){
            case 0: bt1.setImageResource(round_button); press1=false;
                break;
            case 1: bt2.setImageResource(round_button); press2=false;
                break;
            case 2: bt3.setImageResource(round_button); press3=false;
                break;
            case 3: bt4.setImageResource(round_button); press4=false;
                break;
            case 4: bt5.setImageResource(round_button); press5=false;
                break;
            case 5: bt6.setImageResource(round_button); press6=false;
                break;
            case 6: bt7.setImageResource(round_button); press7=false;
                break;
            case 7: bt8.setImageResource(round_button); press8=false;
                break;
            case 8: bt9.setImageResource(round_button); press9=false;
                break;
        }
    }

    public void UpdateScoreText(int newScore){
        if(newScore==30){
            result=1;
            Intent intent  = new Intent(this,Status_Game.class);
            intent.putExtra(EXTRA_TEXT,userName);
            intent.putExtra(EXTRA_NUMBER,result);
            startActivity(intent);
            //stopGame(1);
            return;
        }
        score.setText("Score: "+scoreCounter);
    }

    public void UpdateMissText(int newMiss){
        if(newMiss==3){
            Intent intent  = new Intent(this,Status_Game.class);
            intent.putExtra(EXTRA_TEXT,userName);
            intent.putExtra(EXTRA_NUMBER,result);
            startActivity(intent);
            //stopGame(0);
            return;
        }
        miss.setText("Miss: "+missCounter);
    }
    public void showResults(){
        Intent intent  = new Intent(this,Status_Game.class);
        intent.putExtra(EXTRA_TEXT,userName);
        intent.putExtra(EXTRA_NUMBER,result);
        startActivity(intent);
    }

}
