import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxInt = Integer.MIN_VALUE;
        int val;

        for (int i = 1; i<=n; i++){
            val = sc.nextInt();
            maxInt = Math.max(maxInt, val);
//            if (val > maxInt){
//                maxInt = val;
//            }
        }
        System.out.println(maxInt);
        int num = 0;
        int digits = 0;
        while (num > 0){
//            System.out.println(i);
            num = num/10;
            digits++;
        }
        System.out.println(digits);

//      do while loop
        int i = 0;
        do {
            System.out.println(i);
            i--;
        }while(i>0);

//      random game
        while (true){
            int number = (int)(Math.random()*10 +1); //random range : 0.0 - 1.0
            if (number==5){
                System.out.println("encountered 5");
                break;
            }
            System.out.print(number+" ");
        }

//      arrays
        int[] marks = new int[10];
        System.out.println(marks.length);

//      for each loop
        marks = new int[]{1, 2, 3, 4, 6, 3, 2, 1};
        for (int m : marks){
            System.out.println("The marks is : "+m);
        }
    }
}
