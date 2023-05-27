package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class HookStep {
    public static int executedScenarios = 0;
    public static int expectedScenarios = 2;
    public static WebDriver driver;
    @Before
    public static void beforeTest(){
        if (executedScenarios == 0) {
            beforeAll();
        }
        System.out.println("BEFORE TEST");

        //CODE HERE
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--no-sandbox");
        option.addArguments("--disable-dev-shm-usage");
        option.addArguments("--headless");
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

        executedScenarios++;
    }
    @After
    public static void afterTest() throws InterruptedException {
        System.out.println("AFTER TEST");

        //CODE HERE
        Thread.sleep(1000);
        driver.quit();

        if (executedScenarios == expectedScenarios) {
            afterAll();
        }
    }

    public static void beforeAll() {
        System.out.println("BEFORE All");
    }

    public static void afterAll() {
        System.out.println("AFTER All");
    }
}
