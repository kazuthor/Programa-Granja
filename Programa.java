import java.util.ArrayList;

/**
 * Write a description of class Programa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Programa {

    // Método principal que inicia el programa
    public static void main(String[] args) {
        Granja granja = new Granja();
        // Crear objetos de animales y agregarlos a la granja
        Fecha fechaNacimiento = new Fecha(1, 1, 2023);
        Animal gallina = new Animal(1, "Clara", 2.7, TipoAnimal.GALLINA, fechaNacimiento, 110);
        Animal vaca = new Animal(2, "Lola", 400.0, TipoAnimal.VACA, fechaNacimiento, 12.0);
        Animal cerdo = new Animal(3, "Pedro", 140.0, TipoAnimal.CERDO, fechaNacimiento, 18);
        Animal nuevaGallina = new Animal(4, "Ana", 2.9, TipoAnimal.GALLINA, fechaNacimiento, 95);
        Animal otraGallina = new Animal(5, "Elena", 2.5, TipoAnimal.GALLINA, fechaNacimiento, 100);
        granja.agregarAnimal(gallina);
        granja.agregarAnimal(vaca);
        granja.agregarAnimal(cerdo);
        granja.agregarAnimal(nuevaGallina);
        granja.agregarAnimal(otraGallina);


        // Mostrar la información de los animales en la granja
        mostrarInformacionAnimales(granja);
    }

    // Método para mostrar la información de los animales en la granja
    public static void mostrarInformacionAnimales(Granja granja) {
        ArrayList<Animal> animales = granja.getAnimales();
        System.out.println("Información de los animales en la granja:");

        // Iterar sobre cada animal en la granja
        for (Animal animal : animales) {
            // Mostrar información básica del animal
            System.out.println("Nombre: " + animal.getNombre());
            System.out.println("Tipo: " + animal.getTipo());
            System.out.println("Edad: " + animal.calcularEdad() + " años");

            // Mostrar información específica según el tipo de animal
            if (animal.getTipo() == TipoAnimal.GALLINA) {
                System.out.println("Número de huevos: " + animal.getCaracteristicaEspecial());
            } else if (animal.getTipo() == TipoAnimal.VACA) {
                System.out.println("Litros de leche: " + animal.getCaracteristicaEspecial());
            } else if (animal.getTipo() == TipoAnimal.CERDO) {
                System.out.println("Grasa: " + animal.getCaracteristicaEspecial() + " kg");
            }

            System.out.println();
        }

        // Contar y mostrar el número de animales por tipo en la granja
        int numGallinas = granja.contarAnimalesPorTipo(TipoAnimal.GALLINA);
        int numVacas = granja.contarAnimalesPorTipo(TipoAnimal.VACA);
        int numCerdos = granja.contarAnimalesPorTipo(TipoAnimal.CERDO);

        System.out.println("Número de gallinas en la granja: " + numGallinas);
        System.out.println("Número de vacas en la granja: " + numVacas);
        System.out.println("Número de cerdos en la granja: " + numCerdos);
    }
}