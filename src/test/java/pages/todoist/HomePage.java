package pages.todoist;

import controls.Button;
import org.openqa.selenium.By;

public class HomePage {
    public Button profileButton = new Button(By.xpath("//img/parent::div/parent::button"));
}
