import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("A1ttttt");
        A.add("A5");
        A.add("A3");
        A.add("A2dd");
        A.add("A4qqq");
        System.out.println(A);
        ArrayList<String> B = new ArrayList<>();
        B.add("B2");
        B.add("B5");
        B.add("B3");
        B.add("B4");
        B.add("B1");
        ArrayList<String> C = new ArrayList<>();
        Iterator<String> iterB = B.iterator();
        Iterator<String> iterA = A.iterator();
        while (iterA.hasNext() && iterB.hasNext()){
            C.add(iterA.next());
            C.add(iterB.next());
        }
        System.out.println(C);



        A.sort(new Comparator<String>() {
                   @Override
                   public int compare(String o1, String o2) {
                       return o1.length() - o2.length();
                   }
               });
        System.out.println(A);

    }
}
