package com.example.pavilion.webster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LauncherActivity extends AppCompatActivity {

    EditText edt_url;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        edt_url=(EditText)findViewById(R.id.edit_url);
        edt_url.setText("https://google.com");
        submit=(Button)findViewById(R.id.btn_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=edt_url.getText().toString();
                Intent intent=new Intent(LauncherActivity.this,MainActivity.class);
                intent.putExtra("URL",url);
                startActivity(intent);
            }
        });
    }


}
