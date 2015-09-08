package com.kkbruce.androidinfo;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * 获取当前手机设备相关信息
 * @author bruce
 *
 */
public class MainActivity extends Activity implements OnClickListener{
    private Button showBtn;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    
    private void initViews(){
        showBtn = (Button) findViewById(R.id.get_btn);
        mTextView =  (TextView) findViewById(R.id.phone_text);
        showBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mTextView.setText(getPhoneInfo());
    }
    
    private String getPhoneInfo(){
        String phoneInfo = "产品名称："+ Build.PRODUCT;
        phoneInfo += "\nCPU型号:"+Build.HARDWARE;
        phoneInfo += "\nCPU类型1:"+Build.CPU_ABI;
        phoneInfo += "\nCPU类型2:"+Build.CPU_ABI2;
        phoneInfo += "\n标签:"+Build.TAGS;
        phoneInfo += "\n手机型号:"+Build.MODEL;
        phoneInfo += "\nSDK版本:"+Build.VERSION.SDK;
        phoneInfo += "\nSDK版本号:"+Build.VERSION.SDK_INT;
        phoneInfo += "\n系统版本:"+Build.VERSION.RELEASE;
        phoneInfo += "\n设备安卓版本:"+Build.VERSION.RELEASE;
        phoneInfo += "\n设备驱动:"+Build.DEVICE;
        phoneInfo += "\n显示:"+Build.DISPLAY;
        phoneInfo += "\n品牌:"+Build.BRAND;
        phoneInfo += "\n主板:"+Build.BOARD;
        phoneInfo += "\n标识:"+Build.FINGERPRINT;
        phoneInfo += "\nID:"+Build.ID;
        phoneInfo += "\n制造商:"+Build.MANUFACTURER;
        phoneInfo += "\n用户组:"+Build.USER;
        phoneInfo += "\n序列号:"+Build.SERIAL;
        return phoneInfo;
    }

    @Override
    public void onBackPressed() {
        Process.killProcess(Process.myPid());
        super.onBackPressed();
    }
}
