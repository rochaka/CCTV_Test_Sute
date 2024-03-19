package Test_Suite.Transactions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Approvel {
    @Test ( priority = 1 )
    void LOad_new_link() throws IOException, InterruptedException{
        Thread.sleep(2000);
        driver.get("https://cctv.zuselab.dev/");
    }

    @Test ( priority = 2 )
    void Find() throws IOException, InterruptedException{
        Thread.sleep(2000);
        String filePath = "Data"; // Replace with the path to your userdata.txt file
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();
        driver.findElement(By.id("id")).click();
        driver.findElement(By.id("id")).sendKeys(userData.get(80));

        //click
        driver.findElement(By.id("submitButton")).click();

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[4]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div/input")).sendKeys(userData.get(81));
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/form[1]/div[4]/button[1]")).click();
    }
    @Test ( priority = 3 )
    void  inquiries () throws IOException, InterruptedException{
        Thread.sleep(2000);
        String filePath = "Data"; // Replace with the path to your userdata.txt file
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/textarea[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/textarea[1]")).sendKeys(userData.get(81));
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/button[1]")).click();
    }
    @Test ( priority = 4 )
    void  Agreement () throws IOException, InterruptedException{
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/button[1]")).click();



    }

}
