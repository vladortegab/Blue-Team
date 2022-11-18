package Logica;

import java.util.ArrayList;

public class RegistroAsesor extends Registro{


    public RegistroAsesor(String nombre, String apellido, String cedula, String correo, int rol) {
        super(nombre, apellido, cedula, correo, rol);
    }

    @Override
    public void mostrarRegistros() {

    }

    private ArrayList<RegistroAsesor> ListaAsesor = new ArrayList();


    @Override
    public Persona crearPersona() {
        return new Asesor();
    }

    @Override
    public void guardarRegistro() {
        ListaAsesor.add( new RegistroAsesor(super.nombre, super.apellido, super.cedula, super.correo, super.rol));
    }

    public RegistroAsesor(){
        registrar();
        guardarRegistro();
    }
}
