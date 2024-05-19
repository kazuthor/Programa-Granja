
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Animal {
    private int id;
    private String nombre;
    private double peso;
    private TipoAnimal tipo;
    private Fecha fechaNacimiento;
    private double caracteristicaEspecial; // Puede ser el número de huevos, litros de leche, grasa, etc.

    // Constructor de la clase Animal
    public Animal(int id, String nombre, double peso, TipoAnimal tipo, Fecha fechaNacimiento, double caracteristicaEspecial) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
        this.caracteristicaEspecial = caracteristicaEspecial;
    }

    // Método para calcular la edad del animal
    public int calcularEdad() {
        return fechaNacimiento.calcularEdad();
    }

    // Métodos getters para obtener la información del animal
    public String getNombre() {
        return nombre;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public double getCaracteristicaEspecial() {
        return caracteristicaEspecial;
    }
}