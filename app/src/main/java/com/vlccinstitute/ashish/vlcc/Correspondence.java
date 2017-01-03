package com.vlccinstitute.ashish.vlcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 500039306 on 3/21/2016.
 */
public class Correspondence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correspondence);

        TextView tv1 = (TextView)findViewById(R.id.certificate_coursetype1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type1 = new Intent(Correspondence.this, CorrespondenceType1.class);
                startActivity(type1);
            }
        });

        TextView tv2 = (TextView)findViewById(R.id.certificate_coursetype2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type2 = new Intent(Correspondence.this, CorrespondenceType2.class);
                startActivity(type2);
            }
        });

        TextView tv3 = (TextView)findViewById(R.id.certificate_coursetype3);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type3 = new Intent(Correspondence.this, CorrespondenceType3.class);
                startActivity(type3);
            }
        });

        TextView tv4 = (TextView)findViewById(R.id.certificate_coursetype4);
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent type4 = new Intent(Correspondence.this, CorrespondenceType4.class);
                startActivity(type4);
            }
        });

    }
}
