package Logica;

public class Cliente implements Persona{

    private TurnoSingleton turno;

    @Override
    public void ingresar() {
        String cedula = Lector.leer("Ingrese su cedula: ");
        RegistroCliente registro = new RegistroCliente("");
        System.out.println("1");
        if (registro.buscarRegistros(cedula)){
            registro.asignarTurno(cedula);
            System.out.println("2");
        }

    }
}
