package com.example.girish.gkquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class firsttest extends AppCompatActivity {

    RadioButton q1a1,q1a2,q1a3,q2a1,q2a2,q2a3, q1a4,q2a4,q3a1,q3a2,q3a3,q3a4,q4a1,q4a2,q4a3,q4a4,q5a1,q5a2,q5a3,q5a4,q6a1,q6a2,q6a3,q6a4,q7a1,q7a2,q7a3,q7a4,q8a1,q8a2,q8a3,q8a4,q9a1,q9a2,q9a3,q9a4,q10a1,q10a2,q10a3,q10a4;
    Button submit;
     CountDownTimer countDownTimer;
     long timertime = 600000;
    TextView countdown;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsttest);
        getSupportActionBar().setTitle("Test 1");
        alert();
        firsttestvisible();


        getSharedPreferences("count", 0).edit().clear().commit();
        q1a2 = (RadioButton)findViewById(R.id.q1a2);
        q1a1 = (RadioButton) findViewById(R.id.q1a1);
        q1a3 = (RadioButton)findViewById(R.id.q1a3);
        q1a4 = (RadioButton)findViewById(R.id.q1a4);
        q2a1 = (RadioButton)findViewById(R.id.q2a1);
        q2a2= (RadioButton)findViewById(R.id.q2a2);
        q2a3= (RadioButton)findViewById(R.id.q2a3);
        q2a4= (RadioButton)findViewById(R.id.q2a4);
        q3a1 = (RadioButton)findViewById(R.id.q3a1);
        q3a2= (RadioButton)findViewById(R.id.q3a2);
        q3a3= (RadioButton)findViewById(R.id.q3a3);
        q3a4= (RadioButton)findViewById(R.id.q3a4);
        q4a1 = (RadioButton)findViewById(R.id.q4a1);
        q4a2= (RadioButton)findViewById(R.id.q4a2);
        q4a3= (RadioButton)findViewById(R.id.q4a3);
        q4a4= (RadioButton)findViewById(R.id.q4a4);
        q5a1 = (RadioButton)findViewById(R.id.q5a1);
        q5a2= (RadioButton)findViewById(R.id.q5a2);
        q5a3= (RadioButton)findViewById(R.id.q5a3);
        q5a4= (RadioButton)findViewById(R.id.q5a4);
        q6a1 = (RadioButton)findViewById(R.id.q6a1);
        q6a2= (RadioButton)findViewById(R.id.q6a2);
        q6a3= (RadioButton)findViewById(R.id.q6a3);
        q6a4= (RadioButton)findViewById(R.id.q6a4);
        q7a1 = (RadioButton)findViewById(R.id.q7a1);
        q7a2= (RadioButton)findViewById(R.id.q7a2);
        q7a3= (RadioButton)findViewById(R.id.q7a3);
        q7a4= (RadioButton)findViewById(R.id.q7a4);
        q8a1 = (RadioButton)findViewById(R.id.q8a1);
        q8a2= (RadioButton)findViewById(R.id.q8a2);
        q8a3= (RadioButton)findViewById(R.id.q8a3);
        q8a4= (RadioButton)findViewById(R.id.q8a4);
        q9a1 = (RadioButton)findViewById(R.id.q9a1);
        q9a2= (RadioButton)findViewById(R.id.q9a2);
        q9a3= (RadioButton)findViewById(R.id.q9a3);
        q9a4= (RadioButton)findViewById(R.id.q9a4);
        q10a1 = (RadioButton)findViewById(R.id.q10a1);
        q10a2= (RadioButton)findViewById(R.id.q10a2);
        q10a3= (RadioButton)findViewById(R.id.q10a3);
        q10a4= (RadioButton)findViewById(R.id.q10a4);


        submit = (Button)findViewById(R.id.submit);
        countdown = (TextView)findViewById(R.id.textView);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firsttest.this,result.class);
                startActivity(intent);
            }
        });

        q1a2.setOnClickListener(listener);
        q1a1.setOnClickListener(listener);
        q1a3.setOnClickListener(listener);
        q1a4.setOnClickListener(listener);
        q2a1.setOnClickListener(listener);
        q2a2.setOnClickListener(listener);
        q2a3.setOnClickListener(listener);
        q2a4.setOnClickListener(listener);
        q3a1.setOnClickListener(listener);
        q3a2.setOnClickListener(listener);
        q3a3.setOnClickListener(listener);
        q3a4.setOnClickListener(listener);
        q4a1.setOnClickListener(listener);
        q4a2.setOnClickListener(listener);
        q4a3.setOnClickListener(listener);
        q4a4.setOnClickListener(listener);
        q5a1.setOnClickListener(listener);
        q5a2.setOnClickListener(listener);
        q5a3.setOnClickListener(listener);
        q5a4.setOnClickListener(listener);
        q6a1.setOnClickListener(listener);
        q6a2.setOnClickListener(listener);
        q6a3.setOnClickListener(listener);
        q6a4.setOnClickListener(listener);
        q7a1.setOnClickListener(listener);
        q7a2.setOnClickListener(listener);
        q7a3.setOnClickListener(listener);
        q7a4.setOnClickListener(listener);
        q8a1.setOnClickListener(listener);
        q8a2.setOnClickListener(listener);
        q8a3.setOnClickListener(listener);
        q8a4.setOnClickListener(listener);
        q9a1.setOnClickListener(listener);
        q9a2.setOnClickListener(listener);
        q9a3.setOnClickListener(listener);
        q9a4.setOnClickListener(listener);
        q10a1.setOnClickListener(listener);
        q10a2.setOnClickListener(listener);
        q10a3.setOnClickListener(listener);
        q10a4.setOnClickListener(listener);


    }

    Button.OnClickListener listener = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(firsttest.this);
            SharedPreferences.Editor editor = app_preferences.edit();

            if (q1a1.isChecked()){
                editor.putInt("answer_value", 1);
            }

            else if (q1a2.isChecked() || q1a3.isChecked() || q1a4.isChecked()){


                editor.putInt("answer_value", 2);
            }


            if (q2a2.isChecked()){
                editor.putInt("answer_valuee", 1);
            }

            else if (q2a1.isChecked() || q2a3.isChecked() || q3a4.isChecked()){


                editor.putInt("answer_valuee", 2);
            }
            if (q3a3.isChecked()){
                editor.putInt("answer_third", 1);
            }

            else if (q3a2.isChecked() || q3a1.isChecked() || q3a4.isChecked()){


                editor.putInt("answer_third", 2);
            }



            if (q4a4.isChecked()){
                editor.putInt("answer_fourth", 1);
            }

            else if (q4a2.isChecked() || q4a3.isChecked() || q4a1.isChecked()){


                editor.putInt("answer_fourth", 2);
            }


            if (q5a1.isChecked()){
                editor.putInt("answer_fifth", 1);
            }

            else if (q5a2.isChecked() || q5a3.isChecked() || q5a4.isChecked()){


                editor.putInt("answer_fifth", 2);
            }


            if (q6a4.isChecked()){
                editor.putInt("answer_sixth", 1);
            }

            else if (q6a2.isChecked() || q6a3.isChecked() || q6a1.isChecked()){


                editor.putInt("answer_sixth", 2);
            }


            if (q7a3.isChecked()){
                editor.putInt("answer_seventh", 1);
            }

            else if (q7a2.isChecked() || q7a1.isChecked() || q7a4.isChecked()){


                editor.putInt("answer_seventh", 2);
            }


            if (q8a4.isChecked()){
                editor.putInt("answer_eighth", 1);
            }

            else if (q8a2.isChecked() || q8a3.isChecked() || q8a1.isChecked()){


                editor.putInt("answer_eighth", 2);
            }
            if (q9a3.isChecked()){
                editor.putInt("answer_ninth", 1);
            }

            else if (q9a2.isChecked() || q9a1.isChecked() || q9a4.isChecked()){


                editor.putInt("answer_ninth", 2);
            }
            if (q10a2.isChecked()){
                editor.putInt("answer_tenth", 1);
            }
            else if (q10a1.isChecked() || q10a3.isChecked() || q10a4.isChecked()){


                editor.putInt("answer_tenth", 2);
            }


            editor.commit();
        }
    };

    private void starttime(){
        countDownTimer = new CountDownTimer(timertime, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                SharedPreferences sharedPreferences = getSharedPreferences("count", 0);
                if (sharedPreferences.getBoolean("stop", false)) {
                    countDownTimer.cancel();
                } else {
                    timertime = millisUntilFinished;
                    updatetime();
                }

            }



            @Override
            public void onFinish() {
                Intent i = new Intent(firsttest.this, result.class);
                startActivity(i);

            }
        }.start();


    }


    public void updatetime()
    {
        int minute = (int) timertime/60000;
        int seconds = (int) timertime%60000/1000;

        String timelefttext;
        timelefttext = ""+minute;
        timelefttext += ":";
        if (seconds<10) timelefttext+="0";
        timelefttext += seconds;
        countdown.setText(timelefttext);

    }
    public void firsttestvisible(){
        SharedPreferences sharedPreferences = getSharedPreferences("visiblefirst",0);
        SharedPreferences.Editor edit= sharedPreferences.edit();
        edit.putBoolean("firstvisible", true);
        edit.apply();

    }

    public void alert(){

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("You will get 10 minutes for this test and cutoff for this test is 6, Press OK to start Quiz")
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        starttime();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }


    @Override
    public void onBackPressed() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you really want to Quit? ")
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        countDownTimer.cancel();
                        Intent intent = new Intent(firsttest.this, result.class);
                        startActivity(intent);
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();


    }
}
