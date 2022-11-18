package Logica;

public class TurnoSingleton {

    private int turnoActual;
    private int turnoAsignado=0;
    private static TurnoSingleton unicaInstancia;

    public static TurnoSingleton getInstancia(){
        if(unicaInstancia == null)
            unicaInstancia = new TurnoSingleton();
            return unicaInstancia;
    }

    public int turnoActual(){
        return turnoActual;
    }

    public int asignarTurno(){
        return turnoAsignado++;
    }

    public int siguienteTurno(){
        return turnoActual++;
    }

    private TurnoSingleton() {}
}
