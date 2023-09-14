package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class OcasionalValidacion {

    public Boolean ValorEvento(Integer valorEvneto)throws Exception{
        if (valorEvneto <0){
            throw new Exception(Mensaje.VALIDAR_COSTO.getMensaje());
        }else if(valorEvneto>200000){
            throw new Exception(Mensaje.VALOR_INVALIDO.getMensaje());
        }else{
            return true;
        }
    }
}
