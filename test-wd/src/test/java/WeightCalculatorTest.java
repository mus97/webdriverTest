import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightCalculatorTest {

    private static WebDriver webdriver;
    private String url = "http://svyatoslav.biz/testlab/wt";

    @BeforeAll
    public static void beforeAll() {

        webdriver = new ChromeDriver();

    }

    @Test
    public void testInputHeightWith50() throws InterruptedException {

        webdriver.get(url);
        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webdriver);

        weightCalculatorPage.typeName("Ivan");
        weightCalculatorPage.typeHeight("50");
        weightCalculatorPage.typeWeight("30");
        weightCalculatorPage.selectGender("M");
        weightCalculatorPage.pressButtonSubmit();
        String result = webdriver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();

        assertEquals("Значительный избыток массы тела, тучность", result);

        Thread.sleep(2000);
    }

    @Test
    public void testInputHeightWith0() throws InterruptedException {

        webdriver.get(url);
        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(webdriver);

        weightCalculatorPage.typeName("Ivan");
        weightCalculatorPage.typeHeight("0");
        weightCalculatorPage.typeWeight("30");
        weightCalculatorPage.selectGender("M");
        weightCalculatorPage.pressButtonSubmit();
        String result = webdriver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b")).getText();

        assertEquals("Рост должен быть в диапазоне 50-300 см.", result);

        Thread.sleep(2000);
    }

    @AfterAll
    public static void tearDown() {
        webdriver.quit();
    }

}
