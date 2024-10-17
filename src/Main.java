import java.util.*;

public class Main {


    public static void main(String[] args) {
        // Cria um HashSet
        HashSet<String> conjunto = new HashSet<>();

        // Adiciona elementos ao conjunto
        conjunto.add("João");
        conjunto.add("Maria");
        conjunto.add("Pedro MIguel");
        conjunto.add("João"); // não é adicionado novamente, pois é um conjunto

        // Verifica se o conjunto contém um elemento
        System.out.println(conjunto.contains("João")); // true
        System.out.println(conjunto.contains("Pedro")); // false

        // Remove um elemento do conjunto
        conjunto.remove("Maria");

        // Imprime o conjunto
        System.out.println(conjunto); // [João]

        System.out.println("-----------------------------");

        // Cria um TreeSet
        TreeSet<String> conjunto2 = new TreeSet<>();

        // Adiciona elementos ao conjunto
        conjunto2.add("João");
        conjunto2.add("Maria");
        conjunto2.add("João"); // não é adicionado novamente, pois é um conjunto

        // Verifica se o conjunto contém um elemento
        System.out.println(conjunto2.contains("João")); // true
        System.out.println(conjunto2.contains("Pedro")); // false

        // Remove um elemento do conjunto
        conjunto2.remove("Maria");

        // Imprime o conjunto
        System.out.println(conjunto2); // [João]

        System.out.println("-----------------------------");

        // Cria um LinkedHashSet
        LinkedHashSet<String> conjunto3 = new LinkedHashSet<>();

        // Adiciona elementos ao conjunto
        conjunto3.add("João");
        conjunto3.add("Maria");
        conjunto3.add("João"); // não é adicionado novamente, pois é um conjunto

        // Verifica se o conjunto contém um elemento
        System.out.println(conjunto3.contains("João")); // true
        System.out.println(conjunto3.contains("Pedro")); // false

        // Remove um elemento do conjunto
        conjunto3.remove("Maria");

        // Imprime o conjunto
        System.out.println(conjunto3); // [João]

        System.out.println("-----------------------------");

        Set<Integer> a =new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b =new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
        //Union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);
        //Intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);
        //Difference
        Set<Integer> difference = new TreeSet<>(a);
        difference.removeAll(b);
        System.out.println(difference);

        System.out.println("oKK");
    }
}