package my.store.qa.pages;

import my.store.qa.executors.BrowserExecutor;
import my.store.qa.executors.MultiBrowserManager;

public class BasePage {

    public BrowserExecutor getBrowserExecutor() {

        return MultiBrowserManager.getBrowserExecutor();
    }

}