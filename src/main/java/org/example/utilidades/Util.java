package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {




    public static Boolean validarExpresionRegular(String cadena, String expresionregular){
        Pattern patron = Pattern.compile(expresionregular);
        Matcher coincidencia = patron.matcher(cadena);
        if(coincidencia.matches()){//si hay coincidencia
            return true;
        }else {
            return false;

        }
    }

    public Integer generarId(){
        Integer idG;
        idG = (int) (Math.random() * 501);
        return idG;
    }
    public  LocalDate convertirStringAFecha(String fechaSting ){
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(fechaSting , formatoFecha);
    }

    public  boolean validarFormatoFecha(String fechaString) throws Exception {

        String fechaRegex = "^\\d{2}/\\d{2}/\\d{4}$";

        if(!validarExpresionRegular(fechaString, fechaRegex)){
            throw new Exception(Mensaje.VALIDAR_FORMATO_FECHA.getMensaje());
        }else{
            return true;
        }

    }


}
