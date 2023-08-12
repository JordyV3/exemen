package app;
import java.util.ArrayList;
import java.util.List;

public class Jaula {
    private int numeroJaula;
    private int capacidad;
    private List<Animal> animales;

    public Jaula(int numeroJaula, int capacidad) {
        this.numeroJaula = numeroJaula;
        this.capacidad = capacidad;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        if (animales.size() < capacidad) {
            animales.add(animal);
            System.out.println("Animal agregado a la jaula " + numeroJaula);
        } else {
            System.out.println("La jaula está llena, no se puede agregar más animales.");
        }
    }

    @Override
    public String toString() {
        return "Jaula{" +
                "numeroJaula=" + numeroJaula +
                ", capacidad=" + capacidad +
                ", animales=" + animales +
                '}';
    }

    public Jaula(int numeroJaula, int capacidad, List<Animal> animales) {
        this.numeroJaula = numeroJaula;
        this.capacidad = capacidad;
        this.animales = animales;
    }

    public int getNumeroJaula() {
        return numeroJaula;
    }

    public void setNumeroJaula(int numeroJaula) {
        this.numeroJaula = numeroJaula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public List<Animal> obtenerAnimales() {
        return animales;
    }
}


