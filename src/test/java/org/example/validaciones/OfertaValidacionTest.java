package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {

    private OfertaValidacion validacion;
    private Util util;

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
    @Test
    public void validarTituloCaracteresIncirrectos(){
        String tituloPrueba="asfertgvbnhfdewsdfgjkiuytr";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarTitulo(tituloPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarFormatofechaCorrecta(){
        String fechaPrueba= "25/08/2019";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.util.validarFormatoFecha(fechaPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public  void validarFormatofechaIncorrecto(){
        String fechaPrueba="2019/08/25";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.util.validarFormatoFecha(fechaPrueba));
        Assertions.assertEquals(Mensaje.VALIDAR_FORMATO_FECHA.getMensaje(),respuesta.getMessage());

    }
    @Test
    public  void validarFechaFuncional(){
        LocalDate fechaInicial = LocalDate.of(2023,8,17);
        LocalDate fechaFinal = LocalDate.of(2023,8,20);
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarFechaFinal(fechaInicial,fechaFinal));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarFechaFuncionalIncorrecta(){
        LocalDate fechaInicial = LocalDate.of(2023,8,17);
        LocalDate fechaFinal = LocalDate.of(2023,8,14);
        Exception respuesta =Assertions.assertThrows(Exception.class,()->this.validacion.validarFechaFinal(fechaInicial,fechaFinal));
        Assertions.assertEquals(Mensaje.VALIDAR_FECHA.getMensaje(),respuesta.getMessage());

    }
    @Test
    public void validarCostoPositivo(){
        String costoPrueba = String.valueOf(1000);
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarCosto(Double.valueOf(costoPrueba)));
        Assertions.assertTrue(respuesta);

    }
    @Test
    public void validarCostoPositivoIncorrecto(){
        String costoPrueba = String.valueOf(-1000);
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarCosto(Double.valueOf(costoPrueba)));
        Assertions.assertEquals(Mensaje.VALIDAR_COSTO.getMensaje(),respuesta.getMessage());

    }
}