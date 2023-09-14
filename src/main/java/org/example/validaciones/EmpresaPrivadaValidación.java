package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class EmpresaPrivadaValidación {

    protected Util util = new Util();

    public boolean validarNombreRepresentanteLegal(String representanteLegal)throws Exception {

        if (representanteLegal.length() < 10) {
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje());
        } else if(!util.validarExpresionRegular(representanteLegal,"^[A-Za-z ]+$")){
            throw new Exception(Mensaje.NOMBRE_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }
}
