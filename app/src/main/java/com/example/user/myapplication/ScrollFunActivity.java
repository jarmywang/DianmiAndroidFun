package com.example.user.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by User on 2015/9/6.
 */
public class ScrollFunActivity extends Activity {

    String TAG = "ScrollFunActivity";

    PullScrollView scroll_mine;
    View iv_header, dHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_fun);

        scroll_mine = (PullScrollView)findViewById(R.id.scroll_mine);
        iv_header = findViewById(R.id.iv_header);
        dHeader = findViewById(R.id.dHeader);

        dHeader.post(new Runnable() {
            @Override
            public void run() {
                Log.i(TAG, "RelativeLayout.LayoutParams  mw=" + iv_header.getMeasuredWidth() + ", mh=" + iv_header.getMeasuredHeight());
                Log.i(TAG, "RelativeLayout.LayoutParams  w=" + iv_header.getWidth() + ", h=" + iv_header.getHeight());
                dHeader.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, iv_header.getHeight()));
            }
        });

        scroll_mine.setHeader(findViewById(R.id.view_header), findViewById(R.id.iv_header));
    }
}
