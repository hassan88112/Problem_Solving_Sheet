import java.util.Scanner;

public class A_Word {
/**
 *   Created By : Hassan Shalash
 *   Date  : 20/6/2023
 */
    public static void main(String[] args) {

        // TODO created with hassan shalash for Fourth trial ## DONE
        Scanner scanner=new Scanner(System.in);
        String value1=scanner.next();  // Hassan = hassan  || haSSAN = HASSAN  || HASsan = hassan
        int numLower = 0;
        int numUpper = 0;

        for (int i=0 ;i <value1.length() ;i++){
           char c1=value1.charAt(i);
            if (Character.isLowerCase(c1)){
               numLower++;
            } else {
               numUpper++;
            }
        }
        if (numLower > numUpper){
            System.out.println(value1.toLowerCase());
        } else if (numLower < numUpper) {
            System.out.println(value1.toUpperCase());
        }else {
            System.out.println(value1.toLowerCase());
        }
    }
}
