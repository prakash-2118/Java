import java.util.*;
public class Main {
    public static void printDivisors(int n){
        ArrayList<Integer> divisors=new ArrayList<>();
        for(int i=1;i*i <=n;i++){
            if(n%i==0){
                divisors.add(i);
                if(i!=n/i){
                    divisors.add((n/i));
                }
            }
        }
        Collections.sort(divisors);
        for (int divisor:divisors
             ) {
            System.out.print(divisor+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printDivisors(36);
        printDivisors(88);

    }
}
