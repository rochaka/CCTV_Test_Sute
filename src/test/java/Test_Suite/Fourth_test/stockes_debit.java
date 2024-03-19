package Test_Suite.Fourth_test;

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

public class stockes_debit {
    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }

    @Test ( priority = 3 )
    void Shift() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"collapsible-resource-manager-desktop\"]/div/div[1]/div[1]/div[3]/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Stock Transactions']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]")).click();
    }

    @Test ( priority = 4 )
    void FILL() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String filePath = "Data"; // Replace with the path to your userdata.txt file
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();
        //SKU ID
        driver.findElement(By.id("SKU-create-stock-transaction-text-field")).click();
        driver.findElement(By.id("SKU-create-stock-transaction-text-field")).sendKeys(userData.get(60));

        //Select Device
        driver.findElement(By.xpath("//*[@id=\"nova\"]/div[2]/div[2]/div[1]/form/div[1]/div/div/div[2]/div[2]/div/div")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div")).click();

        //QTY
        driver.findElement(By.id("qty-create-stock-transaction-text-field")).click();
        driver.findElement(By.id("qty-create-stock-transaction-text-field")).sendKeys(userData.get(61));

        //sPrice Per Unit
        driver.findElement(By.id("price-create-stock-transaction-text-field")).click();
        driver.findElement(By.id("price-create-stock-transaction-text-field")).sendKeys(userData.get(62));;

        //Transaction Category*
        driver.findElement(By.id("category")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/form/div[1]/div/div/div[6]/div[2]/div/select/option[3]")).click();



    }
    @Test ( priority = 5 )
    void create() throws IOException, InterruptedException {
        Create loginTest = new Create();
        loginTest.Create();
        loginTest.create();

    }
}
