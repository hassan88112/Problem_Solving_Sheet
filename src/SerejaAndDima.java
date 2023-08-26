import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *   Created By : Hassan Shalash
 *   Date  : 26/8/2023
 */
public class SerejaAndDima {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cardSize=input.nextInt();
        int arr[] =new int[cardSize];

        for (int i=0;i < cardSize ; i++){
            arr[i]=input.nextInt();
        }

        int player1 =0;
        int player2 =0;
        int playerFlag=0;
        int start=0;
        int end=cardSize - 1;
        int max=0;
        while (start <= end){
            if (arr[start] > arr[end]){
                max = arr[start];
                start++;
            }else {
                max = arr[end];
                end--;
            }
            if (playerFlag % 2 == 0){
                player1 += max;
            }else {
                player2 += max;
            }
            playerFlag++;
        }
        System.out.println(player1 + " " +player2);

    }


}
