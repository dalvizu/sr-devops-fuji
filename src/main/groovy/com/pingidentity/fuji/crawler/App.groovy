package com.pingidentity.fuji.crawler

import groovyx.net.http.RESTClient
import java.util.Collection;

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
    RESTClient client = new RESTClient("https://www.pingidentity.com")
    def response = client.get( path: "/" )
    def htmlText = response.data.text
    System.out.println(htmlText)
  }
}
