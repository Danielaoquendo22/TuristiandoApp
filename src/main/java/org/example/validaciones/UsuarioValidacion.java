package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class UsuarioValidacion {

    protected Util util=new Util();

    public UsuarioValidacion() {
    }

    public boolean validarNombres(String nombres)throws Exception{
        //1. validar que el nombre tenga como minimo 10 caracteres
        if(nombres.length()<10){
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje());
        }else if(!util.validarExpresionRegular(nombres,"^[A-Za-z ]+$")){//2. nombres solo puede tener letras
            throw new Exception(Mensaje.NOMBRE_INVALIDO.getMensaje());
        }else{
            return true;
        }
    }

    public  boolean validarCorreo(String correo)throws Exception{
        if(!util.validarExpresionRegular(correo, "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            throw new Exception(Mensaje.CORREO_INVALIDO.getMensaje());
        }else{
            return true;
        }
    }

    public boolean validarUbicacion (Integer ubicacion)throws Exception{
        if(ubicacion <1|| ubicacion >4){
            throw new Exception(Mensaje.UBICACION_INVALIDA.getMensaje());
        }else {
            return true;
        }
    }
}

