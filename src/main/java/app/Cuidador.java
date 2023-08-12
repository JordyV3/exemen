package app;
import java.util.List;

public class Cuidador {
    private int id;
    private String nombre;
    private String infoContacto;

    public Cuidador(int id, String nombre, String infoContacto) {
        this.id = id;
        this.nombre = nombre;
        this.infoContacto = infoContacto;
    }

    public void gestionarJaula(Jaula jaula, Animal animal) {
        jaula.agregarAnimal(animal);
    }

    @Override
    public String toString() {
        return "Cuidador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", infoContacto='" + infoContacto + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfoContacto() {
        return infoContacto;
    }

    public void setInfoContacto(String infoContacto) {
        this.infoContacto = infoContacto;
    }
}

