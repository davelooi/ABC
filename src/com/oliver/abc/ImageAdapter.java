package com.oliver.abc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


public class ImageAdapter extends BaseAdapter {
	private Context context;
	private final String[] Alphabets;
 
	public ImageAdapter(Context context) {
		this.context = context;
		Alphabets = AlphabetHelper.alphabets;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return Alphabets.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View gridView;

		if (convertView == null) {

			gridView = new View(context);

			// get layout from mobile.xml
			gridView = inflater.inflate(R.layout.alphabetview, null);

			// set image based on selected text
			ImageView imageView = (ImageView) gridView
					.findViewById(R.id.grid_item_image);

			String alphabet = Alphabets[position];

			if (alphabet.equals("A")) {
				imageView.setImageResource(R.drawable.a);
			} else if (alphabet.equals("B")) {
				imageView.setImageResource(R.drawable.b);
			} else if (alphabet.equals("C")) {
				imageView.setImageResource(R.drawable.c);
			} else if (alphabet.equals("D")) {
				imageView.setImageResource(R.drawable.d);
			} else if (alphabet.equals("E")) {
				imageView.setImageResource(R.drawable.e);
			} else if (alphabet.equals("F")) {
				imageView.setImageResource(R.drawable.f);
			} else if (alphabet.equals("G")) {
				imageView.setImageResource(R.drawable.g);
			} else if (alphabet.equals("H")) {
				imageView.setImageResource(R.drawable.h);
			} else if (alphabet.equals("I")) {
				imageView.setImageResource(R.drawable.i);
			} else if (alphabet.equals("J")) {
				imageView.setImageResource(R.drawable.j);
			} else if (alphabet.equals("K")) {
				imageView.setImageResource(R.drawable.k);
			} else if (alphabet.equals("L")) {
				imageView.setImageResource(R.drawable.l);
			} else if (alphabet.equals("M")) {
				imageView.setImageResource(R.drawable.m);
			} else if (alphabet.equals("N")) {
				imageView.setImageResource(R.drawable.n);
			} else if (alphabet.equals("O")) {
				imageView.setImageResource(R.drawable.o);
			} else if (alphabet.equals("P")) {
				imageView.setImageResource(R.drawable.p);
			} else if (alphabet.equals("Q")) {
				imageView.setImageResource(R.drawable.q);
			} else if (alphabet.equals("R")) {
				imageView.setImageResource(R.drawable.r);
			} else if (alphabet.equals("S")) {
				imageView.setImageResource(R.drawable.s);
			} else if (alphabet.equals("T")) {
				imageView.setImageResource(R.drawable.t);
			} else if (alphabet.equals("U")) {
				imageView.setImageResource(R.drawable.u);
			} else if (alphabet.equals("V")) {
				imageView.setImageResource(R.drawable.v);
			} else if (alphabet.equals("W")) {
				imageView.setImageResource(R.drawable.w);
			} else if (alphabet.equals("X")) {
				imageView.setImageResource(R.drawable.x);
			} else if (alphabet.equals("Y")) {
				imageView.setImageResource(R.drawable.yz);
			} else if (alphabet.equals("Z")) {
				imageView.setImageResource(R.drawable.yz);
			} else {
				imageView.setImageResource(R.drawable.ic_launcher);
			}

		} else {
			gridView = (View) convertView;
		}

		return gridView;
	}

}
