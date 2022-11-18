package Logica;

import java.util.ArrayList;

public class RegistroCliente extends Registro{

    int turno;

    public RegistroCliente(String nombre, String apellido, String cedula, String correo, int rol, int turnoexacto) {
        super(nombre, apellido, cedula, correo, rol);
        this.turno=turnoexacto;
    }

    @Override
    public void mostrarRegistros() {
        int cantidadDatos = ListaCliente.size();
        for(int i=0; i<cantidadDatos ;i++ ) {
            RegistroCliente registro = ListaCliente.get(i);
            System.out.println(registro.nombre+"-"+registro.apellido+"turno: "+registro.turno);
        }
    }

    public void asignarTurno(String cedula){
        TurnoSingleton turnoSingleto = TurnoSingleton.getInstancia();
        int turno1= turnoSingleto.asignarTurno();
        int cantidadDatos = ListaCliente.size();
        for(int i=0; i<cantidadDatos ;i++ ) {
            RegistroCliente registro = ListaCliente.get(i);
            if (registro.cedula==cedula){
                ListaCliente.get(i).turno=turno1;
            }
            else {
                System.out.println("usuario no registrado");
            }
        }
    }


    public boolean buscarRegistros(String cedula) {
        int cantidadDatos = ListaCliente.size();
        for(int i=0; i<cantidadDatos ;i++ ) {
            RegistroCliente registro = ListaCliente.get(i);
            if (registro.cedula==cedula){
                System.out.println(registro.nombre+"-"+registro.apellido);
                return true;
            }
            else {
                System.out.println("usuario no registrado");
                return false;
            }
        }
        return false;
    }

    public static ArrayList<RegistroCliente> ListaCliente = new ArrayList();

    @Override
    public Persona crearPersona(){
        return new Cliente();
    }

    @Override
    public void guardarRegistro() {
        TurnoSingleton turnoSingleton=TurnoSingleton.getInstancia();
        ListaCliente.add( new RegistroCliente(super.nombre, super.apellido, super.cedula, super.correo, super.rol, turno));
    }

    public RegistroCliente(){
        registrar();
        guardarRegistro();
    }

    public RegistroCliente(String m){

    }







}
