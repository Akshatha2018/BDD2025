package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class Actions
{
    public static WebDriver driver;
    public static void launchChrome()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run Chrome in headless mode
        options.addArguments("--no-sandbox"); // Necessary for Jenkins and Docker environments
        options.addArguments("--disable-dev-shm-usage");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void openWebApplication(String url)
    {
        driver.get(url);
    }

}
