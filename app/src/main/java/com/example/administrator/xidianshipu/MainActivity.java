package com.example.administrator.xidianshipu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zhuguli(View view) {
        Intent intent = new Intent(MainActivity.this, Main1Activity.class);
        startActivity(intent);
    }

    public void xiaweiyi(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    public void bulangni(View view) {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }

    public void tiantianquan(View view) {
        Intent intent = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent);
    }

    public void caomeibuding(View view) {
        Intent intent = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(intent);
    }
}
