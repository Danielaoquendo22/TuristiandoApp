package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class ReservaValidacion {

    public ReservaValidacion() {
    }

    public boolean validarReserva (Integer reserva) throws Exception{
        if (reserva <= 0 || reserva >4){
            throw new Exception(Mensaje.VALIDAR_NUMERO_RESERVA.getMensaje());

        }else {
            return true;
        }

    }


}
