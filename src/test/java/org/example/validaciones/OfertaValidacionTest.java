package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {

    private OfertaValidacion validacion;

    @BeforeEach
    public void configurarPurueba(){
        this.validacion = new OfertaValidacion();
        System.out.println("Iniciando prueba ... ");
    }

    @Test
    public void validarTituloNumeroCaracteres(){
        String tituloPrueba= "asdfghjj";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarTitulo(tituloPrueba));
        Assertions.assertTrue(respuesta);
    }

    public void validarTitulo
}