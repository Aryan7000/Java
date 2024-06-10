import java.util.*;
class sortExample{
public static void main(String[] args)
{
List<Integer>list=Arrays.asList(-9,-8,3,15);
System.out.println("The sorted stream is:");
list.stream().sorted().forEach(System.out::println)



}


}kb