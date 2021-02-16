package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class UtilityPackage {

	public static String getConfig(String value) {

		String file = "./Config.Properties";

		FileInputStream fis;
		Properties pro = new Properties();
		try {
			fis = new FileInputStream(file);
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro.getProperty(value);
	}
	
	public static void main(String[] args) {
		System.out.println(UtilityPackage.getConfig("url"));
		System.out.println(UtilityPackage.getConfig("email"));
		System.out.println(UtilityPackage.getConfig("password"));
	}
}
