public class ejercicio7Probar {
    public static void main(String[] args) {
        ejercicio7 colegio = new ejercicio7();

        try {
            colegio.addAlumno("Español");
            colegio.addAlumno("Español");
            colegio.addAlumno("Inglés");
            colegio.addAlumno("Francés");
            colegio.addAlumno("Inglés");
            colegio.addAlumno("Alemán");
        } catch (ejercicio7_1 e) {
            System.out.println(e.getMessage());
        }

        colegio.showAll();

        colegio.showNacionalidad("Español");

        colegio.cuantos();

        colegio.borra();
    }
}
