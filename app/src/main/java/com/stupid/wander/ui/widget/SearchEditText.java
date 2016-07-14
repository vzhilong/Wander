package com.stupid.wander.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import com.orhanobut.logger.Logger;

/**
 * Created by Administrator on 2016/6/27.
 */
public class SearchEditText extends EditText {

    private String url;

    private String title;

    public SearchEditText(Context context) {
        super(context);
        initView();
    }

    public SearchEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    private void initView() {
        setSingleLine();
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        if (hasWindowFocus) {
            setText(url);
        } else {
            setText(title);
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
        setText(url);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        setText(title);
    }
}
