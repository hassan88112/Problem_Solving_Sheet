import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *   Created By : Hassan Shalash
 *   Date  : 10/08/2023
 */

public class Streams {

    public static void main(String[] args) {

        List<Integer> numberStreams= Arrays.asList(10,15,20,25,30);
        List<Integer> evenNumber=new ArrayList<>();

        evenNumber=numberStreams.stream().filter(n -> n%2!=0).collect(Collectors.toList());
        System.out.println(evenNumber);




    }
}