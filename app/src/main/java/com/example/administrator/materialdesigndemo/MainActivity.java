package com.example.administrator.materialdesigndemo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private Button mButton;
    private EditText edtName,edtPassword;
    private FloatingActionButton mFloatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton= (Button) findViewById(R.id.Snackbar);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(mButton,"你会有女朋友的",Snackbar.LENGTH_SHORT).setAction("点击有惊喜", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"别做梦了",Toast.LENGTH_SHORT).show();
                    }
                }).setActionTextColor(Color.RED).show();
            }
        });
        edtName= (EditText) findViewById(R.id.edt_name);
        edtPassword= (EditText) findViewById(R.id.edt_password);
        mFloatingActionButton= (FloatingActionButton) findViewById(R.id.floatingActionButton);
        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButton.setTextColor(Color.RED);
                Intent intent=new Intent(MainActivity.this,NavigationViewActivitity.class);
                startActivity(intent);
            }
        });
    }
}
