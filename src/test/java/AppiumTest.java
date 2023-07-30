import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;


public class AppiumTest {
    public static void main(String[] args) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setAppPackage("com.google.android.calculator").setAppActivity("com.android.calculator2.Calculator").setDeviceName("emulator-5554").setPlatformVersion("13.0");
        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        WebElement element = androidDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"1\"]"));
        element.click();

    }
}
