package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions
{
    public static WebDriver driver;
    public static void launchChrome()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void openWebApplication(String url)
    {
        driver.get(url);
    }

}
