/* Question Link: https://leetcode.com/problems/reverse-vowels-of-a-string
*/
import java.util.Scanner;

public class ReverseVowels {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:: ");
        String input = sc.nextLine();

        char[] charInput = input.toCharArray();

        int i=0;
        int j=charInput.length-1;
        int icounter = 0;
        int jcounter = 0;

        while(i<j){
            if(icounter == 0){
                if(charInput[i]=='a'||charInput[i]=='e'||charInput[i]=='i'||charInput[i]=='o'
                        ||charInput[i]=='u'||charInput[i]=='A'||charInput[i]=='E'||charInput[i]=='I'
                        ||charInput[i]=='O'||charInput[i]=='U'){
                    icounter += 1;
                }
                else {
                    i++;
                }
            }

            if(jcounter==0) {
                if (charInput[j] == 'a' || charInput[j] == 'e' || charInput[j] == 'i' || charInput[j] == 'o'
                        || charInput[j] == 'u' || charInput[j] == 'A' || charInput[j] == 'E' || charInput[j] == 'I'
                        || charInput[j] == 'O' || charInput[j] == 'U') {
                    jcounter += 1;
                } else {
                    j--;
                }
            }

            if(icounter==1 && jcounter == 1){
                charInput = swap(charInput, i, j);
                icounter = 0;
                jcounter = 0;
                i+=1;
                j-=1;
            }
        }

        String result = String.valueOf(charInput);
        System.out.println("Result is: "+ result);


    }

    public static char[] swap(char[] input, int first, int second){
        char temp = input[first];
        input[first] = input[second];
        input[second] = temp;
        return input;
    }

}
