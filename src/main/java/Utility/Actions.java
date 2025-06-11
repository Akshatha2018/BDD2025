package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Actions
{
    public static WebDriver driver;
    public static void launchChrome()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
       // DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
      //  desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
    }
    public static void openWebApplication(String url)
    {
        driver.get(url);
    }

}
