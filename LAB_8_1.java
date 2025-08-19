package DAY27;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LAB_8_1 {

    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        System.out.println("Browser launched and maximized");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        driver.quit();
        System.out.println("Browser closed");
    }

    @Before
    public void setUp() throws Exception {
        // Runs before each test if needed
    }

    @After
    public void tearDown() throws Exception {
        // Runs after each test if needed
    }

    @Test
    public void testSortingAndAddToCart() {
        driver.get("https://tutorialsninja.com/demo/index.php?");
        System.out.println("Navigated to homepage");

        driver.findElement(By.linkText("Desktops")).click();
        System.out.println("Clicked on Desktops link");

        driver.findElement(By.linkText("Mac (1)")).click();
        System.out.println("Selected product: Mac (1)");

        WebElement sortele = driver.findElement(By.xpath("//select[@id='input-sort']"));
        Select sortSelect = new Select(sortele);
        sortSelect.selectByIndex(1);
        System.out.println("Sorted products using index 1");

        driver.findElement(By.xpath("//div[@class='button-group']//button")).click();
        System.out.println("Clicked on Add to Cart button");

        assertTrue("Cart button should exist", 
                   driver.findElement(By.xpath("//div[@class='button-group']//button")).isDisplayed());
    }
}
