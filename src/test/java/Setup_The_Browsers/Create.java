package Setup_The_Browsers;

import org.openqa.selenium.By;

import java.io.IOException;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Create {
    public void create() throws InterruptedException, IOException{
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/form/div[2]/button[3]")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/a")).click();


        
    }

    public void Create() {
    }
}
