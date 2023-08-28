import java.util.Scanner;

/**
 *   Created By : Hassan Shalash
 *   Date  : 28/8/2023
 */
public class Stones {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        String v1=input.next();
        char [] values=v1.toCharArray();
        int counter=0;

        for (int i=0;i < number ; i++){
            if (i != number-1 && values[i] == values[i+1]){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
