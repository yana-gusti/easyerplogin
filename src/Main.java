import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InterruptedIOException;

/**
 * Created by yanagusti on 9/20/17.
 */
public class Main extends BaseTest{

    @Test
    public void correctLoginLive() throws InterruptedIOException, InterruptedException {

        LoginPage loginPage=new LoginPage();
        loginPage.loginLive(driver,email,password);
        Thread.sleep(5000);
        Assert.assertEquals("https://live.easyerp.com/#easyErp/reportsDashboard", driver.getCurrentUrl());

    }

    @Test
    public void correctLoginDemo() throws InterruptedIOException, InterruptedException {

        LoginPage loginPage=new LoginPage();
        loginPage.loginDemo(driver,email);
        Thread.sleep(5000);
        Assert.assertEquals("https://demo.easyerp.com/#easyErp/dashboards", driver.getCurrentUrl());

    }
}
