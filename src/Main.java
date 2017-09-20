import org.testng.annotations.Test;

import java.io.InterruptedIOException;

/**
 * Created by yanagusti on 9/20/17.
 */
public class Main extends BaseTest{

    @Test
    public void correctLogin() throws InterruptedIOException, InterruptedException {

        LoginPage loginPage=new LoginPage();
        loginPage.login(driver,email,password);

    }
}
