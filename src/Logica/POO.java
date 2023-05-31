package Logica;

public class POO {
    public static void main(String[] args) {

        /*Con el new Alumno, lo que hacemos es llamar al constructor. Si no paso parametros
        estoy llamando al constructor vacio y si paso parametros llamo al constructor declarado con parametros */

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5,"Paco","De Lucia");

        System.out.println("El id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());

        alu1.setId(8);
        alu1.setNombre("Luis");
        alu1.setApellido("Salinas");
        System.out.println("------------------------------");
        System.out.println("El id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());

        //Cambio de valor mediante el setter
        alu2.setId(35);
        System.out.println("-------------------------------");
        System.out.println("El id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());



    }
}