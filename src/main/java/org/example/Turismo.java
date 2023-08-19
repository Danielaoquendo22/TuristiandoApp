    package org.example;

    import org.example.entidades.Local;
    import org.example.entidades.Oferta;
    import org.example.entidades.Reserva;
    import org.example.entidades.Usuario;
    import org.example.utilidades.Mensaje;
    import org.example.utilidades.Util;
    import org.example.validaciones.OfertaValidacion;

    import java.time.LocalDate;
    import java.util.Scanner;

    public class Turismo {

        public static void main(String[] args) throws Exception {

            Usuario usuario  = new Usuario();
            Local local = new Local();
            Oferta oferta= new Oferta();
            Scanner lea = new Scanner(System.in);
            OfertaValidacion of  = new OfertaValidacion();
            Util util = new Util();
            Reserva reserva = new Reserva();

            String fechaI;
            String fechaF;
            Double costoPersona;
            String fechaR;

            System.out.println("\u001B[32m****Bienvenido*****\u001B[0m");
            System.out.println("\u001B[34m1. Datos del Usuario \u001B[0m");
            usuario.setId();
            System.out.println("Este es el id del Usuario: " + usuario.getId());
            System.out.print("Digite su Nombre y Apellidos: ");
            usuario.setNombres(lea.nextLine());
            System.out.print("Digite su correo: ");
            usuario.setCorreo(lea.nextLine());
            System.out.print("Digite su ubicaión \n 1. zona centro \n 2. zona sur \n 3.zona centro \n 4.otra zona: ");
            usuario.setUbicacion(Integer.parseInt(lea.nextLine()));
            System.out.println("Digite el nit de la empresa:");
            local.setNit(lea.nextLine());
            System.out.println("Digite el nombre da la empresa: ");
            local.setNombre(lea.nextLine());
            local.setId();
            System.out.println("Este es el id del local: " + local.getId());
            System.out.println("Digite el nombre de la oferta: ");
            oferta.setTitulo(lea.nextLine());


            System.out.print("Digite la fecha inicial (dd/MM/yyyy): ");
            fechaI = lea.nextLine();
            oferta.setFechaInicio(fechaI);

            System.out.print("Digite la fecha final (dd/MM/yyyy): ");
            fechaF = lea.nextLine();
            oferta.setFechaFin(fechaF);


            System.out.print("Ingrese el valor  del costo por persona : ");
            costoPersona = lea.nextDouble();
            oferta.setCostoPersona(costoPersona);

            System.out.println("Ingresa el numero de reservas:");
            reserva.setReserva(lea.nextInt());

            System.out.print("Digite la fecha de reserva (dd/MM/yyyy): ");
            fechaR = lea.nextLine();
            reserva.setFechaReserva(fechaR);


            reserva.calculiIva(oferta.getCostoPersona());


        }
    }