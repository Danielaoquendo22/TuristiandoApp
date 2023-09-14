package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OcasionalValidacionTest {

    private OcasionalValidacion ocasionalValidacion =new OcasionalValidacion();

    @BeforeEach
    public void configuracionPrueba(){
        this.ocasionalValidacion=new OcasionalValidacion();
    }

    @Test
    public void validarCostoEventoFuncionaCorrecto(){
        Integer mensualidadPrueba = 10000;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ocasionalValidacion.ValorEvento(mensualidadPrueba));
        Assertions.assertTrue(respuesta);

    }
    @Test
    public void validarCostoEventoFuncionaIncorrectoPorValorNegativo(){
        Integer valorEvento= -1000;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.ocasionalValidacion.ValorEvento(valorEvento));
        Assertions.assertEquals(Mensaje.VALIDAR_COSTO.getMensaje(),respuesta.getMessage());

    }

    @Test
    public void  validarCostoEventoFuncionaIncorrectoPOrValorSuperior(){
        Integer valorEvento=250000;
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.ocasionalValidacion.ValorEvento(valorEvento));
        Assertions.assertEquals(Mensaje.VALOR_INVALIDO.getMensaje(),respuesta.getMessage());
    }
}