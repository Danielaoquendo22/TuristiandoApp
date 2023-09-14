package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    private ReservaValidacion validación;
    @BeforeEach
    public void configuracionPrueba(){
        this.validación= new ReservaValidacion();
        System.out.println("Iniciando prueba ... ");
    }
    @Test
    public void validarNumeroReserva(){
        Integer reservaPrueba = 3;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validación.validarReserva(reservaPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNumeroReservaIncorrecto(){
        Integer reservaPrueba = 5;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validación.validarReserva(reservaPrueba));
        Assertions.assertEquals(Mensaje.VALIDAR_NUMERO_RESERVA.getMensaje(),respuesta.getMessage());

    }
}