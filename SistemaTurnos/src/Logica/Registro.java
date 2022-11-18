package Logica;

import java.util.ArrayList;

public abstract class Registro {

    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String correo;
    protected int rol;

    public Registro(String nombre, String apellido, String cedula, String correo, int rol){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.correo=correo;
        this.rol=rol;
    }


    public abstract void mostrarRegistros();
    public abstract Persona crearPersona();
    public abstract void guardarRegistro();

    public String mostrarDatos(){
        return ("\n Nombre: " + nombre + "\n Apellido: " + apellido + "\n Cédula: " + cedula + "Correo: " + correo + "\n Rol: " + rol );
    }

    public void registrar() {
        nombre = Lector.leer("Ingrese nombres: ");
        apellido = Lector.leer("Ingrese apellidos: ");
        cedula = Lector.leer("Ingrese cedula: ");
        correo = Lector.leer("Ingrese correo: ");
        rol = Integer.parseInt(Lector.leer("Ingrese rol: "));
    }

    public Registro(){}










}
