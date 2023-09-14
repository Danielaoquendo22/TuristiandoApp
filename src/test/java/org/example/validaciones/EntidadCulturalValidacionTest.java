package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadCulturalValidacionTest {

    private EntidadCulturalValidacion entidadCulturalValidacion = new EntidadCulturalValidacion();

    @BeforeEach
    public void configurarPrueba(){
        this.entidadCulturalValidacion= new EntidadCulturalValidacion();
        System.out.println("iniciando prueba...");
    }

    @Test
    public  void validarSecretariaFuncionaCorrectamente(){
        String nombreSecretaria= "nombre de secretaria";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.entidadCulturalValidacion.validarSecretaria(nombreSecretaria));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombreFuncionaIncorrecto(){
        String nombreSecretaria= "nombre";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.entidadCulturalValidacion.validarSecretaria(nombreSecretaria));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje(),respuesta.getMessage());

    }
}