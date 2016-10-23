package com.xavierbauquet.theoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xavierbauquet.theo.DummyAnnotation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forTest();
            }
        });
    }

    @DummyAnnotation
    public void forTest(){
        Log.e("ForTest", "ForTest method has been called");
    }
}
