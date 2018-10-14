package com.example.dell.activitylifecycleexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMessage("onCreate State");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage("onStart State"  );
    }

    @Override
    protected void onResume() {
        super.onResume();
        showMessage("onResume State");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showMessage("onPause State");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showMessage("onStop State");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showMessage("onRestart State");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        showMessage("onDestroy State");
    }

    private void showMessage(String message){
        Toast.makeText(this, ""+message, Toast.LENGTH_SHORT).show();
        Log.i("Life Cycle State", message);
    }

    public void goSecondActivity(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
