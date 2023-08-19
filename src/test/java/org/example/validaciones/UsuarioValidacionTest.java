package org.example.validaciones;

import com.sun.security.jgss.GSSUtil;
import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    //crear un objeto de la clase que quiero probar
    private UsuarioValidacion validacion;

    //preparar las pruebas que vamos a realizar

    @BeforeEach
    public void configurarPruebas (){
        this.validacion= new UsuarioValidacion();
        System.out.println("Iniciando prueba ... ");
    }

    //programamos nuestras pruebas unitarias
    @Test
    public  void validarNombresFuncionaCorrectamente(){
        String nombrePrueba="Daniela Oquendo Tabares "; //preparo
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
   @Test
    public  void  validarNombresFuncionaIncorrectoPorNUmeroCaracteres(){
        String nombrePrueba="juan";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje(),respuesta.getMessage());
    }
    @Test
    public  void validarNombresFuncionaIncorrectoPorCaracteresInvalidos(){
        String nombrePrueba="1234567890";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_INVALIDO.getMensaje(),respuesta.getMessage());
    }


    @Test
    public void validarCorreoFuncionaCorretamente(){
        String correoPrueba="dani@gmail.com";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoFuncionaIncorrectoPorFormato(){
        String correoPrueba="dani.com";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.CORREO_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarUbicacionCorrecta(){
        Integer ubicacionPrueba = 4;
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarUbicacionIncorrecta(){
        Integer ubicacionPrueba= 8;
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertEquals(Mensaje.UBICACION_INVALIDA.getMensaje(),respuesta.getMessage());
    }
}