import java.util.Scanner;

public class FirstSteps {


    public static void main(String[] args) {

        // Първа задача - Hello SoftUni
        //System.out.println("Hello SoftUni");


        //Втора задача
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);
//        System.out.println(7);
//        System.out.println(8);
//        System.out.println(9);
//        System.out.println(10);

        //Трета задача

//        Scanner scan = new Scanner(System.in);
//        int a = Integer.parseInt(scan.nextLine());
//        int area = a * a;
//        System.out.println(area);


        //4th case

//        Scanner scan = new Scanner(System.in);
//        double inch = Double.parseDouble(scan.nextLine());
//        double cm = inch * 2.54;
//        System.out.println(cm);

        //5th case

//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
//        System.out.println("Hello "+name);

        //6th case

//        Scanner scan = new Scanner(System.in);
//        String firstname = scan.nextLine();
//        String lastname = scan.nextLine();
//        int age = Integer.parseInt(scan.nextLine());
//        String town = scan.nextLine();
//
//        System.out.printf("You are %s %s, a %s-years old person from %s.", firstname, lastname, age, town);


        //7th case

//        Scanner scan = new Scanner(System.in);
//        String archName = scan.nextLine();
//        int projects = Integer.parseInt(scan.nextLine());
//        int hours = projects * 3;
//
//        System.out.printf("The architect %s will need %s hours to complete %s project/s.", archName, hours, projects);


        //8th case

//        Scanner scan = new Scanner(System.in);
//
//        int dog = Integer.parseInt(scan.nextLine());
//        int otherAnimal = Integer.parseInt(scan.nextLine());
//        Double dogPrice = dog * 2.5;
//        int othPrice = otherAnimal * 4;
//        Double totalPrice = dogPrice + othPrice;
//
//        System.out.printf("%s lv.", totalPrice);

        //9th case

        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        double price = 7.61;
        double discount = 0.18;
        double discountAmount = price * discount;
        double discounted = price - price * discount;
        double finalPrice = area * discounted;
        double finalDiscount = area * discountAmount;

        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv", finalPrice, finalDiscount);
        //System.out.printf("The discount is: %.2f lv.", finalDiscount);

    }
}
