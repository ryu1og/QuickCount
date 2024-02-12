package com.example.count_app;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int count = 0; // カウントの初期値を0に設定
    TextView tv; // TextViewのインスタンス変数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView); // TextViewを初期化
    }

    // カウントを増やすメソッド
    public void plus(View v){
        count++;
        updateTextView();
    }

    // カウントを減らすメソッド
    public void minusOne(View v){
        count--;
        updateTextView();
    }

    // カウントを2倍にするメソッド
    public void doubleCount(View v){
        count *= 2;
        updateTextView();
    }

    // カウントをリセットするメソッド
    public void clear(View v){
        count = 0;
        updateTextView();
    }

    // TextViewのテキストと色を更新するメソッド
    private void updateTextView() {
        tv.setText(String.valueOf(count));
        if (count >= 10) {
            tv.setTextColor(Color.RED);
        } else if (count <= -10) {
            tv.setTextColor(Color.BLUE);
        } else {
            tv.setTextColor(Color.BLACK);
        }
    }
}
