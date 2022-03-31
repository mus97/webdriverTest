import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WeightCalculatorPage {

    By inputNameLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input");
    By inputHeightLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input");
    By inputGenderMLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]");
    By inputGenderFLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]");
    By inputWeightLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input");
    By buttonSubmitLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input");

    private final WebDriver driver;
    public WeightCalculatorPage (WebDriver driver) {
        this.driver = driver;
    }

    public WeightCalculatorPage typeName (String name) {
        driver.findElement(inputNameLocator).sendKeys(name);
        return this;
    }

    public WeightCalculatorPage typeWeight (String weight) {
        driver.findElement(inputWeightLocator).sendKeys(weight);
        return this;
    }
    public WeightCalculatorPage selectGenderM () {
        driver.findElement(inputGenderMLocator).click();
        return this;
    }
    public WeightCalculatorPage selectGenderF () {
        driver.findElement(inputGenderMLocator).click();
        return this;
    }
    public WeightCalculatorPage typeHeight (String height) {
        driver.findElement(inputHeightLocator).sendKeys(height);
        return this;
    }
    public WeightCalculatorPage pressButtonSubmit () {
        driver.findElement(buttonSubmitLocator).click();
        return this;
    }
    public WeightCalculatorPage selectGender (String gender) {
        if (gender.equals("M")){
            selectGenderM();
        }
        else{
            selectGenderF();
        }
        return this;
    }
}
