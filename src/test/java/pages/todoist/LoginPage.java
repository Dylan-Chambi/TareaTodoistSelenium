package pages.todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox emailTextBox = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox passwordTextBox = new TextBox(By.xpath("//input[@type='password']"));
    public Button loginButton = new Button(By.xpath("//span[text()='Log in']/parent::button"));
}
