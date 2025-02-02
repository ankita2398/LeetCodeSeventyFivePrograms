/* Question Link: https://leetcode.com/problems/merge-strings-alternately
*/
import java.util.Scanner;

public class MergeStringsAlternatively {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("First word");
            String s1 = sc.nextLine();
            System.out.println("Second Word");
            String s2 = sc.nextLine();
// commented code solves the problem but time complexity is high
//            char[] s1Char = s1.toCharArray();
//            char[] s2Char = s2.toCharArray();
//            String result = "";
//            if (s1Char.length == s2Char.length) {
//                for (int i = 0; i < s1Char.length; i++) {
//                    result = result + s1Char[i] + s2Char[i];
//                }
//            } else if (s1Char.length > s2Char.length) {
//                for (int i = 0; i < s2Char.length; i++) {
//                    result = result + s1Char[i] + s2Char[i];
//                }
//                for (int j = s2Char.length; j < s1Char.length; j++) {
//                    result = result + s1Char[j];
//                }
//            } else {
//                for (int i = 0; i < s1Char.length; i++) {
//                    result = result + s1Char[i] + s2Char[i];
//                }
//                for (int j = s1Char.length; j < s2Char.length; j++) {
//                    result = result + s2Char[j];
//                }
//            }
            String result = mergeStringsAlternatively(s1,s2);

            System.out.println("result: " + result);
            System.out.println("Press any key to continue and n to stop");
            input = sc.nextLine();

        }while(!input.equals("n"));

    }

    //better solution with O(n) time complexity
    public static String mergeStringsAlternatively(String w1, String w2){
        StringBuffer result=new StringBuffer();
        char[] c1 = w1.toCharArray();
        char[] c2 = w2.toCharArray();
        int i = 0,j = 0;
        while(i<c1.length || j<c2.length){
            if(i<c1.length){
                result.append(c1[i++]);}
            if(j<c2.length){
                result.append(c2[j++]);}
        }
        return new String(result);
    }
}
