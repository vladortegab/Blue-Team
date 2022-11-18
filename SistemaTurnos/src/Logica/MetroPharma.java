package Logica;

public class MetroPharma {

    public static void main(String[] args) {

        menuRegistro();
        ejecutar();




    }

    public static int  menuRegistro(){
        String opciones=
                "\n MENU PINCIPAL DE LA FARMACIA "+
                        "\n1.Registrar Usuario."+
                        "\n2.Registrar Asesor."+
                        "\n3.Registrar Administrador."+
                        "\n4.Iniciar Sesión."+
                        "\n5.Ver turno actual."+
                        "\n6.Siguiente turno."+
                        "\n7.Salir"+
                        "\nSeleccione Opcion: ";
        return Integer.parseInt(Lector.leer(opciones));
    }

    public static void ejecutar() {
        int opt;
        Registro persona;

        do{
            opt = menuRegistro();
            switch (opt){
                case 1:
                    persona = new RegistroCliente();
                    persona.crearPersona();
                    persona.mostrarRegistros();
                    break;
                case 2:
                    persona = new RegistroAsesor();
                    persona.crearPersona();
                    break;
                case 4:
                    Cliente cliente = new Cliente();
                    cliente.ingresar();
                    persona=new RegistroCliente();
                    persona.mostrarRegistros();
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("La opcion no es valida");
            }

        }while (opt!=7);
    }



}
