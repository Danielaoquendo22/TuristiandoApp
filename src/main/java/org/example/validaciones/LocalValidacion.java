package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class LocalValidacion {

    protected Util util= new Util();

    public LocalValidacion() {
    }

    public boolean validarNit(String nit)throws Exception{

        if(nit.length()!=10){
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje());

        }else if(!util.validarExpresionRegular(nit,"^[0-9]+$")){
            throw new Exception(Mensaje.SOLO_NUMEROS.getMensaje());
        }else{
            return true;
        }
    }

    public boolean validarNombre(String nombre) throws Exception {

        if(nombre.length()>30){
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje());
        } else{
            return true;

        }

    }


}
