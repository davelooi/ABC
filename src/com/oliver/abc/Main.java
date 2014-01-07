package com.oliver.abc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.oliver.abc.ALPHABET";
	private AlphabetHelper alphaHelper = new AlphabetHelper();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onAlphabetButtonClick(View view)
	{
		Intent intent = new Intent(this, DisplayAlphabet.class);
		Button button = (Button) view;
		String alphabet = button.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, alphaHelper.getAlphabetWord(alphabet));
		startActivity(intent);
	}

}
