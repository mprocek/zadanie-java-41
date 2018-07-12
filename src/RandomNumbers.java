import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class RandomNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int size;

        do {
            System.out.println("Podaj ilość losowanych licz (liczba dodatnia): ");
            size = scan.nextInt();
        } while (size <= 0);

        for(int i=0; treeSet.size()<size;i++){
            treeSet.add(rand.nextInt(1000));
        }

        System.out.println("Najmniejsza: " + treeSet.first());
        System.out.println("Największa: " + treeSet.last());

        int sum = 0;

        Iterator<Integer> integerIterator = treeSet.iterator();
        while (integerIterator.hasNext()) {
            sum += integerIterator.next();
        }

        double srednia = sum / treeSet.size();

        System.out.println("Srednia: " + srednia);

        for (Integer num : treeSet) {
            if (num > srednia)
                System.out.println(num);
        }
    }
}
