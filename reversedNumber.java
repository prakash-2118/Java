public class Main {
    public static void main(String[] args) {
        int num = 210518;
        int reversedNum=0;
        while(num>0){
            int lastDigit=num%10;
            num=num/10;
            reversedNum = (reversedNum*10)+lastDigit;
        }
        System.out.println(reversedNum);
    }
}
