package armory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Armory {
    public static void main(String[] args) {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "C:/repository/project.tim2/chromedriver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.navigate().to("https://worldofwarcraft.com/en-gb/");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Childplease\n");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div/div[5]/div/div/div[3]/div/a")).click();
    }
}

