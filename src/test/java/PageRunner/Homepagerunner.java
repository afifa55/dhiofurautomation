package PageRunner;

import Base.Setup;
import Page.HomePage;
import org.testng.annotations.Test;

public class Homepagerunner extends Setup {
    @Test
    public void appointmentsubmit(){
            HomePage homePage= new HomePage(driver);
            driver.get("https://dhiofur.texrootsourcing.com/");
            homePage.bookappointment();

    }

}
