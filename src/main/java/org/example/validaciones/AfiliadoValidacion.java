package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class AfiliadoValidacion {
    //validar costo mensualidad

    public Boolean validarMesualidad(Integer valorMensual) throws Exception {
        if (valorMensual < 0) {
            throw new Exception(Mensaje.VALIDAR_COSTO.getMensaje());
        } else if(valorMensual>100000){

            throw new Exception(Mensaje.VALOR_INVALIDO.getMensaje());

        }else {
            return true;
        }
    }
}
