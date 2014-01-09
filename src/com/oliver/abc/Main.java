package com.oliver.abc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView.*;
import android.widget.*;

public class Main extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.oliver.abc.ALPHABET";
	private AlphabetHelper alphaHelper = new AlphabetHelper();
	GridView gridView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		/*
		 * super.onCreate(savedInstanceState); setContentView(R.layout.main);
		 */
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		gridView = (GridView) findViewById(R.id.gridView1);

		gridView.setAdapter(new ImageAdapter(this));
		
		gridView.setOnItemClickListener(
		    new OnItemClickListener(){
		        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
		            // display alphabet word
		        	onAlphabetClick(position);
		        }
		    }
		);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onAlphabetClick(int position)
	{
		Intent intent = new Intent(this, DisplayAlphabet.class);
//		Button button = (Button) view;
//		String alphabet = button.getText().toString();
		String alphabet = AlphabetHelper.alphabets[position];
		intent.putExtra(EXTRA_MESSAGE, alphaHelper.getAlphabetWord(alphabet));
		startActivity(intent);
	}

}
