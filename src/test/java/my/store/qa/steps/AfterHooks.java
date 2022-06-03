package my.store.qa.steps;

import io.cucumber.java.After;
import my.store.qa.executors.MultiBrowserManager;

public class AfterHooks {

    @After(order = 1)
    public void terminateChromeExecutor() {

        System.out.println("============Terminate all browser executors============");
        MultiBrowserManager.terminateAllBrowserExecutors();

    }

}