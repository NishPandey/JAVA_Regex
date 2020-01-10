package com.dev.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterMatching {

	public static void main(String[] args) {

		Pattern pat = Pattern.compile("\\W\\d{2}\\W\\d{10}"); // for phone numbers
		Matcher mat = pat.matcher("+91-9807600809");
		System.out.println(mat.matches());


		pat = Pattern.compile("\\d{1,31}\\W\\w{3}\\W\\d{2,4}");// not specific
		//pat = Pattern.compile("\\d{1,28}\\-\\w{3}\\-\\d{2,4}");//specific method
		mat = pat.matcher("01-Jan-96"); // for date of birth or hire dates
		System.out.println(mat.matches());


		pat = Pattern.compile("\\w+\\@\\w+\\.\\w+"); // for email id's.
		//pat = Pattern.compile("\\w+\\W\\w+\\W\\w+");// but not more specific
		mat = pat.matcher("Nish123@email.com");
		System.out.println(mat.matches());

		pat = Pattern.compile("\\w+\\s\\w+\\s\\w+"); // for first, middle, and last name
		mat = pat.matcher("Abc Bdfgg Cfhgf");
		System.out.println(mat.matches());

		pat = Pattern.compile("[A-Za-z]{1,20}\\s[A-Za-z]{1,20}"); //for names with limited chars
		mat = pat.matcher("Ivan Shishkin");
		System.out.println(mat.matches());

		pat = Pattern.compile("\\w+\\W+\\w+"); //for alphanumeric passwords
		mat = pat.matcher("afimf#*&4dfgj");
		System.out.println(mat.matches());


	}

}
