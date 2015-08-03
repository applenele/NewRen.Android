package com.newren.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.newren.R;

public class LoginActivity extends Activity {

    Button btnBack = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnBack = (Button)findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String value = intent.getStringExtra("activity");
                try{
                    intent.setClass(LoginActivity.this, Class.forName("com.newren.activity." + value));
                    startActivity(intent);
                    finish();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = getIntent();
            String value = intent.getStringExtra("activity");
            try{
                intent.setClass(LoginActivity.this, Class.forName("com.newren.activity." + value));
                startActivity(intent);
                finish();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return super.onKeyDown(keyCode, event);
    }


}
