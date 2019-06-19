package com.bbva.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverUtil {

    public static WebDriver getDriver(final String browser) throws MalformedURLException {

        String width = System.getProperty("width");
        String height = System.getProperty("height");
        String hubIp = System.getenv("HOST_HUB");

        //TODO create remote driver
    }

}
