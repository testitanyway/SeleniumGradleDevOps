import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class testGradle {


    WebDriver driver;
    @BeforeTest
    public void beforetest()
    {
        String currentDirectory = System.getProperty("user.dir");
        currentDirectory=currentDirectory+"\\src\\test\\";
        System.setProperty("webdriver.chrome.driver", currentDirectory+"chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    public void testcase001()
    {
        try {
            System.out.println("Hello World !!");
            driver.get("https://www.seleniumeasy.com/");
            Thread.sleep(5000);
            String titles = driver.getTitle();
            System.out.println(titles);
            driver.findElement(By.xpath("(//a[contains(text(),'Maven')])[1]")).click();
            Thread.sleep(2000);
        }
        catch(Exception ex)
        {

        }


    }

    @Test
    public void testcase002()
    {

        System.out.println("Hello World2!!");
        driver.get("https://www.seleniumeasy.com/");

        String titles = driver.getTitle();
        System.out.println(titles);
        driver.findElement(By.xpath("(//a[contains(text(),'Matrste')])")).click();




    }

    @AfterTest
    public void aftertest()
    {
        driver.close();

    }
}
