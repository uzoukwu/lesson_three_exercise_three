package com.example.lesson_three_exercise_three;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    String datasilent = "";
    String dataspeed = "";
    String datavoltage = "";
    String datapower = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String mydata = "<voltage=220,power=3200,speed=0,";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(mydata.split(",")));

        for (String values: list) {
            if (values.equals(list.get(0))){
                datavoltage = list.get(0).replaceAll("[a-zA-Z[^0-9]]","");
            }if (values.equals(list.get(1))){
                datapower = list.get(1).replaceAll("[a-zA-Z[^0-9]]", "");
            }if (values.equals(list.get(2))){
                dataspeed = list.get(2).replaceAll("[a-zA-Z[^0-9]]", "");
            }if (values.equals(list.get(3))) {
                datasilent = list.get(3).replaceAll("[a-zA-Z[^0-9]]", "");
            }
        }

        int voltage = Integer.parseInt(datavoltage);
        int power = Integer.parseInt(datapower);
        int speed = Integer.parseInt(dataspeed);
        int silent_mode = Integer.parseInt(datasilent);


        Log.d("myLog", "" + voltage);
        Log.d("myLog", "" + power);
        Log.d("myLog", "" + speed);
        Log.d("myLog", "" + silent_mode);


    }

}