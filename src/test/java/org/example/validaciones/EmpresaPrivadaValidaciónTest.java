package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaPrivadaValidaciónTest {

    private EmpresaPrivadaValidación empresaPrivadaValidación;

    @BeforeEach
    public void configuracionPrueba(){
        this.empresaPrivadaValidación =new EmpresaPrivadaValidación();
        System.out.println("iniciando prueba...");
    }

    @Test
    public void ValidarNumerosdeCaracteresFuncionaCorrectamente(){
        String nombreRepresentateLegal = "nombrerepresentantelegal";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.empresaPrivadaValidación.validarNombreRepresentanteLegal(nombreRepresentateLegal));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNumeroCaracteresRepresentanteLegalFuncionaIncorrectamente(){
        String nombreRepresentanteLegal="nombre";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.empresaPrivadaValidación.validarNombreRepresentanteLegal(nombreRepresentanteLegal));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarNombresFuncionanIncorrectoPorCaracteresInvalidos(){
        String nombreRepresentanteLegal="nombre-123344533";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.empresaPrivadaValidación.validarNombreRepresentanteLegal (nombreRepresentanteLegal));
        Assertions.assertEquals(Mensaje.NOMBRE_INVALIDO.getMensaje(),respuesta.getMessage());

    }
}