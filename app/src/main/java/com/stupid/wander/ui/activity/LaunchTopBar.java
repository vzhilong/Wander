package com.stupid.wander.ui.activity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import stupid.com.wander.R;

/**
 * Created by Administrator on 2016/7/7.
 */
public class LaunchTopBar extends View {

    Bitmap mLeftOuterIcon;

    Bitmap mLeftInnerIcon;

    Bitmap mRightInnerIcon;

    Bitmap mRightOuterIcon;

    public LaunchTopBar(Context context) {
        super(context);
        initView();
    }

    public LaunchTopBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    private void initView() {
        mLeftOuterIcon = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        mLeftInnerIcon = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        mRightInnerIcon = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        mRightOuterIcon = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundColor(Color.YELLOW);
        canvas.drawBitmap(mLeftInnerIcon, 0, 0, new Paint());
    }
}
