package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.nl.Als;
import cucumber.api.java.nl.Dan;
import cucumber.api.java.nl.Gegeven;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RdwHomepageSteps {

    WebDriver driver;
//    Aanmaken nieuwe variabele, type > naam > waarde toekennen =

    @Gegeven("^Ik ben op de homepage van het RDW$")
    public void ik_ben_op_de_homepage_van_het_RDW() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "D:/repository/project.tim/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.rdw.nl/");


    }

    @Als("^ik op de link Auto klik$")
    public void ik_op_de_link_Auto_klik() throws Throwable {
        driver.findElement(By.linkText("Auto")).click();

    }

    @Dan("^verwacht ik dat de titel Auto \\| RDW is$")
    public void verwacht_ik_dat_de_titel_Auto_RDW_is() throws Throwable {
        boolean result = driver.getTitle().contains("Auto");

        driver.quit();

        Assert.assertTrue("waarschuwing", result);
    }

    @Als("^ik op de link Motor klik$")
    public void ik_op_de_link_Motor_klik() throws Throwable {
        driver.findElement(By.linkText("Motor")).click();

    }

    @Dan("^verwacht ik dat de titel Motor \\| RDW is$")
    public void verwacht_ik_dat_de_titel_Motor_RDW_is() throws Throwable {
        String titel = driver.getTitle();
        boolean result = titel.contains("Motor");

        driver.quit();
        Assert.assertTrue("Verwachte titel Motor, komt niet overeen met resultaat: " + titel , result);
    }
}
