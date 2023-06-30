import java.util.Scanner;

public class datatype {
    public static void main(String[] args){
        byte b = 125;
        System.out.println(b);

        short s = 32000;
        System.out.println(s);

        int i = 10;
        System.out.println(i);

        long l = 100_000_000_000_002L; // these underscores are accepted for readability
        System.out.println(l);

        float f = 10.234F;
        System.out.println(f);

        double d = 10082448.0224333534;
        System.out.println(d);

        String str1 = "----- Myself the Millionaire Sanjay Soni -----";
        System.out.println(str1.charAt(6));
        /*
        this is multi line comment
         */
        String str2 = """
                1. Harry Potter and the Sorcerer's Stone
                2. Chamber of Secrets
                3. Prisoner of Azkaban
                4. Goblet of Fire
                5. Order of the Phoenix
                6. Half-Blood Prince
                7. Deathly Hallow""";
        System.out.println(str2);

        /* Type Casting */
        // Widening typecasting : fine
        i = 100;
        l = i;

        // Explicit typecasting : data loss
        l = 10000000;
        i = (int)l;

        /* constant variables */
        // final keyword locks the value in the var, once assigned. it cannot be changed
//        final double PI = 3.149823596239;
        final double PI;
        PI = 3.149823596239;
        System.out.println(PI);

        /* Reading Input using scanner package */
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        byte b1 = sc.nextByte();
//        short sh = sc.nextShort();
//        long lo = sc.nextLong();
        String st = sc.next();
        System.out.println(st+" "+st);
        System.out.println(st.charAt(0));
        System.out.println(st.chars());

        /* Simple Interest Calculation */
        double p = sc.nextDouble();
        float r = sc.nextFloat();
        byte t = sc.nextByte();

        double si = (p * r * t)/100;
        System.out.println("The simple interest is : " + si);



    }
}
