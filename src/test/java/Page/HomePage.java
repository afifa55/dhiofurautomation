package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    @FindBy(partialLinkText = "Contact Us")
    WebElement contactUs;
    @FindBy(xpath = "//input[contains(@placeholder, 'Enter Your Name')]")
    WebElement txtName;
    @FindBy(css = "[type=Email]")

    WebElement txtEmail;
    @FindBy(xpath = "//input[contains(@placeholder, 'Enter Your Phone Number')]")
    WebElement txtPhone;
    @FindBy(xpath = "//textarea[contains(@placeholder, 'Enter Your Address')]")
    WebElement txtAddress;
    @FindBy(css = "[type=submit]")
    WebElement btnSubmit;

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void bookappointment(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(contactUs));
        contactUs.click();
        txtName.sendKeys("Afifa Sultana");
        txtEmail.sendKeys("afifa.sultana.me@gmail.com");
        txtPhone.sendKeys("+8801644326393");
        txtAddress.sendKeys("Mirpur-2");
        btnSubmit.click();

    }




}
