import java.util.Scanner;

public class CanPlaceFlowers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int l = sc.nextInt();
        int[] plots = new int[l];
        System.out.println("Enter array elements.. should be series of 0 and 1");
        for(int i=0;i<l;i++){
            plots[i] = sc.nextInt();
        }
        System.out.println("Enter how many flowers you want to add... ");
        int n = sc.nextInt();
        System.out.println("Result is : "+canPlaceFlowers(plots, n));

        sc.close();
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        if(n==0){
            return true;
        }
        else if(flowerbed.length ==1){
            return flowerbed[0] == 0 && 1>=n;
        }
        else if(flowerbed.length == 2){
            return flowerbed[0]==0 && flowerbed[1] == 0 && 1>=n;
        }
        else{
            for(int i = 0 ;i<=flowerbed.length-1;i++){
                if(i == 0){
                    if(flowerbed[i]==0 && flowerbed[i+1]==0) {
                        counter += 1;
                        i += 1;
                    }
                    else {
                        i += 1;
                    }
                }
                else if(i == flowerbed.length-1 && flowerbed[i]==0 && flowerbed[i-1]==0){
                    counter+=1;
                    i+=1;
                }
                else if(flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1]==0){
                    counter+=1;
                    i+=1;
                }
            }
            return (counter >= n);
        }
    }
}
