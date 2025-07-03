import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TutorialPointTableBdd {

    private WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @After
    public void cleanUp() {
        //driver.close();
        driver.quit();
    }



    @Given("Uzivatel se nachazi na strance {string}")
    public void uzivatelSeNachaziNaStrance(String url) {
        driver.get(url);
    }

    @Then("jmeno na druhem radku tabulky bude {string}")
    public void jmenoNaDruhemRadkuTabulkyBude(String jmeno) {
        String name = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[1]")).getText();
        assertEquals(jmeno, name);
    }

    @And("prijmeni na druhem radku tabulky bude {string}")
    public void prijmeniNaDruhemRadkuTabulkyBude(String prijmeni) {
        String lastName = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[2]")).getText();
        assertEquals(prijmeni, lastName);
    }
}
