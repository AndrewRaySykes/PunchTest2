package com.andrewraysykes.punchtest2;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    SharedPreferences mSharedPreferences;
    protected int mCurrentPayPeriodId = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSharedPreferences = getSharedPreferences(PunchConstants.PREFS_NAME, MODE_PRIVATE);
        mSharedPreferences.getInt(PunchConstants.CURRENT_PAY_PERIOD_ID, mCurrentPayPeriodId);

        if (mCurrentPayPeriodId < 1) {
            Intent intent = new Intent(MainActivity.this, PayPeriodEntryActivity.class);
            startActivity(intent);
        } else {
            // TODO: DB should already be active to pull the current pay period for this activity.
        }

        setContentView(R.layout.activity_main);
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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
