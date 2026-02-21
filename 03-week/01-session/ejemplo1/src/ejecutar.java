import Class.Persona;
public class ejecutar {
    public static void main(String[] args) {
        System.out.println("Ejemplo 1: Diagrama de clase - UML - POO");

        Persona persona = new Persona();
        persona.Nombre = "Pepito Peréz"; //Falaría aplicar concepto 'Encapsulamiento'
        persona.Caminar();
        persona.Comer();
        persona.Escuchar();
        System.out.println("Las personas, normalmente, duermen "+persona.Dormir()+" horas.");

        Persona persona2 = new Persona();
        persona2.Nombre = "Andriana María"; //Falaría aplicar concepto 'Encapsulamiento'
        persona2.Caminar();
        persona2.Comer();
        persona2.Escuchar();
        System.out.println("Las personas, normalmente, duermen "+persona2.Dormir()+" horas.");
    }
}
