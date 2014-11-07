package com.zhou.activity;

import java.util.Calendar;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils.TruncateAt;
import android.text.format.DateFormat;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MarqueeActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		RelativeLayout mMainLayout = new RelativeLayout(this);
		mMainLayout.setBackgroundColor(Color.WHITE);
		View view = new View(this);
		view.setId(12);
		view.setFocusable(false);
		
		MarqueeTextView marquee = new MarqueeTextView(this);
		marquee
				.setText(R.string.goo);
		RelativeLayout.LayoutParams titleParams = new RelativeLayout.LayoutParams(
				300, LayoutParams.WRAP_CONTENT);// dip(275)
		titleParams.addRule(RelativeLayout.CENTER_IN_PARENT);
		//单行显示 
		marquee.setSingleLine(true);
		//显示格式，跑马灯
		marquee.setEllipsize(TruncateAt.MARQUEE);
		//跑马灯重复次数，无线次
		marquee.setMarqueeRepeatLimit(-1);
		marquee.setGravity(Gravity.CENTER_HORIZONTAL);
		//可touch聚焦
		marquee.setFocusableInTouchMode(true);
		marquee.setTextSize(30);
		marquee.setTextColor(Color.BLACK);
		marquee.setBackgroundColor(Color.GRAY);
		marquee.setLayoutParams(titleParams);
		mMainLayout.addView(marquee, titleParams);
		
		setContentView(mMainLayout);
		
	}

}