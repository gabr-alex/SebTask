import java.util.ArrayList;

public class Comparator {

    public static  void comapre(ArrayList<String> first, ArrayList<String> second, long numOne, long numTwo){

        int count = 0;
        for (int i = 0; i < first.size(); i++) {

            if (first.get(i).equals(second.get(i))) {
                count++;
            }
        }
        System.out.println("Su parametrais " +numOne+ " ir "+numTwo+ ",rezulatas "+ count);

    }
}
