package Google.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgebroweser {
static WebDriver driver;

public static void main(String[]args) {
System.setProperty("webdriver.edge.driver", "C:\\Users\\17034\\eclipse-workspace\\testing\\driver\\msedgedriver.exe");
driver=new EdgeDriver();






}
}