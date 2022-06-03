package my.store.qa.executors;

import java.util.ArrayList;
import java.util.List;

public class MultiBrowserManager {

    private static final List<BrowserExecutor> browserExecutors = new ArrayList<>();

    private static int currentBrowserExecutor = 0;

    public static BrowserExecutor getBrowserExecutor() {

        if (browserExecutors.isEmpty()) {
            createNewBrowserExecutor();
        }

        return browserExecutors.get(currentBrowserExecutor);

    }

    public static void terminateAllBrowserExecutors() {

        for (BrowserExecutor be : browserExecutors) {
            System.out.println("Terminate browser executor: '" + BrowserExecutor.getExecutorName());
            be.terminateExecutor();
        }

        browserExecutors.clear();

    }

    private static void createNewBrowserExecutor() {

        BrowserExecutor be;

        if (browserExecutors.isEmpty()) {
            currentBrowserExecutor = 0;
        } else {
            currentBrowserExecutor = browserExecutors.size();
        }

        //TODO add ability to create executors for the different browsers according to the runner or config
        be = new ChromeExecutor("chrome_executor_" + currentBrowserExecutor);

        browserExecutors.add(be);

    }

}