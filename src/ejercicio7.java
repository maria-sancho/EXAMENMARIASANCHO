import java.util.HashMap;
import java.util.Map;

public class ejercicio7 {
    private Map<String, Integer> nacionalidades;

    public ejercicio7() {
        nacionalidades = new HashMap<>();
    }

    public void addAlumno(String nacionalidad) throws ejercicio7_1 {
        if (nacionalidad.isEmpty()) {
            throw new ejercicio7_1("La nacionalidad no puede estar vacía.");
        }

        nacionalidades.put(nacionalidad.toUpperCase(), nacionalidades.getOrDefault(nacionalidad.toUpperCase(), 0) + 1);
    }

    public void showAll() {
        for (Map.Entry<String, Integer> entry : nacionalidades.entrySet()) {
            System.out.println("Nacionalidad: " + entry.getKey() + ", Alumnos: " + entry.getValue());
        }
    }

    public void showNacionalidad(String nacionalidad) {
        int alumnos = nacionalidades.getOrDefault(nacionalidad.toUpperCase(), 0);
        System.out.println("Nacionalidad: " + nacionalidad.toUpperCase() + ", Alumnos: " + alumnos);
    }

    public void cuantos() {
        int cantidadNacionalidades = nacionalidades.size();
        System.out.println("Cantidad de nacionalidades diferentes: " + cantidadNacionalidades);
    }

    public void borra() {
        nacionalidades.clear();
        System.out.println("Datos eliminados.");
    }
}
