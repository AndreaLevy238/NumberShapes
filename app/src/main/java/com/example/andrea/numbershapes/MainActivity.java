package com.example.andrea.numbershapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      LinearLayout  linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
      TextView definitions = (TextView) findViewById(R.id.definitions);
      long ANIMATION_DURATION = 1000;
      long ANIMATION_DELAY = 5000;
      linearLayout.setAlpha(0f);
      linearLayout.animate().setDuration(ANIMATION_DURATION).alpha(1f).setStartDelay(ANIMATION_DELAY);
      definitions.animate().setDuration(ANIMATION_DURATION).alpha(0f).setStartDelay(ANIMATION_DELAY);

   }

   public void testNumber(View view)
   {
      EditText editText = (EditText) findViewById(R.id.number);
      TextView answer = (TextView) findViewById(R.id.answer);

      String numberString = editText.getText().toString();
      Log.i("Number Entered", numberString);

      int i = Integer.parseInt(numberString);
      Number myNumber = new Number(i);

      String result = numberString + myNumber.testNumber();
      Log.i("Result", result);

      answer.setText(result);

   }
}
