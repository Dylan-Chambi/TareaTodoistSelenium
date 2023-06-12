package testTodoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {

        @Test
        public void verify_login_todolist() throws InterruptedException {
            mainPage.loginButton.click();
            loginPage.emailTextBox.setText("dylan@gmail.com");
            loginPage.passwordTextBox.setText("dylan712712");
            loginPage.loginButton.click();

            Thread.sleep(20000);

            homePage.profileButton.click();

            Assertions.assertTrue(profileContextMenu.logoutButton.isControlDisplayed(), "ERROR: the login was not successful");
        }

}
