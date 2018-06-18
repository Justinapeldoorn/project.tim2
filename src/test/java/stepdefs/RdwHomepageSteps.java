package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
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

    @Before("@Rdw")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:/repository/project.tim/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Gegeven("^Ik ben op de homepage van het RDW$")
    public void ik_ben_op_de_homepage_van_het_RDW() throws Throwable {
        driver.navigate().to("https://www.rdw.nl/");
    }

    @Als("^ik op de link \"([^\"]*)\" klik$")
    public void naamMethode(String linkText) throws Throwable {
        driver.findElement(By.linkText(linkText)).click();
    }

    @Dan("^verwacht ik dat de titel \"([^\"]*)\" \\| RDW is$")
    public void verwacht_ik_dat_de_titel_RDW_is(String clown) throws Throwable {
        String titel = driver.getTitle();
        boolean result = titel.contains(clown);

        Assert.assertTrue("Verwachte titel " + clown + ", komt niet overeen met resultaat: " + titel, result);
    }

    @After("@Rdw")
    public void sluitBrowser() {
        driver.quit();
    }


}
