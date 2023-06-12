package pages.todoist;

import controls.Button;
import org.openqa.selenium.By;

public class ProfileContextMenu {
    public Button logoutButton = new Button(By.xpath("//span[text()='Log out']/parent::button"));
}
