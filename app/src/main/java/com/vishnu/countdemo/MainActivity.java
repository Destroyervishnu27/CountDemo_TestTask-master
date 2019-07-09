package com.vishnu.countdemo;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Vishnu Saini On 09-07-2019.
 *
 * This is the main activity class use to Contact with user
 */

public class MainActivity extends AppCompatActivity {

    /* Object of text view that is use to shwo the text count*/
    private TextView tv_touchCount;
    /* Object of Main layout that is use to get touch event */
    private ConstraintLayout const_mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Initialize the Views */
        initView();
    }

    @Override
    protected void onStart() {
        super.onStart();
        /* Show text count when activity started. */
        showTouchCount();
    }

    private void initView() {
        /* Find ID of views that is use */
        tv_touchCount=(TextView)findViewById(R.id.tv_touchCount);
        const_mainLayout= (ConstraintLayout) findViewById(R.id.const_mainLayout);

        /* On click Listener use to get touch event when user click on application screen. */
        const_mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                
                /* Store touch count -> Just Increase  last store touch count value in over shared preferences.
                * First time the value is 0
                */
               Config.setTouchCount(Config.getTouchCount()+1);

               /* Show touch count after Store the value in shared Preferences.*/
                showTouchCount();
            }
        });
    }

    private void showTouchCount()
    {
        /* Set touch count value get from shared preferences. */
        tv_touchCount.setText(getResources().getString(R.string.touch_count)+" "+Config.getTouchCount());
    }
}
