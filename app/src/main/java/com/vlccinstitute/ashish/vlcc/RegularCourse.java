package com.vlccinstitute.ashish.vlcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 500039306 on 3/21/2016.
 */
public class RegularCourse extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regular_courses);

        TextView cosmetology = (TextView)findViewById(R.id.cosmetology);
        cosmetology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cosmetology = new Intent(RegularCourse.this, Cosmetology.class);
                startActivity(cosmetology);
            }
        });

        TextView hair = (TextView)findViewById(R.id.hair);
        hair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hair = new Intent(RegularCourse.this, Hair.class);
                startActivity(hair);
            }
        });

        TextView makeup = (TextView)findViewById(R.id.makeup);
        makeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent makeup = new Intent(RegularCourse.this, MakeUp.class);
                startActivity(makeup);
            }
        });

        TextView nutrition = (TextView)findViewById(R.id.nutrition);
        nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nutrition = new Intent(RegularCourse.this, Nutrition.class);
                startActivity(nutrition);
            }
        });

        TextView therapy = (TextView)findViewById(R.id.therapy);
        therapy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent therapy = new Intent(RegularCourse.this, Therapy.class);
                startActivity(therapy);
            }
        });

        TextView spa = (TextView)findViewById(R.id.spa);
        spa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spa = new Intent(RegularCourse.this, Spa.class);
                startActivity(spa);
            }
        });
    }
}
