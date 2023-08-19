package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {

    private LocalValidacion validacionL;

    @BeforeEach
    public void configurarPrueba(){
        this.validacionL= new LocalValidacion();
        System.out.println("Iniciando prueba ... ");
    }

    @Test
    public  void validacionNumeroCaracteresNit(){
        String nitPrueba ="1234567890";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacionL.validarNit(nitPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void  validacionNitNofuncionaPorCaracteres(){
        String nitPrueba= "1234";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacionL.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validacionNitNoFuncionaTipoCaracteres(){
        String nitPrueba= "asdfghjklo";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacionL.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.SOLO_NUMEROS.getMensaje(),respuesta.getMessage());

    }

    @Test
    public void validarNombreNumeroCaracteres(){
        String nombrePrueba="asdfgtresd";
        Boolean respuesta =Assertions.assertDoesNotThrow(()->this.validacionL.validarNombre(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombreIncorrestoPorNumeroCaracteres(){
        String nombrePrueba="asdfghjkloiuytrewqazxcvbnmkjhgrtyu";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacionL.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje(),respuesta.getMessage());
    }

}