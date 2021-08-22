package hectorware.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Driver {

    private Driver(){}

    private  static WebDriver driver;

    public static WebDriver get(){

        if (driver == null){
            String browser = ReadConfigurations.get("browser");

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setAcceptInsecureCerts(true);

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.merge(desiredCapabilities);

            switch (browser){

                case "chrome":

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(chromeOptions);
                    break;

                case "firefox":

                    FirefoxOptions options = new FirefoxOptions();
                    options.addPreference("security.tls.version.enable-deprecated", true);
                    options.addPreference("security.tls.version.min", 1);

                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(options);
                    break;

            }
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
