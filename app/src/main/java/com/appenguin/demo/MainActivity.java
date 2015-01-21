package com.appenguin.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button toolTipButton = (Button) findViewById(R.id.tooltip_activity);
//        Button trackerButton = (Button) findViewById(R.id.tracker_activity);
//        Button listViewButton = (Button) findViewById(R.id.listview_activity);
    }

    public void startToolTipActivity(View view) {
        Intent intent = new Intent(this, StandardToolTipActivity.class);
        startActivity(intent);
    }

    public void startTrackerActivity(View view) {
        Intent intent = new Intent(this, TrackerActivity.class);
        startActivity(intent);
    }

    public void startListActivity(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

}
