package com.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class AppiumConfigurationExample {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException, InterruptedException {
		UiAutomator2Options options = new UiAutomator2Options();

		options.setDeviceName("Phone1");
		options.setApp("D://Project//Appium2//src//test//java//resources//General-Store.apk");

		// Create an AndroidDriver instance
		AndroidDriver driver = new AndroidDriver(new URI("http://0.0.0.0:4723").toURL(), options);

		// Perform your test actions here (e.g., interact with the app)

		// Close the driver session
		Thread.sleep(5000);
		//driver.quit();
	}
}
