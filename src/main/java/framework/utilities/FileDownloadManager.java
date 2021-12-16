package framework.utilities;

import framework.utilities.driverFactory.DriverSingleton;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.time.Duration;

public class FileDownloadManager {

    public static void waitForFileToBeDownloaded(String path, String fileName, long expectedSize) {
        File file = new File(path + fileName);
        long fileSizeActual;
        do {
            fileSizeActual = file.length();
            Wait wait = new FluentWait(DriverSingleton.getDriver())
                    .withTimeout(Duration.ofSeconds(60))
                    .pollingEvery(Duration.ofMillis(1000));
            wait.until(ExpectedConditions.urlContains("http"));
        } while (fileSizeActual != expectedSize);
    }
}