package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Log.d(tag, "In the onCreate() event");
        Toast.makeText(MainActivity.this,"In the onCreate() event",Toast.LENGTH_LONG).show();
        }
        public void onStart()
        {
            super.onStart();
           // Log.d(tag, "In the onStart() event");
            Toast.makeText(MainActivity.this,"In the onStart() event",Toast.LENGTH_LONG).show();
        }
        public void onRestart()
        {
            super.onRestart();
           // Log.d(tag, "In the onRestart() event");
            Toast.makeText(MainActivity.this,"In the onRestart() event",Toast.LENGTH_LONG).show();
        }
        public void onResume()
        {
            super.onResume();
           // Log.d(tag, "In the onResume() event");
            Toast.makeText(MainActivity.this,"In the onResume() event",Toast.LENGTH_LONG).show();
        }
        public void onPause()
        {
            super.onPause();
           // Log.d(tag, "In the onPause() event");
            Toast.makeText(MainActivity.this,"In the onPause() event",Toast.LENGTH_LONG).show();
        }
        public void onStop()
        {
            super.onStop();
            //Log.d(tag, "In the onStop() event");
            Toast.makeText(MainActivity.this,"In the onStop() event",Toast.LENGTH_LONG).show();
        }
        public void onDestroy()
        {
            super.onDestroy();
            //Log.d(tag, "In the onDestroy() event");
            Toast.makeText(MainActivity.this,"In the onDestroy() event",Toast.LENGTH_LONG).show();
        }
    }




