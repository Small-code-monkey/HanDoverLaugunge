package com.handoverlaugunge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.button1)
    Button button1;
    @Bind(R.id.button2)
    Button button2;
    @Bind(R.id.edit_text)
    EditText editText;

    String string;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //获取输入框内容
        string =editText.getText().toString();

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //设置简体
            case R.id.button1:
                string = HanDover.J_Change(string);
                textView.setText(string);
                break;
            //设置繁体
            case R.id.button2:
                string = HanDover.F_Change(string);
                textView.setText(string);
                break;
        }
    }
}
