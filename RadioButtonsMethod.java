package MainPackage.SeleniumChromeDriver.locators.radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsMethod {// RADIO BUTTONS
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd= new ChromeDriver();
        wd.get("https://courses.letskodeit.com/practice");

        wd.findElement(By.id("bmwradio")).click();
        Thread.sleep(3000);
        wd.findElement(By.id("benzradio")).click();
        Thread.sleep(3000);
        wd.findElement(By.id("hondaradio")).click();
        Thread.sleep(3000);

        wd.close();
    }
}
