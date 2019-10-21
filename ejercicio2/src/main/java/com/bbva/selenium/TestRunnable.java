package com.bbva.selenium;

import com.bbva.selenium.driver.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class TestRunnable implements Runnable {

    private final String navegador;

    public TestRunnable(final String nav) {
        navegador = nav;
    }

    @Override
    public void run() {
        final long startTime = System.currentTimeMillis();
        WebDriver driver = null;
        try {
            driver = DriverUtil.getDriver(navegador);
        } catch (final MalformedURLException e) {
            System.err.println("Invalid url");
        }
        driver.get("https://www.seleniumhq.org/");

        final WebElement btnProjects = driver.findElement(By.cssSelector("li#menu_projects > a"));

        btnProjects.click();
        final WebElement h2Projects = driver.findElement(By.cssSelector("h2"));
        if (h2Projects.isDisplayed() && h2Projects.getText().equalsIgnoreCase("Selenium Projects")) {
            System.out.println("Projects encontrado en " + ((System.currentTimeMillis() - startTime) / 1000) + " segundos");
        }

        final WebElement btnDownloads = driver.findElement(By.cssSelector("li#menu_download > a"));

        btnDownloads.click();
        final WebElement h2Downloads = driver.findElement(By.cssSelector("h2"));
        if (h2Downloads.isDisplayed() && h2Downloads.getText().equalsIgnoreCase("Downloads")) {
            System.out.println("Downloads encontrado en " + ((System.currentTimeMillis() - startTime) / 1000) + " segundos");
        }


        driver.quit();
    }
}
