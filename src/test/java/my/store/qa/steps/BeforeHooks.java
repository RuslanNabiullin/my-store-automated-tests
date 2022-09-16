package my.store.qa.steps;

import my.store.qa.executors.MultiBrowserManager;
import org.junit.Before;

public class BeforeHooks {

    @Before
    public void terminateChromeExecutor() {

        System.out.println("============Start browser============");
        MultiBrowserManager.getBrowserExecutor();

    }

}