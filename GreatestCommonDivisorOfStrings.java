import java.util.Scanner;

public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();

        int len1=str1.length();
        int len2=str2.length();
        int gcd=1;
        int min=Math.min(len1,len2);

        if(!(str1+str2).equals(str2+str1)){
            System.out.println("Answer is: \"\"");
        }
        else {
            for(int i=2;i<=min;i++){
                if(len1%i==0 &&len2%i==0){
                    gcd=i;
                }
            }
            System.out.println("Answer is: "+str1.substring(0,gcd));
        }
    }

}
