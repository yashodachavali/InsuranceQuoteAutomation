package com.comparethemarket.insurance.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenShotUtil {
	private static final String FILE_LOCATION = "./src/test/resources/screenshots/";

	public static void takeScreenShotAndCopy(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		String fileName = FILE_LOCATION + testCaseName + ".jpeg";
		FileUtils.copyFile(file, new File(fileName));
	}
	
	public static void takeScreenShotAndCopyTillElement(String testCaseName, WebDriver driver,WebElement element) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		String fileName = FILE_LOCATION + testCaseName + ".jpeg";
		FileUtils.copyFile(file, new File(fileName));
	}
}
