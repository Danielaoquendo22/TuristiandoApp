package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoValidacionTest {

    private AfiliadoValidacion afiliadoValidacion= new AfiliadoValidacion();

    @BeforeEach
    public void configurarPruebas(){
        this.afiliadoValidacion= new AfiliadoValidacion();
    }

    @Test
    public void validarMensualidadFuncionaCorrrecto(){
        Integer mensualidadPrueba = 10000;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.afiliadoValidacion.validarMesualidad(mensualidadPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarMEnsualidadFuncionaIncorrecto(){
        Integer mensualidadPrueba = -1000;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.afiliadoValidacion.validarMesualidad(mensualidadPrueba));
        Assertions.assertEquals(Mensaje.VALIDAR_COSTO.getMensaje(),respuesta.getMessage());

    }

    @Test
    public void  validarMensualidadFuncionaIncorrectoPorValorSuperior(){
        Integer mensualidadPrueba=150000;
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.afiliadoValidacion.validarMesualidad(mensualidadPrueba));
        Assertions.assertEquals(Mensaje.VALOR_INVALIDO.getMensaje(),respuesta.getMessage());
    }


}