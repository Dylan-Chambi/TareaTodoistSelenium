package testTodoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.todoist.HomePage;
import pages.todoist.LoginPage;
import pages.todoist.MainPage;
import pages.todoist.ProfileContextMenu;
import singletonSession.Session;

import java.time.Duration;

public class TestBase {

    protected MainPage mainPage = new MainPage();
    protected LoginPage loginPage = new LoginPage();
    protected HomePage homePage = new HomePage();
    protected ProfileContextMenu profileContextMenu = new ProfileContextMenu();

    @BeforeEach
    public void openBrowser() {
        Session.getInstance().getBrowser().manage().window().maximize();
        Session.getInstance().getBrowser().manage().deleteAllCookies();
        Session.getInstance().getBrowser().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Session.getInstance().goTo("https://todoist.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeBrowser();
    }
}
