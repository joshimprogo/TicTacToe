package com.example.joshi.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8;
        Boolean x = true;
        button = (Button) findViewById(R.id.button);
        button_1 = (Button) findViewById(R.id.button1);
        button_2 = (Button) findViewById(R.id.button2);
        button_3 = (Button) findViewById(R.id.button3);
        button_4 = (Button) findViewById(R.id.button4);
        button_5 = (Button) findViewById(R.id.button5);
        button_6 = (Button) findViewById(R.id.button6);
        button_7 = (Button) findViewById(R.id.button7);
        button_8 = (Button) findViewById(R.id.button8);
        Button[] buttons = {button, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (x) {
//                    v.setText
//                    x = !x
//                }
//                button.setClickable(false);
            }
        });


        Log.i("TicTacToe", "Resetting.");
        for (int i = 0; i < 9; i++) {
            buttons[i].setClickable(true);
        }
    }
}
