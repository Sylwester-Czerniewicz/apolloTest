import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Apollo {
    @Test
    public void apolloOpenTest () throws InterruptedException {
        String driverPath = "C:\\Users\\ASUS\\IdeaProjects\\Selenium\\src\\main\\resources\\Dependency\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.apollo.pl/");
        driver.findElement(By.id("shop-search-10")).sendKeys("Asus");
        driver.findElement(By.id("wyszukiwarka-szukaj")).click();
        WebElement screen = driver.findElement(By.linkText("Monitor Asus 15.6\" LED MB168B 16:9, USB3.0, 1366x768, 5W"));
        System.out.println(screen.getText());
        Assert.assertTrue(screen.getText().equals("Monitor Asus 15.6\" LED MB168B 16:9, USB3.0, 1366x768, 5W"));
        screen.click();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("window.scrollBy(0,2500)");
        WebElement newWindow = driver.findElement(By.xpath("//a[text()='Dodaj opinię']"));
        if (newWindow.isEnabled()){
            driver.close();
        }










    }


}
