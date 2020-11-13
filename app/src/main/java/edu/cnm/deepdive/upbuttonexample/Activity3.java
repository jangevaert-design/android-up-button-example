package edu.cnm.deepdive.upbuttonexample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_3);

    getSupportActionBar().setTitle("Activity 3");
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  }

}
