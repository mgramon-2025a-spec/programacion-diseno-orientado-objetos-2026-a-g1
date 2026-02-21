package Class;

public class Persona {
    private String NumeroDocumento;
    public String Nombre;
    private Byte Edad;
    private Double Peso;
    private Double Estatura;
    private Boolean Genero;

    public void Caminar(){
        System.out.println(this.Nombre+" realiza una caminata en las mañanas. ");
    }
    public void Comer(){
        System.out.println("Tener un buen hábito en las horas de comida, le ayudaría con la salud de "+this.Nombre);
    }

    public Integer Dormir (){
        return 6;
    }

    public String Escuchar(){
        String mensaje;
        mensaje = "Las personas, normalmente, escuchas de 45 a 210 minútos de música por días. ";
        return mensaje;
    }
}
