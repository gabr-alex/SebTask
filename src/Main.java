import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Generator generator = new Generator();

        int times = 1000000;
        long numOne=65;
        long numTwo=8921;
        long numThree= 635;
        long numFour = 12;

        long coefOne=16807;
        long coefTwo=48271;

        long devider = 2147483647;

        ArrayList<String> array1 = generator.generate(times, numOne, coefOne, devider);
        ArrayList<String> array2 = generator.generate(times, numTwo, coefTwo, devider);


        ArrayList<String> array3 = generator.generate(times, numThree, coefOne, devider);
        ArrayList<String> array4 = generator.generate(times, numFour, coefTwo, devider);


        Comparator.comapre(array1, array2, numOne, numTwo);
        Comparator.comapre(array3, array4, numThree, numFour);





    }
}
