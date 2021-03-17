package com.example.scoretracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    ImageButton one;
    ImageButton two;
    ImageButton three;
    ImageButton four;
    ImageButton six;
    Button no_ball;
    Button wide;
    Button out;
    Button Dot;
    //Button details;
    Button UpdateTotalRun,UpdateOver,UpdateWicket;
    EditText editText_TotalRun, editText_TotalWicket,editText_TotalOver;
    TextView TotalRun,TotalWicket,TotalOver,TimeLine,TimeLIneContent;
    int run=0;
    int wicket=0;
    int ball=0;
    double overs=0.0;
    int count=0 ;
    Toolbar toolbar;
    @SuppressLint({"CutPasteId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbarId);
        setSupportActionBar(toolbar);
        one = (ImageButton) findViewById(R.id.button_One);
        two = (ImageButton)findViewById(R.id.button_Two);
        three = (ImageButton)findViewById(R.id.button_Three);
        four = (ImageButton)findViewById(R.id.button_Four);
        six = (ImageButton)findViewById(R.id.button_Six);
        no_ball = findViewById(R.id.button_NoBall);
        wide = findViewById(R.id.button_Wide);
        out =findViewById(R.id.button_Out);
        Dot =findViewById(R.id.button_Dot);

        UpdateTotalRun = findViewById(R.id.button_UpdateTotalRun);
        UpdateWicket = findViewById(R.id.button_UpdateWicket);
        UpdateOver = findViewById(R.id.button_UpdateOver);


        TotalRun = findViewById(R.id.textView_Over);
        TotalWicket = findViewById(R.id.textView_Wicket);
        TotalOver = findViewById(R.id.textView_Over);
        TimeLine = findViewById(R.id.textView_TimeLine);
        TimeLIneContent = findViewById(R.id.textView_TimeLineContent);

        editText_TotalRun = findViewById(R.id.editText_totalRun);
        editText_TotalWicket = findViewById(R.id.editText_Wicket);
        editText_TotalOver = findViewById(R.id.editText_Over);


      //  TimeLIneContent.append("Over 1 :  ");
       // tempOver = 1+(ball/6);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                }
                run = run+1;
                editText_TotalRun.setText(Integer.toString(run));
                ball = ball+1;
                if(ball>0){
                    editText_TotalOver.setText("."+ball);
                    if(ball>=6){
                        int a = ball%6;
                        int result = ball/6;
                        editText_TotalOver.setText(result+"."+a);
                    }
                }
                if(ball%6!=0)
                {
                    count=0;
                }

                TimeLIneContent.append("1 "+" ");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                }
                run = run+2;
                editText_TotalRun.setText(Integer.toString(run));
                ball = ball+1;
                if(ball>0){
                    editText_TotalOver.setText("."+ball);
                    if(ball>=6){
                        int a = ball%6;
                        int result = ball/6;
                        editText_TotalOver.setText(result+"."+a);
                    }
                }
                if(ball%6!=0)
                {
                    count=0;
                }
                TimeLIneContent.append("2 "+" ");


            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                }
                run = run+3;
                editText_TotalRun.setText(Integer.toString(run));
                ball = ball+1;
                if(ball>0){
                    editText_TotalOver.setText("."+ball);
                    if(ball>=6){
                        int a = ball%6;
                        int result = ball/6;
                        editText_TotalOver.setText(result+"."+a);
                    }
                }
                if(ball%6!=0)
                {
                    count=0;
                }
                TimeLIneContent.append("3 "+" ");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                }

                run = run+4;
                editText_TotalRun.setText(Integer.toString(run));
                ball = ball+1;
                if(ball>0){
                    editText_TotalOver.setText("."+ball);
                    if(ball>=6){
                        int a = ball%6;
                        int result = ball/6;
                        editText_TotalOver.setText(result+"."+a);
                    }
                }
                TimeLIneContent.append("4 "+" ");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                }

                run = run+6;
                editText_TotalRun.setText(Integer.toString(run));
                ball = ball+1;
                if(ball>0){
                    editText_TotalOver.setText("."+ball);
                    if(ball>=6){
                        int a = ball%6;
                        int result = ball/6;
                        editText_TotalOver.setText(result+"."+a);
                    }
                }
                if(ball%6!=0)
                {
                    count=0;
                }
                TimeLIneContent.append("6 "+" ");

            }
        });
        no_ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                    count=1;
                }
                if(ball%6!=0){
                    count=0;
                }

                run = run+1;
                editText_TotalRun.setText(Integer.toString(run));
                TimeLIneContent.append("NoBall"+" ");
            }
        });
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                }
                wicket = wicket+1;
                editText_TotalWicket.setText(Integer.toString(wicket));
                ball = ball+1;
                if(ball>0){
                    editText_TotalOver.setText("."+ball);
                    if(ball>=6){
                        int a = ball%6;
                        int result = ball/6;
                        editText_TotalOver.setText(result+"."+a);
                    }
                }
                if(ball%6!=0)
                {
                    count=0;
                }
                TimeLIneContent.append("Out "+" ");

            }
        });
        wide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                    count=1;
                }
                if(ball%6!=0){
                    count=0;
                }
                run = run+1;
                editText_TotalRun.setText(Integer.toString(run));
                TimeLIneContent.append("Wide "+" ");
            }
        });

        Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                }
                ball = ball+1;
                if(ball>0){
                    editText_TotalOver.setText("."+ball);
                    if(ball>=6){
                        int a = ball%6;
                        int result = ball/6;
                        editText_TotalOver.setText(result+"."+a);
                    }
                }
                if(ball%6!=0)
                {
                    count=0;
                }
                TimeLIneContent.append("Dot "+" ");

            }
        });

        UpdateTotalRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  totalRun = editText_TotalRun.getText().toString();
                editText_TotalRun.setText(totalRun);
                try {
                    run = Integer.parseInt(totalRun);
                    TimeLIneContent.append("  SetRun"+run+"  ");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Input Integer",Toast.LENGTH_SHORT).show();
                }
            }
        });

        UpdateWicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totalWicket = editText_TotalWicket.getText().toString();
                editText_TotalWicket.setText(totalWicket);
                try {
                    wicket = Integer.parseInt(totalWicket);
                    TimeLIneContent.append("  SetWic"+wicket+"  ");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Input Integer",Toast.LENGTH_SHORT).show();
                }
            }
        });

        UpdateOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totalOver = editText_TotalOver.getText().toString();
                try {
                    double tover = Double.parseDouble(totalOver);
                    double temp =  tover*10;
                    int a = (int) temp/10;
                    int b = (int)temp%10;
                    ball = (a*6)+b;
                    if(ball>=0){

                        if(ball<=5){
                            editText_TotalOver.setText("."+ball);
                            TimeLIneContent.append("  SetOver "+"."+ball+"  ");
                        }
                        if(ball>=6){
                            int a1 = ball%6;
                            int result = ball/6;
                            editText_TotalOver.setText(result+"."+a1);
                            TimeLIneContent.append("  SetOver "+result+"."+a1+"  ");
                        }

                        if(ball%6==0 && count==0){
                            int tempOver ;
                            tempOver = 1+(ball/6);
                            TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                        }
                    }

                }catch (Exception e){
                    //Toast.makeText(MainActivity.this,"Please Input Integer",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_Item_About_App:
                Toast.makeText(this,"This app is a Score counter",Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_Item_AboutDeveloper:
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                return true;
            case R.id.menu_Item_Card:
                Intent intent1 = new Intent(MainActivity.this,Card.class);
                startActivity(intent1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    public void showPopup(View v){
        PopupMenu popup = new PopupMenu(this,v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.PopUPone:
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                    count=1;
                }
                if(ball%6!=0){
                    count=0;
                }
                run = run+1;
                editText_TotalRun.setText(Double.toString(run));
                TimeLIneContent.append("E1 "+" ");
                return true;
            case R.id.PopUPtwo:
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                    count=1;
                }
                if(ball%6!=0){
                    count=0;
                }
                run = run+2;
                editText_TotalRun.setText(Double.toString(run));
                TimeLIneContent.append("E2 "+" ");
                return true;
            case R.id.PopUPthree:
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                    count=1;
                }
                if(ball%6!=0){
                    count=0;
                }
                run = run+3;
                editText_TotalRun.setText(Double.toString(run));
                TimeLIneContent.append("E3 "+" ");
                return true;

            case R.id.PopUPfour:
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                    count=1;
                }
                if(ball%6!=0){
                    count=0;
                }
                run = run+4;
                editText_TotalRun.setText(Double.toString(run));
                TimeLIneContent.append("E4 "+" ");
                return true;

            case R.id.PopUPfive:
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                    count=1;
                }
                if(ball%6!=0){
                    count=0;
                }
                run = run+5;
                editText_TotalRun.setText(Double.toString(run));
                TimeLIneContent.append("E5 "+" ");
                return true;

            case R.id.PopUPsix:
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                    count=1;
                }
                if(ball%6!=0){
                    count=0;
                }
                run = run+6;
                editText_TotalRun.setText(Double.toString(run));
                TimeLIneContent.append("E6 "+" ");
                return true;
            case R.id.PopOut:
                if(ball%6==0 && count==0){
                    int tempOver ;
                    tempOver = 1+(ball/6);
                    TimeLIneContent.append("\n"+"Over "+tempOver+" :  ");
                    count=1;
                }
                if(ball%6!=0){
                    count=0;
                }
                wicket = wicket+1;
                editText_TotalWicket.setText(Integer.toString(wicket));
                TimeLIneContent.append("  Nb_OUT ");
                return  true;

            default:
                return false;

        }

    }


}

