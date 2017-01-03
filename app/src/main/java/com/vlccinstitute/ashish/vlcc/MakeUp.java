package com.vlccinstitute.ashish.vlcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 500039306 on 3/21/2016.
 */
public class MakeUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makeup);

        TextView tvamu = (TextView)findViewById(R.id.makeuptype1);
        tvamu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amu = new Intent(MakeUp.this, Amu.class);
                startActivity(amu);
            }
        });

        TextView tvpmu = (TextView)findViewById(R.id.makeuptype2);
        tvpmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pmu = new Intent(MakeUp.this,Pmu.class);
                startActivity(pmu);
            }
        });

        TextView tvclassical = (TextView)findViewById(R.id.makeuptype3);
        tvclassical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classical = new Intent(MakeUp.this,Classical.class);
                startActivity(classical);
            }
        });

        TextView tvbridal = (TextView)findViewById(R.id.makeuptype4);
        tvbridal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bridal = new Intent(MakeUp.this,Bridal.class);
                startActivity(bridal);
            }
        });

        TextView tvmedia = (TextView)findViewById(R.id.makeuptype5);
        tvmedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent media = new Intent(MakeUp.this, Media.class);
                startActivity(media);
            }
        });

        TextView tvadvance = (TextView)findViewById(R.id.makeuptype6);
        tvadvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent advance = new Intent(MakeUp.this, AdvanceMakeup.class);
                startActivity(advance);
            }
        });
    }
}
