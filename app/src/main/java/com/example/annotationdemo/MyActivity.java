package com.example.annotationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.annotation.BindId;
import com.example.annotation.BindView;
import com.example.annotation.SkipPager;
import com.example.arouter_annotation.ARouter;
import com.pu.dataBinding.FindViewUtil;;

@ARouter(path = "/my/MyActivity")
public class MyActivity extends BaseActivity {
    @BindId(id = R.id.tv)
    public TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        FindViewUtil.init_MyActivity(this);
    }
}