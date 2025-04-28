package pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@DefaultUrl("https://www.developsense.com/triangle/triangle.html")
public class TrianglePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement nombre;

    @FindBy(xpath = "//*[@id=\"SideA\"]")
    WebElement side1;

    @FindBy(id = "SideB")
    WebElement side2;

    @FindBy(xpath = "//*[@id=\"SideC\"]")
    WebElement side3;

    @FindBy(xpath = "//button[text()='Check']")
    WebElement checkButton;

    @FindBy(xpath = "//*[@id=\"triangleBox\"]")
    WebElement imgTriangleResult;

    public void ingresarNombre(String n) throws Exception {
        nombre.clear(); nombre.sendKeys(n);
        //ScreenUtil.takeScreenshot(getDriver(), "Evidencia: Ingresar Nombre");
    }

    public void ingresarLados(String a, String b, String c) throws Exception {
        side1.clear(); side1.sendKeys(a);
        side2.clear(); side2.sendKeys(b);
        side3.clear(); side3.sendKeys(c);
        //ScreenUtil.takeScreenshot(getDriver(), "Evidencia: Ingresar lados");

    }

    public void clickCheck() throws Exception {
        checkButton.click();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(imgTriangleResult));
        //ScreenUtil.takeScreenshot(getDriver(), "Evidencia: Click");


    }

    public String obtenerResultado() {
        return imgTriangleResult.getText();
    }

/*    public String obtenerTextoDeImagen() throws IOException, TesseractException {


        File screenshot = imgTriangleResult.getScreenshotAs(OutputType.FILE);

        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("src/main/resources/tessdata");
        String textoExtraido = tesseract.doOCR(screenshot);

        return textoExtraido;
    }*/

}