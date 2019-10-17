import java.util.ArrayList;

public class Generator {





        public ArrayList<String> generate(int times, long number, long coef, long devider) {

            ArrayList<Long> list = new ArrayList<>();
            list.add(number);

            ArrayList<String> binaryList = new ArrayList<>();

            for (int i = 0; i < times; i++) {

                long numberS = list.get(list.size()-1);
                long newNum;
                long tempNum = numberS;
                newNum = tempNum * coef;
                tempNum = newNum % devider;
                list.add(tempNum);


                String binaryNum = Long.toBinaryString(tempNum);
                if(binaryNum.length()>=8){
                    String newBinary = binaryNum.substring(binaryNum.length() - 8, binaryNum.length());
                    binaryList.add(newBinary);
                }else {
                    binaryList.add(binaryNum);
                }



            }

            return binaryList;
        }
    }

