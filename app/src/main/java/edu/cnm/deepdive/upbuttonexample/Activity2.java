package edu.cnm.deepdive.upbuttonexample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
  private Button button2;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_2);

    getSupportActionBar().setTitle("Activity 2");
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    button2 = findViewById(R.id.button2);
    button2.setOnClickListener((v) -> { openActivity2(); });
  }

  public void openActivity2() {
    Intent intent = new Intent(this, Activity3.class);
    startActivity(intent);
  }
}
