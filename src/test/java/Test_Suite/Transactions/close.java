package Test_Suite.Transactions;

import Setup_The_Browsers.Create;
import Setup_The_Browsers.Setupbrowser;
import Setup_The_Browsers.loging_data;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static Setup_The_Browsers.Setupbrowser.driver;

public class close {
    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }

    @Test ( priority = 3 )
    void Shift() throws IOException, InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[name()='svg'][1]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/table/tbody/tr/td[14]/div/a[2]")).click();
    }
    @Test ( priority = 4 )
    void FILL() throws IOException, InterruptedException {
        Thread.sleep(3000);
        //Status
        driver.findElement(By.id("status")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"status\"]/option[5]")).click();

        driver.findElement(By.id("password-update-transaction-test12345-text-field")).click();
    }
    @Test ( priority = 5 )
    void create() throws IOException, InterruptedException {
        Create loginTest = new Create();
        loginTest.Create();
        loginTest.create();
        Thread.sleep(5000);
        driver.quit();



    }
}
