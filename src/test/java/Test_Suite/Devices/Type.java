package Test_Suite.Devices;

import Setup_The_Browsers.Create;
import Setup_The_Browsers.Setupbrowser;
import Setup_The_Browsers.loging_data;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Type {
    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }

    @Test ( priority = 3 )
    void Shift() throws IOException, InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]/*[name()='svg'][1]/*[name()='path'][1]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]")).click();
    }
    @Test ( priority = 3 )
    void create_Brand() throws IOException, InterruptedException{
        Thread.sleep(2000);
        String filePath = "Data"; // Replace with the path to your userdata.txt file
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();
        driver.findElement(By.id("name-create-type-text-field")).click();
        driver.findElement(By.id("name-create-type-text-field")).sendKeys(userData.get(32));




    }
    @Test ( priority = 4 )
    void create() throws IOException, InterruptedException {
        Create loginTest = new Create();
        loginTest.Create();
        loginTest.create();
        Thread.sleep(5000);



    }
}
