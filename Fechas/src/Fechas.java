import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha formato DD/MM/AAAA:");
        String fecha1 = scanner.nextLine();
        System.out.println("Ingrese la segunda fecha formato DD/MM/AAAA:");
        String fecha2 = scanner.nextLine();

        // día, mes y año de la primera fecha
        int dia1 = Integer.parseInt(fecha1.substring(0, 2));
        int mes1 = Integer.parseInt(fecha1.substring(3, 5));
        int ano1 = Integer.parseInt(fecha1.substring(6));

        // día, mes y año de la segunda fecha
        int dia2 = Integer.parseInt(fecha2.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2.substring(3, 5));
        int ano2 = Integer.parseInt(fecha2.substring(6));

        /*
            Validamos : 
            1) si es mayor por año mostrar
            2) si son del mismo año validaremos el mes 
            3) si son del mismo año y mes, se valida el día
            4) si son del mismo año, mes y dia, se dice que tienen la misma edad
         */
        if (ano1 < ano2) {
            System.out.println("persona 1 es mayor.");
        } else if (ano1 > ano2) {
            System.out.println("persona 2 es mayor.");
        } else {
            if (mes1 < mes2) {
                System.out.println("persona 1 es mayor.");
            } else if (mes1 > mes2) {
                System.out.println("persona 2 es mayor.");
            } else {
                if (dia1 < dia2) {
                    System.out.println("persona 1 es mayor.");
                } else if (dia1 > dia2) {
                    System.out.println("persona 2 es mayor.");
                } else {
                    System.out.println("Tienen la misma edad.");
                }
            }
        }
    }
}
