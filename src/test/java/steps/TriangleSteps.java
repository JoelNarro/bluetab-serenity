package steps;

import net.serenitybdd.annotations.Screenshots;
import net.serenitybdd.annotations.Step;
import net.sourceforge.tess4j.TesseractException;
import net.thucydides.model.domain.screenshots.Screenshot;
import pages.TrianglePage;

import java.io.IOException;

import static org.junit.Assert.*;

public class TriangleSteps {

    TrianglePage page;

    @Step
    public void abrirPagina() {
        page.open();
    }

    @Step
    public void ingresarNombre(String n) throws Exception {
        page.ingresarNombre(n);
    }

    @Step
    public void ingresarLados(String a, String b, String c) throws Exception {
        page.ingresarLados(a, b, c);
    }

    @Step
    public void presionarCheck() throws Exception {
        page.clickCheck();
    }

    @Step
    public void verificarResultado(String esperado) throws IOException {
        assertEquals(esperado, page.obtenerResultado());
    }
}