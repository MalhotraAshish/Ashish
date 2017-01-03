package com.vlccinstitute.ashish.vlcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 500039306 on 3/21/2016.
 */
public class Nutrition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nutrition);

        TextView tvnc1 = (TextView)findViewById(R.id.nutritiontype1);
        tvnc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nc1 = new Intent(Nutrition.this, NutritionCourse1.class);
                startActivity(nc1);
            }
        });

        TextView tvnc2 = (TextView)findViewById(R.id.nutritiontype2);
        tvnc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nc2 = new Intent(Nutrition.this,NutritionCourse2.class);
                startActivity(nc2);
            }
        });

        TextView tvnc3 = (TextView)findViewById(R.id.nutritiontype3);
        tvnc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nc3 = new Intent(Nutrition.this,NutritionCourse3.class);
                startActivity(nc3);
            }
        });
    }
}
