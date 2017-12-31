package com.example.girish.gkquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class category extends AppCompatActivity {

    Button first, second, third, fourth, fifth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportActionBar().setTitle("Test List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        first = (Button) findViewById(R.id.test1);
        second = (Button) findViewById(R.id.test2);
        third = (Button) findViewById(R.id.test3);
        fourth = (Button) findViewById(R.id.test4);
        fifth = (Button) findViewById(R.id.test5);


        check();

        level2();
        level3();
        level4();
        level5();






    }



    public void clearsharepreferencefirst(){
        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(this);
        app_preferences.edit().clear().commit();
    }

    public void check(){
        SharedPreferences sharedPreferences = getSharedPreferences("visiblefirst", 0);
        if (sharedPreferences.getBoolean("firstvisible", false)) {
            first.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    new AlertDialog.Builder(category.this)
                            .setTitle("Really?")
                            .setMessage("Do you want to give test again?")
                            .setNegativeButton(android.R.string.no, null)
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    clearsharepreferencefirst();
                                    Intent intent = new Intent(category.this, firsttest.class);
                                    startActivity(intent);
                                }
                            }).create().show();
                }
            });

        }
        else {

            first.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent = new Intent(category.this, firsttest.class);
                    startActivity(intent);
                }
            });

        }

    }

    public void check2(){
        SharedPreferences sharedPreferences = getSharedPreferences("visiblesecond", 0);
        if (sharedPreferences.getBoolean("secondvisible", false)) {
            second.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    new AlertDialog.Builder(category.this)
                            .setTitle("Really?")
                            .setMessage("Do you want to give test again?")
                            .setNegativeButton(android.R.string.no, null)
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    clearsharepreferencefirst();
                                    Intent intent = new Intent(category.this, secondtest.class);
                                    startActivity(intent);
                                }
                            }).create().show();
                }
            });

        }

        else {

            second.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(category.this, secondtest.class);
                    startActivity(intent);
                }
            });

        }

    }

    public void check3(){
        SharedPreferences sharedPreferences = getSharedPreferences("visiblethird", 0);
        if (sharedPreferences.getBoolean("thirdvisible", false)) {
           third.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    new AlertDialog.Builder(category.this)
                            .setTitle("Really?")
                            .setMessage("Do you want to give test again?")
                            .setNegativeButton(android.R.string.no, null)
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    clearsharepreferencefirst();
                                    Intent intent = new Intent(category.this, thirdtest.class);
                                    startActivity(intent);
                                }
                            }).create().show();
                }
            });

        }

        else {

            third.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(category.this, thirdtest.class);
                    startActivity(intent);
                }
            });
        }

    }


    public void check4(){
        SharedPreferences sharedPreferences = getSharedPreferences("visiblefourth", 0);
        if (sharedPreferences.getBoolean("fourthvisible", false)) {
            fourth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    new AlertDialog.Builder(category.this)
                            .setTitle("Really?")
                            .setMessage("Do you want to give test again?")
                            .setNegativeButton(android.R.string.no, null)
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    clearsharepreferencefirst();
                                    Intent intent = new Intent(category.this, fourthtest.class);
                                    startActivity(intent);
                                }
                            }).create().show();
                }
            });

        }

        else {

            fourth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(category.this, fourthtest.class);
                    startActivity(intent);
                }
            });
        }

    }


    public void check5(){
        SharedPreferences sharedPreferences = getSharedPreferences("visiblefifth", 0);
        if (sharedPreferences.getBoolean("fifthvisible", false)) {
            fifth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    new AlertDialog.Builder(category.this)
                            .setTitle("Really?")
                            .setMessage("Do you want to give test again?")
                            .setNegativeButton(android.R.string.no, null)
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    clearsharepreferencefirst();
                                    Intent intent = new Intent(category.this, fifthtest.class);
                                    startActivity(intent);
                                }
                            }).create().show();
                }
            });

        }

        else {

            fifth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(category.this, fifthtest.class);
                    startActivity(intent);
                }
            });

        }

    }



    public void level2(){
        SharedPreferences sharedPreferences = getSharedPreferences("level2", 0);
        if (sharedPreferences.getBoolean("secondlevel", false)) {

            check2();

        }
        else
        {
            second.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(category.this);
                    builder.setMessage("You are not eligible for second test, first qualify Test 1")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            });



        }

    }

    public void level3(){
        SharedPreferences sharedPreferences = getSharedPreferences("level3", 0);
        if (sharedPreferences.getBoolean("thirdlevel", false)) {

            check3();

        }
        else
        {
            third.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(category.this);
                    builder.setMessage("You are not eligible for second test, first qualify Test 2")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            });



        }

    }

    public void level4(){
        SharedPreferences sharedPreferences = getSharedPreferences("level4", 0);
        if (sharedPreferences.getBoolean("fourthlevel", false)) {

            check4();

        }
        else
        {
            fourth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(category.this);
                    builder.setMessage("You are not eligible for second test, first qualify Test 3")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            });



        }

    }



    public void level5(){
        SharedPreferences sharedPreferences = getSharedPreferences("level5", 0);
        if (sharedPreferences.getBoolean("fifthlevel", false)) {

           check5();

        }
        else
        {
            fifth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(category.this);
                    builder.setMessage("You are not eligible for second test, first qualify Test 4")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            });



        }

    }
}
