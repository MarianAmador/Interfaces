public class Interfaces implements Aritmeticos {
    public static void main(String[] args) {
        System.out.println(new Interfaces().suma(20, 3));
        System.out.println(new Interfaces().resta(25, 10));
        System.out.println(new Interfaces().multiplicacion(3, 10));
        System.out.println(new Interfaces().division(8, 2));
    }

    public int suma(int x, int y) {
        return x+y;
    }

    public int resta(int x, int y) {
        return x-y;
    }

    public int multiplicacion(int x, int y) {
        return x*y;
    }

    public float division(int x, int y) {
        return (float) x/y;
    }
}

