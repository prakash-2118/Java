public class Main {
    public static void main(String[] args) {
        int num = 2118;
        int count=0;
        while(num>0){
           int digits=num%10;
           count++;
           num=num/10;

        }

        System.out.println(count);
    }
}
