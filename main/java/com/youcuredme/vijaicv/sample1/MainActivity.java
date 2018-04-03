package com.youcuredme.vijaicv.sample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;
import java.lang.String;
public class MainActivity extends AppCompatActivity {

    EditText name,col,out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();
        name=findViewById(R.id.name);
        col=findViewById(R.id.college);
        out=findViewById(R.id.out);
    }
    public void toast(View v)
    {
        Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG).show();
    }
    public void display(View v)
    {
        String str=name.getText().toString();
        String str2=col.getText().toString();
        out.setText(str+str2);
    }
}
