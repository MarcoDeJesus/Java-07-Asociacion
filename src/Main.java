public class Main {
    public static void main(String args[]){
        EstadoDeLaRepublicaMexicana jalisco = new EstadoDeLaRepublicaMexicana();
        jalisco.nombre = "JALISCO";

        Ciudadano marco = new Ciudadano();
        marco.rfc = "LEMX660412";
        marco.estadoDeLaRepublica = jalisco;

        System.out.println(String.format("El ciudadano Mexicano con RFC '%s' vive en: ", marco.rfc));

        marco.mostrarEstadoResidencia();
    }
}

class Ciudadano {
    String rfc;
    EstadoDeLaRepublicaMexicana estadoDeLaRepublica;

    void mostrarEstadoResidencia(){
        System.out.println(estadoDeLaRepublica.nombre);
    }
}

class EstadoDeLaRepublicaMexicana {
    public String nombre;
}
