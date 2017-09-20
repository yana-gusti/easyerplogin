import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


/**
 * Created by asus on 09.02.17.
 */
public class BaseTest {

    public WebDriver driver;
    public String baseUrl = "https://live.easyerp.com";
    public String email = "yana.gusti@gmail.com";
    public String password = "Julia2011!";


    @BeforeMethod
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        chrome_options.addArguments("--disable-gpu");

        driver = new ChromeDriver(chrome_options);
        driver.get(baseUrl + "/#login");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
        driver.quit();
    }

}
