import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ejercicio5 {
    public static void main(String[] args) {
        List<String> listaUno = new ArrayList<>();
        listaUno.add("Lunes");
        listaUno.add("Martes");
        listaUno.add("Miércoles");
        listaUno.add("Jueves");
        listaUno.add("Viernes");
        listaUno.add("Sábado");
        listaUno.add("Domingo");

        listaUno.add(4, "Juernes");

        List<String> listaDos = new ArrayList<>(listaUno);

        listaUno.addAll(listaDos);


        System.out.println("Elemento en la posición 3: " + listaUno.get(2));
        System.out.println("Elemento en la posición 4: " + listaUno.get(3));

        System.out.println("Primer elemento: " + listaUno.get(0));
        System.out.println("Último elemento: " + listaUno.get(listaUno.size() - 1));


        boolean eliminado = listaUno.remove("Juernes");
        if (eliminado) {
            System.out.println("Se ha eliminado el elemento 'Juernes' de la lista.");
        } else {
            System.out.println("No se ha encontrado el elemento 'Juernes' en la lista.");
        }


        System.out.println("Elementos de la lista original:");
        Iterator<String> iterator = listaUno.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        boolean existeLunes = listaUno.contains("Lunes");
        System.out.println("¿Existe 'Lunes' en la lista?: " + existeLunes);

        boolean existeLunesIgnoreCase = false;
        for (String elemento : listaUno) {
            if (elemento.equalsIgnoreCase("Lunes")) {
                existeLunesIgnoreCase = true;
                break;
            }
        }
        System.out.println("¿Existe 'Lunes' (ignorando mayúsculas/minúsculas) en la lista?: " + existeLunesIgnoreCase);


        listaUno.sort(String::compareToIgnoreCase);
        System.out.println("Lista ordenada:");
        for (String elemento : listaUno) {
            System.out.println(elemento);
        }

        listaUno.clear();
        System.out.println("Lista después de borrar todos los elementos: " + listaUno);
    }
}
