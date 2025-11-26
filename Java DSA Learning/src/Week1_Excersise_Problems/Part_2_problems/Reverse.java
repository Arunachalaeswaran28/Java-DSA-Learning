package Week1_Excersise_Problems.Part_2_problems;

public class Reverse {
    public static void main(String[] args) {
        String word = "Navin";
        char [] leter = word.toCharArray();
        int j =leter.length -1;
        for(int i =0; i<= leter.length-1;i++){
            System.out.print(leter[j]);
            j--;
        }
    }

}
