
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor de la clase Fecha
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Método para calcular la edad a partir de la fecha de nacimiento
    public int calcularEdad() {
        int añoActual = 2024; // Se puede cambiar al año actual
        int edad = añoActual - año;
        return edad;
    }
}