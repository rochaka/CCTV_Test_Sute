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

public class Create_Device {
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
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]")).click();
    }
    @Test ( priority = 3 )
    void fill() throws IOException, InterruptedException{
        Thread.sleep(2000);
        String filePath = "Data"; // Replace with the path to your userdata.txt file
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();
        //Model
        driver.findElement(By.id("name-create-device-text-field")).click();
        driver.findElement(By.id("name-create-device-text-field")).sendKeys(userData.get(39));

        //Brand
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nova\"]/div[2]/div[2]/div[1]/form/div[1]/div/div/div[2]/div[2]/div/div/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/input")).sendKeys(userData.get(40));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]")).click();

        //Device type
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/form/div[1]/div/div/div[3]/div[2]/div/div/select")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/div[6]/input")).sendKeys("test");

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/form/div[1]/div/div/div[3]/div[2]/div/div/select/option[3]")).click();
        //Model number
        driver.findElement(By.id("model_no-create-device-text-field")).click();
        driver.findElement(By.id("model_no-create-device-text-field")).sendKeys(userData.get(41));

        //Warranty months
        driver.findElement(By.id("warranty-create-device-text-field")).click();
        driver.findElement(By.id("warranty-create-device-text-field")).sendKeys(userData.get(42));

        //Description about device*
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/trix-editor[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/trix-editor[1]")).sendKeys(userData.get(43));
    }
    @Test ( priority = 4 )
    void create() throws IOException, InterruptedException {
        Create loginTest = new Create();
        loginTest.Create();
        loginTest.create();
        Thread.sleep(5000);




    }


}
