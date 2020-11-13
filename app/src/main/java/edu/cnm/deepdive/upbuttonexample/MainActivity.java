package edu.cnm.deepdive.upbuttonexample;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  private Button button;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    button = findViewById(R.id.button);
    button.setOnClickListener((v) -> { openActivity2(); });
  }

  public void openActivity2() {
    Intent intent = new Intent(this, Activity2.class);
    startActivity(intent);
  }
}