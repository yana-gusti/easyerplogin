import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


/**
 * Created by asus on 09.02.17.
 */
public class BaseTest {

    public WebDriver driver;
    public String baseUrlLive = "https://live.easyerp.com";
    public String baseUrlDemo = "https://demo.easyerp.com";
    public String email = "yana.gusti@gmail.com";
    public String password = "Julia2011!";


    @BeforeMethod
    public void SetUp(){
//        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
//        ChromeOptions chrome_options = new ChromeOptions();
//        chrome_options.addArguments("--headless");
//        chrome_options.addArguments("--disable-gpu");
//
//        driver = new ChromeDriver(chrome_options);

        System.setProperty("webdriver.chrome.driver", "./drivers/for mac/chromedriver");


        driver = new ChromeDriver();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
        driver.quit();
    }

}
