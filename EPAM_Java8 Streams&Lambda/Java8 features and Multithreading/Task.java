import java.util.*;
import java.util.stream.*;


public class HelloWorld{
    
    public static boolean isPalindrome(String input) {
    String temp = input.replaceAll("\\s+", "").toLowerCase();
    return IntStream.range(0, input.length() / 2)
        .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    public static List<String> search(List<String> list) {
        return list.stream()
        .filter(s -> s.startsWith("a"))
        .filter(s -> s.length() == 3)
        .collect(Collectors.toList());
    }
    public static Double average(List<Integer> list) {
    return list.stream()
    .mapToInt(i -> i)
    .average()
    .getAsDouble();
    }
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            l.add(k);
        }
        System.out.println(average(l));
        List<String> s=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String s1=sc.next();
            s.add(s1);
        }
        List<String> ret=search(s);
        for(String s1:ret)
        {
            System.out.println(s1);
        }
        List<String> ret2=new ArrayList<>();
        for(String s1:s)
        {
            if(isPalindrome(s1))
            {
                ret2.add(s1);
                System.out.println(s1);
            }
        }
        
     }
}
