package com.vlccinstitute.ashish.vlcc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Timer scrollTimer = null;
    private TimerTask scrollerSchedule;
    private int scrollPos = 0;
    private HorizontalScrollView horizontalScrollView;
    private int scrollMax;
    private LinearLayout horizontalOuterLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /*  TextView tv= (TextView) findViewById(R.id.about_us);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this, AboutUs.class);
                startActivity(about);
            }
        });*/

        ImageView img = (ImageView)findViewById(R.id.fb);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/Vlcc-Institute-Vaishali-Ghaziabad-480809702094310/?fref=ts"));
                startActivity(intent);
            }
        });
        ImageView img2 = (ImageView)findViewById(R.id.tw);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.twitter.com/institute_vlcc"));
                startActivity(intent);
            }
        });
        ImageView img3 = (ImageView)findViewById(R.id.in);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://in.linkedin.com/in/vlccgzb"));
                startActivity(intent);
            }
        });
        Button tvr = (Button)findViewById(R.id.coursetype1);
        tvr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regular = new Intent(MainActivity.this, RegularCourse.class);
                startActivity(regular);
            }
        });
        Button tvc = (Button)findViewById(R.id.coursetype2);
        tvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent correspondence = new Intent(MainActivity.this, Correspondence.class);
                startActivity(correspondence);
            }
        });
        Button tvw = (Button)findViewById(R.id.photo_gallery);
        tvw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photo = new Intent(MainActivity.this, PhotoGallery.class);
                startActivity(photo);
            }
        });
        Button tva = (Button)findViewById(R.id.about_us);
        tva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this, AboutUs.class);
                startActivity(about);
            }
        });
        Button tvws = (Button)findViewById(R.id.workshops);
        tvws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent workshop = new Intent(MainActivity.this, Workshop.class);
                startActivity(workshop);
            }
        });

        horizontalScrollView = (HorizontalScrollView) findViewById(R.id.hsv);
        horizontalOuterLayout = (LinearLayout) findViewById(R.id.innerLay);

        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        ViewTreeObserver vto =horizontalOuterLayout.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                horizontalScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                getScrollMaxAmount();
                startAutoScrolling();
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void getScrollMaxAmount(){
        int actualWidth = (horizontalOuterLayout.getMeasuredWidth() - 512);
        scrollMax = actualWidth;
    }
    public void startAutoScrolling(){
        if(scrollTimer == null){
            scrollTimer = new Timer();
            final Runnable Timer_Tick = new Runnable() {
                @Override
                public void run() {
                    moveScrollView();
                }
            };
            if(scrollerSchedule != null){
                scrollerSchedule.cancel();
                scrollerSchedule = null;
            }
            scrollerSchedule = new TimerTask() {
                @Override
                public void run() {
                        runOnUiThread(Timer_Tick);
                    }
                };
            scrollTimer.schedule(scrollerSchedule, 30, 30);
            }
        }
    public void moveScrollView(){
        scrollPos = (int) (horizontalScrollView.getScrollX() + 1.0);
        if(scrollPos >= scrollMax){
            scrollPos = 0;
        }

        horizontalScrollView.scrollTo(scrollPos,0);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.photo_gallery) {
            Intent photo = new Intent(this,PhotoGallery.class);
            startActivity(photo);
        } /*else if (id == R.id.skill_development) {
            Intent skill = new Intent(this, SkillDevelopment.class);
            startActivity(skill);

        }*/ else if (id == R.id.contact_us) {
            Intent contact = new Intent(this, ContactUs.class);
            startActivity(contact);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

