package productsTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageProductsTest extends BaseTests {

    @Test
    public void addProductToCartTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");

        HomePage homePage = new HomePage(driver);
        homePage.addItemToCart(0);
    }

    @Test
    public void createNewAccount(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickOnCreateAccountButton();


    }

}