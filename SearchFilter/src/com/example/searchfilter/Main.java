package com.example.searchfilter;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
 
public class Main extends Activity {
 
  private Spinner spinner1, spinner2;
  private Button btnSubmit;
 
  @Override
  public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
	addListenerOnButton();
  }
 
  // get the selected dropdown list value
  public void addListenerOnButton() {
 
	spinner1 = (Spinner) findViewById(R.id.spinner1);
	spinner2 = (Spinner) findViewById(R.id.spinner2);
	spinner2 = (Spinner) findViewById(R.id.spinner3);
	btnSubmit = (Button) findViewById(R.id.btnSubmit);
 
	btnSubmit.setOnClickListener(new OnClickListener() {
 
	  @Override
	  public void onClick(View v) {
 
	    Toast.makeText(Main.this,
                "بعد از کلیک جستجو انجام خواهد شد.",
			Toast.LENGTH_SHORT).show();
	  }
 
	});
  }
}