package com.niit.datamunger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class DataFileReader {

	BufferedReader bufferedReader;
	String fileName;

	public DataFileReader(String fileName) {
		this.fileName = fileName;
	}

	public String [] getHeader() {
		
		try {
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}

	public String[] getHeaderDataType() {

	
		try {

			
		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}

	public String[] getData() {
		

		return null;
	}
	
	public static boolean isNumeric(String column)
	{
		return false;
	}
}
