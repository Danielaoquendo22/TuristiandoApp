package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class EntidadCulturalValidacion {

    public Boolean validarSecretaria(String secretaria )throws Exception{
        if(secretaria.length()<10){
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje());
        } else if (secretaria.length()>70) {
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje());
        }else {
            return true;
        }
    }
}
