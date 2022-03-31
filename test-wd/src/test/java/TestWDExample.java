import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWDExample {

    private static WebDriver webdriver;
    private  String inputNamexPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
    private  String inputHeightxPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
    private  String inputGenderMxPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
    private  String inputWeightxPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
    private  String buttonSubmitxPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
    private  String url = "http://svyatoslav.biz/testlab/wt";
    WebElement inputName =  webdriver.findElement(By.xpath(inputNamexPath));
    WebElement inputHeight = webdriver.findElement(By.xpath(inputHeightxPath));
    WebElement inputWeight = webdriver.findElement(By.xpath(inputWeightxPath));
    WebElement inputGenderM = webdriver.findElement(By.xpath(inputGenderMxPath));
    WebElement buttonSubmit = webdriver.findElement(By.xpath(buttonSubmitxPath));

    @BeforeAll
    public static void beforeAll () {

        webdriver = new ChromeDriver();

    }

    @Test
    public void testInputHeightWith50 () throws InterruptedException {

        webdriver.get(url);


        inputName.sendKeys("Иван");
        inputHeight.sendKeys("50");
        inputWeight.sendKeys("30");
        inputGenderM.click();
        buttonSubmit.click();

        Thread.sleep(5000);
    }

    @Disabled
    @Test
    public void testInputHeightWith49 () throws InterruptedException {

        webdriver.get(url);
        WebElement inputName =  webdriver.findElement(By.xpath(inputNamexPath));
        WebElement inputHeight = webdriver.findElement(By.xpath(inputHeightxPath));
        WebElement inputWeight = webdriver.findElement(By.xpath(inputWeightxPath));
        WebElement inputGenderM = webdriver.findElement(By.xpath(inputGenderMxPath));
        WebElement buttonSubmit = webdriver.findElement(By.xpath(buttonSubmitxPath));

        inputName.sendKeys("Иван");
        inputHeight.sendKeys("49");
        inputWeight.sendKeys("30");
        inputGenderM.click();
        buttonSubmit.click();

        Thread.sleep(5000);


    }
    @AfterAll
    public static void tearDown(){
        webdriver.quit();
    }


}
