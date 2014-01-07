package com.oliver.abc;

import java.util.Hashtable;

public class AlphabetHelper {
	private char[] Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static Hashtable<String, String> AlphaHash;

	public AlphabetHelper() {
		AlphaHash = new Hashtable<String, String>();
		AlphaHash.put("A", "Apple");
		AlphaHash.put("B", "Bread");
		AlphaHash.put("C", "Car");
		AlphaHash.put("D", "Dolphin");
		AlphaHash.put("E", "Elephant");
		AlphaHash.put("F", "Fan");
		AlphaHash.put("G", "Grapes");
		AlphaHash.put("H", "Helicopter");
		AlphaHash.put("I", "Ice Cream");
		AlphaHash.put("J", "Jelly");
		AlphaHash.put("K", "Key");
		AlphaHash.put("L", "Lamp");
		AlphaHash.put("M", "Moon");
		AlphaHash.put("N", "Necktie");
		AlphaHash.put("O", "Ostrich");
		AlphaHash.put("P", "Piano");
		AlphaHash.put("Q", "Quail");
		AlphaHash.put("R", "Rainbow");
		AlphaHash.put("S", "Soap");
		AlphaHash.put("T", "Tree");
		AlphaHash.put("U", "Umbrella");
		AlphaHash.put("V", "Violin");
		AlphaHash.put("W", "Whistle");
		AlphaHash.put("X", "Xylophone");
		AlphaHash.put("Y", "Yo-yo");
		AlphaHash.put("Z", "Zebra");
	}
	
	public String getAlphabetWord(String key)	{
		String retStr = (String) AlphaHash.get(key);
		//invalid key
		if(retStr == null) {
			retStr = "row row row sampan..!!";
		}

		return retStr;
	}

}


/*
if(key.equals("A")) {
	retStr = "Apple";
}
else if(key.equals("B")) {
	retStr = "Bread";
}
else if(key.equals("C")) {
	retStr = "Car";
}
else if(key.equals("D")) {
	retStr = "Dolphin";
}
else if(key.equals("E")) {
	retStr = "Elephant";
}
else if(key.equals("F")) {
	retStr = "Fan";
}
else if(key.equals("G")) {
	retStr = "Grapes";
}
else if(key.equals("H")) {
	retStr = "Helicopter";
}
else if(key.equals("I")) {
	retStr = "Ice Cream";
}
else if(key.equals("J")) {
	retStr = "Jelly";
}
else if(key.equals("K")) {
	retStr = "Key";
}
else if(key.equals("L")) {
	retStr = "Lamp";
}
else if(key.equals("M")) {
	retStr = "Moon";
}
else if(key.equals("N")) {
	retStr = "Necktie";
}
else if(key.equals("O")) {
	retStr = "Ostrich";
}
else if(key.equals("P")) {
	retStr = "Piano";
}
else if(key.equals("Q")) {
	retStr = "Quail";
}
else if(key.equals("R")) {
	retStr = "Rainbow";
}
else if(key.equals("S")) {
	retStr = "Soap";
}
else if(key.equals("T")) {
	retStr = "Tree";
}
else if(key.equals("U")) {
	retStr = "Umbrella";
}
else if(key.equals("V")) {
	retStr = "Violin";
}
else if(key.equals("W")) {
	retStr = "Whistle";
}
else if(key.equals("X")) {
	retStr = "Xylophone";
}
else if(key.equals("Y")) {
	retStr = "Yo-yo";
}
else if(key.equals("Z")) {
	retStr = "Zebra";
}
else {
	retStr = "row row row sampan..!!";
}
*/