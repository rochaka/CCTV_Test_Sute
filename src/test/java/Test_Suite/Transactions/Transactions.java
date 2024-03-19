package Test_Suite.Transactions;

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

public class Transactions {
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
    void Shift() throws IOException, InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[name()='svg'][1]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/a")).click();
    }
    @Test ( priority = 4 )
    void FILL() throws IOException, InterruptedException {
        Thread.sleep(5000);
        String filePath = "Data"; // Replace with the path to your userdata.txt file
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();
        //Invoice number
        driver.findElement(By.id("invoice_id-create-transaction-text-field")).click();
        driver.findElement(By.id("invoice_id-create-transaction-text-field")).sendKeys(userData.get(65));

        //Project name
        driver.findElement(By.id("invoice_name-create-transaction-text-field")).click();
        driver.findElement(By.id("invoice_name-create-transaction-text-field")).sendKeys(userData.get(66));
        //Customer name
        driver.findElement(By.xpath("//*[@id=\"nova\"]/div[2]/div[2]/div[1]/form/div[1]/div/div/div[3]/div[2]/div/div/div")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[6]/input[1]")).sendKeys(userData.get(67));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();

        ///Description
        driver.findElement(By.id("description-create-transaction-textarea-field")).click();
        driver.findElement(By.id("description-create-transaction-textarea-field")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("description-create-transaction-textarea-field")).sendKeys(userData.get(66));

        //Warranty
        driver.findElement(By.xpath("//*[@id=\"nova\"]/div[2]/div[2]/div[1]/form/div[1]/div/div/div[7]/div[2]/div/div/div")).click();
        driver.findElement(By.xpath("/html/body/div[7]/input")).sendKeys(userData.get(67));
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();

        //Service
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/form/div[1]/div/div/div[8]/div[2]/div/div/div")).click();
        driver.findElement(By.xpath("/html/body/div[8]/input")).sendKeys(userData.get(68));
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[8]/div/div[1]")).click();

        //Labour Cost
        driver.findElement(By.id("labour_cost-default-text-field")).click();
        driver.findElement(By.id("labour_cost-default-text-field")).sendKeys(userData.get(69));

        //Transport Cost
        driver.findElement(By.id("transport_cost-default-text-field")).click();
        driver.findElement(By.id("transport_cost-default-text-field")).sendKeys(userData.get(70));

        //Other Cost
        driver.findElement(By.id("other_cost-default-text-field")).click();
        driver.findElement(By.id("other_cost-default-text-field")).sendKeys(userData.get(71));

        //Status
        //driver.findElement(By.id("status")).click();
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"status\"]/option[4]")).click();

        ////Invoice password
        driver.findElement(By.id("password-create-transaction-text-field")).click();
        driver.findElement(By.id("password-create-transaction-text-field")).sendKeys(userData.get(72));
    }
    @Test ( priority = 5 )
    void addDevices() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String filePath = "Data"; // Replace with the path to your userdata.txt file
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();

        //Add Devices/ Button
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[15]/div[2]/div[1]/div[1]/button[1]/span[1]/span[1]")).click();

        //Add Devices
        driver.findElement(By.xpath("//*[@id=\"nova\"]/div[2]/div[2]/div[1]/form/div[1]/div/div/div[15]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div")).click();

        //QTY
        driver.findElement(By.id("qty-default-text-field")).click();
        driver.findElement(By.id("qty-default-text-field")).sendKeys(userData.get(73));

        //Price per unit
        driver.findElement(By.id("price-default-text-field")).click();
        driver.findElement(By.id("price-default-text-field")).sendKeys(userData.get(74));
    }
    @Test ( priority = 5 )
    void create() throws IOException, InterruptedException {
        Create loginTest = new Create();
        loginTest.Create();
        loginTest.create();
        Thread.sleep(5000);


    }
}
