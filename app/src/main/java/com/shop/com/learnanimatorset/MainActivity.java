package com.shop.com.learnanimatorset;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txt);
    }

    //PropertyValuesHolder
    public void onBtn1(View view) {
        PropertyValuesHolder pvh1 = PropertyValuesHolder.ofFloat("translationX",300);
        PropertyValuesHolder pvh2 = PropertyValuesHolder.ofFloat("scaleX",1f,0f,1f);
        PropertyValuesHolder pvh3 = PropertyValuesHolder.ofFloat("scaleY",1f,0f,1f);
        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(txt,pvh1,pvh2,pvh3);
        animator.setDuration(6000).start();
    }

    //AnimatorSet
    public void onBtn2(View view) {
        ObjectAnimator oa1 = ObjectAnimator.ofFloat(txt,"translationX",300);
        ObjectAnimator oa2 = ObjectAnimator.ofFloat(txt,"scaleX",1f,0f,1f);
        ObjectAnimator oa3 = ObjectAnimator.ofFloat(txt,"scaleY",1f,0f,1f);
        AnimatorSet set = new AnimatorSet();
        set.setDuration(6000);
        set.playTogether(oa1,oa2,oa3);
        set.start();

    }
}
