package my.store.qa.steps;

import my.store.qa.executors.MultiBrowserManager;

public class Helper {

    public void switchTo(String browserExecutorName) {

        MultiBrowserManager.switchToBrowserExecutor(browserExecutorName);
    }

}