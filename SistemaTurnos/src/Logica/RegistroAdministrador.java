package Logica;

import java.util.ArrayList;

public class RegistroAdministrador extends Registro{

    public RegistroAdministrador(String nombre, String apellido, String cedula, String correo, int rol) {
        super(nombre, apellido, cedula, correo, rol);
    }

    @Override
    public void mostrarRegistros() {

    }

    private ArrayList<Admin> ListaAdmin = new ArrayList();

    @Override
    public Persona crearPersona(){
        return new Admin();
    }

    public void guardarRegistro(){
        registrar();

    }


}
