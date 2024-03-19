package Test_Suite.First_testing;

import Setup_The_Browsers.Create;
import Setup_The_Browsers.Setupbrowser;
import Setup_The_Browsers.loging_data;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Customers {
    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }
    @Test ( priority = 2 )
    void Logingdata() throws IOException, InterruptedException {
        loging_data loginTest = new loging_data();
        loginTest.loging_data();
        loginTest.loging();
    }
    @Test ( priority = 3 )
    void Shift() throws IOException, InterruptedException{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"collapsible-resource-manager-desktop\"]/div/div[1]/div[1]/div[6]/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]")).click();
    }

    @Test ( priority = 4 )
    void FILL() throws IOException, InterruptedException{
        Thread.sleep(2000);
        String filePath = "Data"; // Replace with the path to your userdata.txt file

        // Read data from the file and store it in a list

        // Read data from the file and store it in a list
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();
        //Name
        driver.findElement(By.id("name-create-customer-text-field")).click();
        driver.findElement(By.id("name-create-customer-text-field")).sendKeys(userData.get(1));

        //Address
        driver.findElement(By.id("address-create-customer-text-field")).click();
        driver.findElement(By.id("address-create-customer-text-field")).sendKeys(userData.get(2));

        //Contact
        driver.findElement(By.id("contact-create-customer-text-field")).click();
        driver.findElement(By.id("contact-create-customer-text-field")).sendKeys(userData.get(3));

        //E-mail
        driver.findElement(By.id("email-create-customer-email-field")).sendKeys(userData.get(4));
    }

    private void sendKeys(String s) {
    }

    @Test ( priority = 5 )
        void create() throws IOException, InterruptedException {
        Create loginTest = new Create();
            loginTest.Create();
            loginTest.create();
        Thread.sleep(5000);

    }
    }


    //@Test ( priority = 5 )
    //void create() throws IOException, InterruptedException{
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/form/div[2]/button[3]")).click();



