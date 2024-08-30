import java.util.*;
public class Main {
    public static int findGCD(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
            if(a==0){
                return b;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println(findGCD(48,18));

    }
}
