public class ej3Array implements ej3estadisticas {
    private double[] arreglo;

    public ej3Array(double[] arreglo) {
        this.arreglo = arreglo;
    }

    public double minimo() {
        double min = arreglo[0];
        for (double num : arreglo) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public double maximo() {
        double max = arreglo[0];
        for (double num : arreglo) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double sumatorio() {
        double sum = 0;
        for (double num : arreglo) sum += num;{

        }
        return sum;
    }

    }

