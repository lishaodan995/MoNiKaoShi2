package com.example.dell.monikaoshi2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class DonghuaActivity extends AppCompatActivity {

    private ImageView mImage;
    /**
     * 5
     */
    private TextView mDaoJiShi;
    private int a=5;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what==1&&a>0){
                mDaoJiShi.setText(a+"");
                handler.sendEmptyMessageDelayed(1,1000);
                a--;
            }else{
               startActivity(new Intent(DonghuaActivity.this,ViewPagerActivity.class));
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donghua);
        initView();
    }

    private void initView() {
        mImage = (ImageView) findViewById(R.id.image);
        mDaoJiShi = (TextView) findViewById(R.id.daoJiShi);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim);
        mImage.setAnimation(animation);
        handler.sendEmptyMessageDelayed(1,1000);
    }
}
