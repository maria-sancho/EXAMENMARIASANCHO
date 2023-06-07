public class ejercicio3 {
    public static void Main (String[] args) {
        double[] num = {5, 6, 2, 10, 5.5, 4.6};

        ej3Array array = new ej3Array(num);

        System.out.println(("Valor mínimo: " + array.minimo()));
        System.out.println(("Valor máximo: " + array.maximo()));
        System.out.println(("Suma total: " + array.sumatorio()));
    }
}
