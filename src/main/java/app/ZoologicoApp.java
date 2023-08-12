package app;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ZoologicoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jaula> jaulas = new ArrayList<>();
        List<Cuidador> cuidadores = new ArrayList<>();

        jaulas.add(new Jaula(1, 5));
        jaulas.add(new Jaula(2, 3));

        cuidadores.add(new Cuidador(1, "Danilo", "danilo.@zoologico.com"));

        // Menú principal
        int opcion;
        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Agregar animal");
            System.out.println("2. Mostrar animales en jaula");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarAnimal(jaulas, cuidadores);
                    break;
                case 2:
                    mostrarAnimales(jaulas);
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static void agregarAnimal(List<Jaula> jaulas, List<Cuidador> cuidadores) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Agregar Animal:");
        System.out.print("Nombre del animal: ");
        String nombre = scanner.nextLine();
        System.out.print("Especie: ");
        String especie = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Género: ");
        String genero = scanner.next();
        scanner.nextLine();

        System.out.println("Seleccione una jaula:");
        for (Jaula jaula : jaulas) {
            System.out.println(jaula.getNumeroJaula() + ". Capacidad: " + jaula.getCapacidad());
        }
        int seleccionJaula = scanner.nextInt();

        Animal nuevoAnimal = new Animal();
        nuevoAnimal.setNombre(nombre);
        nuevoAnimal.setEspecie(especie);
        nuevoAnimal.setEdad(edad);
        nuevoAnimal.setGenero(genero);

        Jaula jaulaSeleccionada = jaulas.get(seleccionJaula - 1);
        Cuidador cuidadorAsignado = cuidadores.get(0);  // Asignar al primer cuidador por simplicidad
        cuidadorAsignado.gestionarJaula(jaulaSeleccionada, nuevoAnimal);

        System.out.println("Animal agregado con éxito a la jaula " + jaulaSeleccionada.getNumeroJaula());
    }

    public static void mostrarAnimales(List<Jaula> jaulas) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mostrar Animales en Jaula:");
        System.out.println("Seleccione una jaula:");

        for (Jaula jaula : jaulas) {
            System.out.println(jaula.getNumeroJaula() + ". Capacidad: " + jaula.getCapacidad());
        }

        int seleccionJaula = scanner.nextInt();

        Jaula jaulaSeleccionada = jaulas.get(seleccionJaula - 1);
        List<Animal> animalesEnJaula = jaulaSeleccionada.obtenerAnimales();

        System.out.println("Animales en jaula " + jaulaSeleccionada.getNumeroJaula() + ":");

        if (animalesEnJaula.isEmpty()) {
            System.out.println("No hay animales en esta jaula.");
        } else {
            for (Animal animal : animalesEnJaula) {
                System.out.println("Nombre: " + animal.getNombre());
                System.out.println("Especie: " + animal.getEspecie());
                System.out.println("Edad: " + animal.getEdad());
                System.out.println("Género: " + animal.getGenero());
                System.out.println("-----------------------");
            }
        }
    }
}
