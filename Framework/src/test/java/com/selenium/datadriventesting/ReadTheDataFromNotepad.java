package com.selenium.datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadTheDataFromNotepad
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		Properties propertyobject = new Properties();
		propertyobject.load(fis);
		String browserName = propertyobject.getProperty("browser");
		System.out.println(browserName);
	}
}
