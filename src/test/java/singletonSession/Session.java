package singletonSession;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {
    private static Session instance = null;
    private WebDriver browser;
    private Session() {
        browser = FactoryBrowser.make("firefox").create();
    }

    public static Session getInstance() {
        if (instance == null)
            instance = new Session();
        return instance;
    }

    public void changeBrowser(String browser) {
        this.browser = FactoryBrowser.make(browser).create();
    }

    public void closeBrowser() {
        browser.quit();
        instance = null;
    }

    public void goTo(String url) {
        browser.get(url);
    }

    public WebDriver getBrowser() {
        return browser;
    }
}
