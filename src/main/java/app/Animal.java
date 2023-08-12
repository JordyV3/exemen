package app;
public class Animal {
    private int id;
    private String nombre;
    private String especie;
    private int edad;
    private String genero;

    public Animal(int id, String nombre, String especie, int edad, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.genero = genero;
    }

    public Animal() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Constructor y métodos getters y setters
}
