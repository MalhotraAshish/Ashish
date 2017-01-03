package com.vlccinstitute.ashish.vlcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 500039306 on 3/21/2016.
 */
public class Therapy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.therapy);

        TextView tv1 = (TextView)findViewById(R.id.therapytype1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type1 = new Intent(Therapy.this, TherapyType1.class);
                startActivity(type1);
            }
        });

        TextView tv2 = (TextView)findViewById(R.id.therapytype2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type2 = new Intent(Therapy.this, TherapyType2.class);
                startActivity(type2);
            }
        });

        TextView tv3 = (TextView)findViewById(R.id.therapytype3);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type3 = new Intent(Therapy.this, TherapyType3.class);
                startActivity(type3);
            }
        });

        TextView tv4 = (TextView)findViewById(R.id.therapytype4);
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type4 = new Intent(Therapy.this, TherapyType4.class);
                startActivity(type4);
            }
        });

        TextView tv5 = (TextView)findViewById(R.id.therapytype5);
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type5 = new Intent(Therapy.this, TherapyType5.class);
                startActivity(type5);
            }
        });

        TextView tv6 = (TextView)findViewById(R.id.therapytype6);
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type6 = new Intent(Therapy.this, TherapyType6.class);
                startActivity(type6);
            }
        });

        TextView tv7 = (TextView)findViewById(R.id.therapytype7);
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type7 = new Intent(Therapy.this, TherapyType7.class);
                startActivity(type7);
            }
        });

        TextView tv8 = (TextView)findViewById(R.id.therapytype8);
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type8 = new Intent(Therapy.this, TherapyType8.class);
                startActivity(type8);
            }
        });

        TextView tv9 = (TextView)findViewById(R.id.therapytype9);
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type9 = new Intent(Therapy.this, TherapyType9.class);
                startActivity(type9);
            }
        });

    }
}
