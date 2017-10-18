package br.ufrn.eaj.tads.upnavigationexample;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NextB(View v){
        startActivity(new Intent(this, Main2Activity.class));
    }
}
