package com.example.scoretracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Card extends AppCompatActivity {
    TextView textView_Score1, textView_Score2,textViewTimeLineCard;
    EditText editText_score1, editText_score2;
    Button win1,win2,both,confirm;
    int score1=0,score2=0,result1,result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        textView_Score1 = findViewById(R.id.textView_Score1);
        textView_Score2 = findViewById(R.id.textview_Score2);
        textViewTimeLineCard = findViewById(R.id.textView_TimelineCard);
        editText_score1 = findViewById(R.id.editText_Score1);
        editText_score2 = findViewById(R.id.editText_Score2);
        win1 = findViewById(R.id.button_winTeam1);
        win2 = findViewById(R.id.button_winTeam2);
        both = findViewById(R.id.button_winBothTeam);
        confirm = findViewById(R.id.button_Confirm);

        win1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_score1.setEnabled(true);
                editText_score2.setEnabled(true);
                if(score1==0){
                    String ScoreTeam1 = editText_score1.getText().toString();
                   // String ScoreTeam2 = editText_score2.getText().toString();
                    textView_Score1.setText(ScoreTeam1);
                    try {
                        int temp = Integer.parseInt(ScoreTeam1);
                         result1 = score1+temp;
                        score1 =1;
                    }catch (Exception e){
                        Toast.makeText(Card.this,"Integer only",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    try {
                        String scoreString1 = editText_score1.getText().toString();
                        String scoreString2 = editText_score2.getText().toString();
                        int temp = Integer.parseInt(scoreString1);
                        int temp2 = Integer.parseInt(scoreString2);
                         result1 = result1 + temp;
                         result2 = result2 - temp2;
                        String s = String.valueOf(result1);
                        String s2 = String.valueOf(result2);
                        textView_Score1.setText(s);
                        textView_Score2.setText(s2);
                    }catch (Exception e){
                        Toast.makeText(Card.this,"Integer only",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });


        win2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_score1.setEnabled(true);
                editText_score2.setEnabled(true);

                if(score2==0){
                    String ScoreTeam2 = editText_score2.getText().toString();
                   //  String ScoreTeam1 = editText_score2.getText().toString();
                    textView_Score2.setText(ScoreTeam2);
                    try {
                        int temp = Integer.parseInt(ScoreTeam2);
                        result2 = score2+temp;
                        score2 =1;
                    }catch (Exception e){
                        Toast.makeText(Card.this,"Integer only",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    try {
                        String scoreString2 = editText_score2.getText().toString();
                          String scoreString1 = editText_score1.getText().toString();
                        int temp = Integer.parseInt(scoreString2);
                        int temp2 = Integer.parseInt(scoreString1);
                        result2 = result2 + temp;
                        result1 = result1-temp2;
                        String s = String.valueOf(result2);
                        String s2 = String.valueOf(result1);
                        textView_Score2.setText(s);
                        textView_Score1.setText(s2);
                    }catch (Exception e){
                        Toast.makeText(Card.this,"Integer only",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        both.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_score1.setEnabled(true);
                editText_score2.setEnabled(true);
                try {
                    String scoreString2 = editText_score2.getText().toString();
                    String scoreString1 = editText_score1.getText().toString();
                    int temp = Integer.parseInt(scoreString2);
                    int temp2 = Integer.parseInt(scoreString1);
                    result2 = result2 + temp;
                    result1 = result1+temp2;
                    String s = String.valueOf(result2);
                    String s2 = String.valueOf(result1);
                    textView_Score2.setText(s);
                    textView_Score1.setText(s2);
                }catch (Exception e){
                    Toast.makeText(Card.this,"Integer only",Toast.LENGTH_SHORT).show();
                }
            }
        });

confirm.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        editText_score1.setEnabled(false);
        editText_score2.setEnabled(false);
    }
});

    }
}
