package com.course.example.buttonflipper;

//bare bones ViewFlipper. This eaxmple is set up so that
// the view is changed by button click or by setting up
// a time interval for flipping.

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {

    RadioButton radio0;
    RadioButton radio1;
    RadioButton radio2;
    ViewFlipper flip;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Find the views declared in main.xml.
         */
        radio0 = (RadioButton) findViewById(R.id.radio0);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);

        flip = (ViewFlipper) findViewById(R.id.ViewFlipper01);

        //view flipping could be done in intervals as well
        //flip.setFlipInterval(2000);
        //flip.startFlipping();

       //set listeners on radio buttons
        radio0.setOnClickListener(radio_listener);
        radio1.setOnClickListener(radio_listener);
        radio2.setOnClickListener(radio_listener);
    }

    /*
     * Define an OnClickListener that will change the view displayed by
     * the ViewFlipper
     */
    private OnClickListener radio_listener = new OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.radio0:
                    flip.setDisplayedChild(0);
                    break;
                case R.id.radio1:
                    flip.setDisplayedChild(1);
                    break;
                case R.id.radio2:
                    flip.setDisplayedChild(2);
                    break;
            }
        }
    };
}
