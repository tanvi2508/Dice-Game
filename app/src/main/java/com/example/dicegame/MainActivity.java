package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b1;
    ImageView i1,i2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.btVar1);
        t1=(TextView)findViewById(R.id.textView1);
        i1=(ImageView)findViewById(R.id.ivVar1);
        i2=(ImageView)findViewById(R.id.ivVar2);
        final int dice[] = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // generate two random numbers
                // using Random function

                Random random=new Random();
                int num1= random.nextInt(6);
                Random random1=new Random();
                int num2=random.nextInt(6);

                if(num1>num2)
                {
                    t1.setText("Winner is: Player 1");
                }
                else if(num2>num1)
                {
                    t1.setText("Winner is: Player 2");
                }
                else
                {
                    t1.setText("Result: Draw");
                }
                i1.setImageResource(dice[num1]);
                i2.setImageResource(dice[num2]);
            }
        });
    }
}