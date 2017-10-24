import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by asus on 09.02.17.
 */
public class LoginPage extends BaseTest{


        public void loginLive(WebDriver driver, String email, String pass) throws InterruptedException {
                driver.get(baseUrlLive + "/#login");

                Thread.sleep(5000);
        driver.findElement(By.className("ulogin")).click();
        driver.findElement(By.className("ulogin")).clear();
        driver.findElement(By.className("ulogin")).sendKeys(email);
                Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='upass']")).click();
        driver.findElement(By.xpath(".//*[@id='upass']")).clear();
        driver.findElement(By.xpath(".//*[@id='upass']")).sendKeys(pass);
                Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='loginTrigger']")).click();
    }
        public void loginDemo(WebDriver driver, String email) throws InterruptedException {
                driver.get(baseUrlDemo + "/#login");
                Thread.sleep(5000);
                driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div/div/input")).click();
                driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div/div/input")).clear();
                driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div/div/input")).sendKeys(email);

                Thread.sleep(2000);
                driver.findElement(By.xpath(".//*[@id='loginTrigger']")).click();
        }

        public void resendVerifyDemo(WebDriver driver) throws InterruptedException {
                driver.get(baseUrlDemo + "/#login");
                Thread.sleep(5000);
                driver.findElement(By.xpath(".//*[@id='forgotPass']")).click();
                driver.findElement(By.xpath(".//*[@id='forgotPassword']/div[1]/div/div/div/input")).click();
                driver.findElement(By.xpath(".//*[@id='forgotPassword']/div[1]/div/div/div/input")).clear();
                driver.findElement(By.xpath(".//*[@id='forgotPassword']/div[1]/div/div/div/input")).sendKeys("easyerptestpro@mailinator.com");
                Thread.sleep(2000);
                driver.findElement(By.xpath(".//*[@id='forgotPassword']/div[2]/a[2]")).click();

                WebDriverWait wait = new WebDriverWait(driver, 5000);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='errorHandler']/div")));
                Assert.assertEquals("Verification link was sent to your email. Please check it", driver.findElement(By.xpath(".//*[@id='errorHandler']/div")).getText());

                driver.get("https://www.mailinator.com/");
                Thread.sleep(5000);
                driver.findElement(By.xpath(".//*[@id='inboxfield']")).click();
                driver.findElement(By.xpath(".//*[@id='inboxfield']")).clear();
                driver.findElement(By.xpath(".//*[@id='inboxfield']")).sendKeys("easyerptestpro@mailinator.com");
                Thread.sleep(2000);
                driver.findElement(By.xpath("html/body/section[1]/div/div[3]/div[2]/div[2]/div[1]/span/button")).click();
                Thread.sleep(2000);

                Assert.assertEquals("New registration", driver.findElement(By.id("inboxpane")).findElement(By.xpath("./li/div/div[4]")).getText());
                Thread.sleep(2000);
                driver.findElement(By.className("all_message-min")).findElement(By.xpath("./div/i[2]")).click();
                driver.findElement(By.xpath(".//*[@id='status_bar']/div[5]/span[3]/i[2]")).click();


        }

        public void forgotPassLive(){
                
        }
}
