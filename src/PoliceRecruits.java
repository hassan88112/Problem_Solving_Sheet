import java.util.Scanner;

/**
 *   Created By : Hassan Shalash
 *   Date  : 29/8/2023
 */
public class PoliceRecruits {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int events=input.nextInt();
        int police=0;
        int issues=0;

        /*
        11
        -1 -1 2 -1 -1 -1 -1 -1 -1 -1 -1
         */
        for (int i=0 ; i < events;i++){
            int event =input.nextInt();
            if (event == -1){
                if (police == 0){
                    issues++;
                }else {
                    police--;
                }

            }else {
                police += event;
            }
        }
        System.out.println(issues);


    }
}
