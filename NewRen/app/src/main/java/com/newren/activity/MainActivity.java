package com.newren.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.newren.R;


public class MainActivity extends Activity {

    Button btnLogin = null;
    Button btnRegister =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin =(Button)findViewById(R.id.btnLogin);
        btnRegister =(Button)findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Toast tst = Toast.makeText(MainActivity.this, "111111111", Toast.LENGTH_SHORT);
                tst.show();*/
                Intent intent = new Intent();
                intent.putExtra("activity", "MainActivity");
                intent.setClass(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }


}
