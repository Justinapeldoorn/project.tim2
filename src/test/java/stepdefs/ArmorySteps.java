package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.nl.Als;
import cucumber.api.java.nl.Dan;
import cucumber.api.java.nl.Gegeven;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArmorySteps {


    WebDriver driver;

    @Gegeven("^Ik ben op de armory website$")
    public void ik_ben_op_de_armory_website() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "C:/repository/project.tim2/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://worldofwarcraft.com/en-gb/");

    }


    @Als("^ik op Childplease zoek$")
    public void ik_op_Childplease_zoek() throws Throwable {

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Childplease\n");

    }


    @Dan("^verwacht ik dat de browser naar de pagina van Childplease - EU Silvermoon navigeert$")
    public void verwacht_ik_dat_de_browser_naar_de_pagina_van_Childplease_EU_Silvermoon_navigeert() throws Throwable {

        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div/div[5]/div/div/div[3]/div/a")).click();

    }


}
