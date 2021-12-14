package framework.utilities;

import java.io.File;

public class FileDownloadManager {

    public static void waitForFileToBeDownloaded(String path, String fileName) throws InterruptedException {
        File f = new File(path + fileName);
        long filesize1;
        long filesize2;
        do {
            filesize1 = f.length();
            Thread.sleep(1000);
            filesize2 = f.length();
        } while (filesize2 != filesize1);
    }
}
