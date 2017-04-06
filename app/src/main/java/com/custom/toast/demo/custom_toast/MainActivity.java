package com.custom.toast.demo.custom_toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*
    1. To create an XML layout for our custom Toast
    2. To inflate the layout using LayoutInflater
    3. To create the Toast and assign it the layout of Custom Toast
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showCustomToast(View v)
    {
        LayoutInflater inflater = getLayoutInflater();
        View appearance = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.root_layout));
        /* 1st parameter is name of the xml, 2nd parameter is id of the layout */

        Toast toast = new Toast(MainActivity.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(appearance);

        toast.show();

    }
}
