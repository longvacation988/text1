package com.example.text1;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //レイアウト設定
        LinearLayout linearLayout = new LinearLayout(this);
        //縦に積み上げていく
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        //要素を中心に寄せる
        linearLayout.setGravity(Gravity.CENTER);
        setContentView(linearLayout);




        
        //タイトル
        TextView title = new TextView(this);
        title.setText("名前を入力してください");
        title.setTextColor(Color.RED);
        title.setTextSize(32.0f);
        title.setPadding(10,10,10,10);
        linearLayout.addView(title,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT));

        



        //文字入力欄作成
        EditText editText=new EditText(this);
        editText.setWidth(800);
        editText.setPadding(10,10,10,10);
        editText.setHeight(300);
        //要素の範囲だけ広げる
        linearLayout.addView(editText,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT));


        //結果作成
        TextView textView=new TextView(this);
        textView.setTextSize(40.0f);
        textView.setPadding(10,10,10,10);
        linearLayout.addView(textView,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT));

        //ボタン作成
        Button button = new Button(this);
        button.setText("hello");
        button.setTextSize(32.0f);
        linearLayout.addView(button,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT));


        //画像設定
        ImageView image2 = new ImageView(this);
        image2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            linearLayout.addView(image2,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT));


        //ボタンを押したときの処理
        button.setOnClickListener( v-> {

            //text変数を用意、入力欄の文字をもらう
            String text = editText.getText().toString();
            //テキスト設置
            textView.setText(text+"さん、こんにちは！");
            //画像設置
            image2.setImageResource(R.drawable.aisatsu2_konnichiwa);
        });
    }

}