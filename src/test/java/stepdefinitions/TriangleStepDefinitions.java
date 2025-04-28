package stepdefinitions;

import net.serenitybdd.annotations.Steps;
import io.cucumber.java.en.*;
import net.sourceforge.tess4j.TesseractException;
import steps.TriangleSteps;

import java.io.IOException;

public class TriangleStepDefinitions {

    @Steps
    TriangleSteps triangle;

    @Given("que el usuario accede a la página del triángulo")
    public void que_el_usuario_accede_a_la_pagina_del_triangulo() {
        triangle.abrirPagina();
    }

    @When("ingresa nombre {string}")
    public void ingresa_nombre(String n) throws Exception {
        triangle.ingresarNombre(n);
    }

    @When("ingresa los lados {string}, {string} y {string}")
    public void ingresa_los_lados(String a, String b, String c) throws Exception {
        triangle.ingresarLados(a, b, c);
    }

    @And("presiona el botón de verificación")
    public void presiona_el_boton_de_verificacion() throws Exception {
        triangle.presionarCheck();
    }

    @Then("debe mostrarse el resultado {string}")
    public void debe_mostrarse_el_resultado(String esperado) throws TesseractException, IOException {
        triangle.verificarResultado(esperado);
    }
}