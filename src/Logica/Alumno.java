package Logica;

// Declaramos la clase alumno, con sus atributos
public class Alumno {
    int id;
    String nombre;
    String apellido;

    //Metodo constructor vacio, sin parametros
    public Alumno() {
    }

    //Metodo constructor con parametros, el cual nos sirve para crear un objeto.
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Metodo mostrar nombre, el cual nos imprime el mensaje deseado.
    public void mostrarNombre() {
        System.out.println("Hola soy un alumno y puedo decir mi nombre");
    }




    }




