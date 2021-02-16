package com.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void getScreenShot(WebDriver driver){
		TakesScreenshot shot = (TakesScreenshot) driver;
		
		File file = shot.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(file, new File("./ScreenShot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
