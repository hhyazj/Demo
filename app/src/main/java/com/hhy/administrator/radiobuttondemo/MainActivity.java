package com.hhy.administrator.radiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup mrg;
    private TextView tv;
    private RadioButton a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrg= (RadioGroup) findViewById(R.id.lunch);
        a= (RadioButton) findViewById(R.id.one);
        b= (RadioButton) findViewById(R.id.two);
        c= (RadioButton) findViewById(R.id.three);
        d= (RadioButton) findViewById(R.id.fore);
        mrg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                // TODO Auto-generated method stub
                    //获取变更后的选中项的ID
                     int radioButtonId = radioGroup.getCheckedRadioButtonId();
                     //根据ID获取RadioButton的实例
                //更新文本内容，以符合选中项
                if(c.isChecked()){
                    tv.setText("right");
                }
                    else
                    tv.setText("error");

                       }


        });
    }
}
