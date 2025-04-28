package Util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenUtil {
    public static void takeScreenshot(WebDriver driver, String stepName) throws Exception {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotName = "screenshot_" + stepName + "_" + timestamp + ".png";

        FileUtils.copyFile(screenshot, new File("target/screen/" + screenshotName));

        System.out.println("Captura de pantalla guardada como: " + screenshotName);
    }
}
