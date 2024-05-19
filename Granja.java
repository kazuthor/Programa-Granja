import java.util.ArrayList;

/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Granja {
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    // Método para agregar un animal a la granja
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    // Método para obtener la lista de animales en la granja
    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    // Método para contar el número de animales por tipo en la granja
    public int contarAnimalesPorTipo(TipoAnimal tipo) {
        int count = 0;
        for (Animal animal : animales) {
            if (animal.getTipo() == tipo) {
                count++;
            }
        }
        return count;
    }
}