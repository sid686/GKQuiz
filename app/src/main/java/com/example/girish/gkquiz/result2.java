package com.example.girish.gkquiz;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class result2 extends AppCompatActivity {

    TextView q1_score, q2_score,final_score,q3_score,q4_score,q5_score,q6_score,q7_score,q8_score,q9_score,q10_score;
    int finalscore;
    Button share;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        getSupportActionBar().setTitle("Result");

        share = (Button)findViewById(R.id.share);


        initControls();
        SharedPreferences sharedPreferences = getSharedPreferences("count1",0);
        SharedPreferences.Editor edit= sharedPreferences.edit();
        edit.putBoolean("stop", true);
        edit.apply();

        alertcheck();

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myintent = new Intent(Intent.ACTION_SEND);
                myintent.setType("text/plain");
                String sharebody = "I scored: " + finalscore + " in Test 2, I am challenging you to beat my Score. Download this General Knowledge Quiz app now.";
                String sharesubject = "GENERAL KNOWLEDGE QUIZ";
                myintent.putExtra(Intent.EXTRA_SUBJECT,sharesubject);
                myintent.putExtra(Intent.EXTRA_TEXT,sharebody);
                startActivity(Intent.createChooser(myintent,"Share using"));
            }
        });
    }
    public void onStart(){
        super.onStart();
    }

    public void initControls(){


        q1_score = (TextView)findViewById(R.id.q1_score);
        q2_score = (TextView)findViewById(R.id.q2_score);
        q3_score = (TextView)findViewById(R.id.q3_score);
        q4_score = (TextView)findViewById(R.id.q4_score);
        q5_score = (TextView)findViewById(R.id.q5_score);
        q6_score = (TextView)findViewById(R.id.q6_score);
        q7_score = (TextView)findViewById(R.id.q7_score);
        q8_score = (TextView)findViewById(R.id.q8_score);
        q9_score = (TextView)findViewById(R.id.q9_score);
        q10_score = (TextView)findViewById(R.id.q10_score);




        final_score = (TextView)findViewById(R.id.final_score);



        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(this);


        int q1answer = app_preferences.getInt("answer_11", 0);
        int q2answer = app_preferences.getInt("answer_12", 0);
        int q3answer = app_preferences.getInt("answer_13",0);
        int q4answer = app_preferences.getInt("answer_14",0);
        int q5answer = app_preferences.getInt("answer_15",0);
        int q6answer = app_preferences.getInt("answer_16",0);
        int q7answer = app_preferences.getInt("answer_17",0);
        int q8answer = app_preferences.getInt("answer_18",0);
        int q9answer = app_preferences.getInt("answer_19",0);
        int q10answer = app_preferences.getInt("answer_20",0);

        if ( q1answer == 1 ){
            q1_score.setText("Correct");
        } else if(q1answer ==2){
            q1_score.setText("Incorrect");
        }
        else {
            q1_score.setText("Unattempted");
        }

        if ( q2answer == 1){
            q2_score.setText("Correct");
        } else if(q2answer ==2){

            q2_score.setText("Incorrect ");
        }
        else {
            q2_score.setText("Unattempted ");
        }

        if ( q3answer == 1){
            q3_score.setText("Correct");
        }
        else if(q3answer ==2){

            q3_score.setText("Incorrect ");
        }


        else {
            q3_score.setText("Unattempted ");
        }
        if ( q4answer == 1){
            q4_score.setText("Correct");
        }

        else if(q4answer ==2){

            q4_score.setText("Incorrect ");
        }

        else {
            q4_score.setText("Unattempted ");
        }
        if ( q5answer == 1){
            q5_score.setText("Correct");
        }
        else if(q5answer ==2){

            q5_score.setText("Incorrect ");
        }

        else {
            q5_score.setText("Unattempted ");
        }

        if ( q6answer == 1){
            q6_score.setText("Correct");
        }
        else if(q6answer ==2){

            q6_score.setText("Incorrect ");
        }

        else {
            q6_score.setText("Unattempted ");
        }
        if ( q7answer == 1){
            q7_score.setText("Correct");
        }
        else if(q7answer ==2){

            q7_score.setText("Incorrect ");
        }

        else {
            q7_score.setText("Unattempted ");
        }
        if ( q8answer == 1){
            q8_score.setText("Correct");
        }
        else if(q8answer ==2){

            q8_score.setText("Incorrect ");
        }


        else {
            q8_score.setText("Unattempted ");
        }
        if ( q9answer == 1){
            q9_score.setText("Correct");
        }
        else if(q9answer ==2){

            q9_score.setText("Incorrect ");
        }

        else {
            q9_score.setText("Unattempted ");
        }
        if ( q10answer == 1){
            q10_score.setText("Correct");
        }
        else if(q10answer ==2){

            q10_score.setText("Incorrect ");
        }

        else {
            q10_score.setText("Unattempted ");
        }

        finalscore =  q1answer + q2answer + q3answer + q4answer + q5answer + q6answer + q7answer + q8answer + q9answer + q10answer;
        final_score.setText(finalscore + "/10");
        level2check();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Quit?")
                .setMessage("Do you really want to Quit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(result2.this, category.class);
                        startActivity(intent);
                    }
                }).create().show();

    }

    public void level3(){
        SharedPreferences sharedPreferences = getSharedPreferences("level3",0);
        SharedPreferences.Editor edit= sharedPreferences.edit();
        edit.putBoolean("thirdlevel", true);
        edit.apply();

    }

    public void level2check(){

        if (finalscore >6){

            level3();
        }

    }

    public void alertbox(){

        final Dialog dialog = new Dialog(result2.this);
        dialog.setContentView(R.layout.maindialog);
        dialog.setTitle("This is my custom dialog box");
        dialog.setCancelable(true);
        //there are a lot of settings, for dialog, check them all out!

        final MediaPlayer play = MediaPlayer.create(this,R.raw.music);
        play.start();

        //set up text
        TextView text = (TextView) dialog.findViewById(R.id.TextView01);
        text.setText("Congratulations!!");

        //set up image view
        ImageView img = (ImageView) dialog.findViewById(R.id.ImageView01);
        img.setImageResource(R.drawable.image);

        //set up button
        Button button = (Button) dialog.findViewById(R.id.Button01);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        //now that the dialog is set up, it's time to show it
        dialog.show();
    }

    public void alertcheck(){

        if (finalscore>6){

            alertbox();
        }
    }
}
