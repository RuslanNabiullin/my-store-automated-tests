package my.store.qa.executors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiBrowserManager {

    private static final List<BrowserExecutor> browserExecutors = new ArrayList<>();

    private static int currentBrowserExecutor = 0;

    public static void switchToBrowserExecutor(String browserExecutorName) {

        BrowserExecutor be = browserExecutors.stream()
                                             .filter(browserExecutor -> browserExecutorName.equals(browserExecutor.getExecutorName()))
                                             .findAny()
                                             .orElse(null);

        if (be == null) {
            createNewBrowserExecutor(browserExecutorName);
        } else {
            currentBrowserExecutor = browserExecutors.indexOf(be);
        }
    }

    public static BrowserExecutor getBrowserExecutor() {

        if (browserExecutors.isEmpty()) {
            createNewBrowserExecutor();
        }

        return browserExecutors.get(currentBrowserExecutor);

    }

    public static void terminateAllBrowserExecutors() {

        for (BrowserExecutor be : browserExecutors) {
            System.out.println("Terminate browser executor: '" + be.getExecutorName());
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

    private static void createNewBrowserExecutor(String browserExecutorName) {

        BrowserExecutor be;

        if (browserExecutors.isEmpty()) {
            currentBrowserExecutor = 0;
        } else {
            currentBrowserExecutor = browserExecutors.size();
        }

        //TODO add ability to create executors for the different browsers according to the runner or config
        be = new ChromeExecutor(browserExecutorName);

        browserExecutors.add(be);

    }

}