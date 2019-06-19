package com.bbva.selenium.driver;

import cucumber.api.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Setup {

    public static WebDriver driver;

    @Before
    public void setWebDriver() throws Exception {

        
        final String browser = System.getProperty("browser");
        String width = System.getProperty("width");
        String height = System.getProperty("height");
        String hubIp = System.getenv("HOST_HUB");
        //TODO create remote driver
    }
}
