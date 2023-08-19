package org.example.utilidades;

public enum Mensaje {
    NUMERO_CARACTERES_INVALIDOS("El numero de caracteres es invalido"),
    NOMBRE_INVALIDO("El nombre solo acepta letras y espacios"),
    CORREO_INVALIDO("Revisa el formato del correo"),
    UBICACION_INVALIDA("La ubicacion solo puede ser un numero entre 1 y 4"),
    SOLO_NUMEROS("Solo se aceptan numeros. "),
    VALIDAR_FECHA("La fecha inicial no puede ser mayor a la fecha final"),
    VALIDAR_FORMATO_FECHA("Formato de fecha invalido DD/MM/YYYY"),
    VALIDAR_NUMERO_RESERVA("El numero de reservas es invalida, solo se aceptan cuatro reservas por persona"),
    VALIDAR_COSTO("Formato invalido / numero de caracteres no pueden ser menor a cero");
    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
