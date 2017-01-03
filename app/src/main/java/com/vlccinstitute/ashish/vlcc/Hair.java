package com.vlccinstitute.ashish.vlcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * Created by 500039306 on 3/21/2016.
 */
public class Hair extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hair);

        TextView tvchd = (TextView)findViewById(R.id.hairtype1);
        tvchd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chd = new Intent(Hair.this, Chd.class);
                startActivity(chd);
            }
        });

        TextView tvachd = (TextView)findViewById(R.id.hairtype2);
        tvachd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent achd = new Intent(Hair.this, Achd.class);
                startActivity(achd);
            }
        });

        TextView tvhair = (TextView)findViewById(R.id.hairtype3);
        tvhair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hair = new Intent(Hair.this, HairDesign.class);
                startActivity(hair);
            }
        });

        TextView tvdiploma = (TextView)findViewById(R.id.hairtype4);
        tvdiploma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diploma = new Intent(Hair.this, DiplomaHair.class);
                startActivity(diploma);
            }
        });
    }
}
