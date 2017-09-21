import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by asus on 09.02.17.
 */
public class LoginPage extends BaseTest{


        public void loginLive(WebDriver driver, String email, String pass) throws InterruptedException {
                driver.get(baseUrlLive + "/#login");

                Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div/div/input")).click();
        driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div/div/input")).clear();
        driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div/div/input")).sendKeys(email);
                Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='upass']")).click();
        driver.findElement(By.xpath(".//*[@id='upass']")).clear();
        driver.findElement(By.xpath(".//*[@id='upass']")).sendKeys(pass);
                Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='loginTrigger']")).click();
    }
        public void loginDemo(WebDriver driver, String email) throws InterruptedException {
                driver.get(baseUrlDemo + "/#login");
                Thread.sleep(5000);
                driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div/div/input")).click();
                driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div/div/input")).clear();
                driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div/div/input")).sendKeys(email);

                Thread.sleep(5000);
                driver.findElement(By.xpath(".//*[@id='loginTrigger']")).click();
        }

}
