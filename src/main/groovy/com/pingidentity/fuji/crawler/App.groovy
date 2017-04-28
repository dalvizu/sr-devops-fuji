package com.pingidentity.fuji.crawler

import java.util.concurrent.TimeUnit
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

class App {

  /**
   * Crawl pingidentity.com, gather a list of unique paths, and then
   * print them all to standard out.
   *
   * This is just enough to get the gradle stuff working and an example of
   * how you'd use a rest client. Create your own object structure as you see
   * fit.
   */
  public static void getUniqueApps() {
    // This is how you can pull a list of links from a page:
    DesiredCapabilities  capabilities = new DesiredCapabilities();
    capabilities.setJavascriptEnabled(true);
    WebDriver driver = new PhantomJSDriver(capabilities);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.pingidentity.com");
    List links = driver.findElements(By.tagName("a"));
    for (def link : links) {
        String href = link.getAttribute('href')
        println href
    }
   
    driver.quit() 
  }
}
