public class ConversorTemperatura {
    public static void main(String[] args) {
        double celsius = -100;
        double fahrenheit = (celsius * 1.8)+32;
        System.out.printf(celsius + " grados celsius es igual a " + fahrenheit + " grados fahrenheit\n");

        int entero = (int)fahrenheit;
        System.out.printf("Grados fahrenheit:\n" + entero);

    }
}
