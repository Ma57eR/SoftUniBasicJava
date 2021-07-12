package Basic;

import java.util.Scanner;

public class MoreExercises {
    public static void main(String[] args) {

        //01. Trapeziod Area

//        Scanner scan = new Scanner(System.in);
//        double b1 = Double.parseDouble(scan.nextLine());
//        double b2 = Double.parseDouble(scan.nextLine());
//        double h = Double.parseDouble(scan.nextLine());
//
//        //Area
//
//        System.out.printf("%.2f",(b1 + b2) * h / 2);

        //02. Triangle Area

//        Scanner scan = new Scanner(System.in);
//        double a = Double.parseDouble(scan.nextLine());
//        double h = Double.parseDouble(scan.nextLine());
//
//        System.out.printf("%.2f", a * h / 2);

        //03. Celsius to Fahrenheit

//        Scanner scan = new Scanner(System.in);
//        double celsius = Double.parseDouble(scan.nextLine());
//
//        System.out.printf("%.2f", celsius * 1.8 + 32);

        //04. Vegetable Market

//        Scanner scan = new Scanner(System.in);
//
//        double vegPrice = Double.parseDouble(scan.nextLine());
//        double fruitPrice = Double.parseDouble(scan.nextLine());
//        int vegkg = Integer.parseInt(scan.nextLine());
//        int fruitkg = Integer.parseInt(scan.nextLine());
//
//        System.out.printf("%.2f", (vegPrice * vegkg + fruitPrice * fruitkg) / 1.94);


        //05. Training Lab

//        Scanner scan = new Scanner(System.in);
//
//        double w = Double.parseDouble(scan.nextLine());
//        double h = Double.parseDouble(scan.nextLine());
//        double totalW = w * 100;
//        double totalH = h * 100 - 100;
//        double rowsW = totalH / 70;
//        double columns = totalW / 120;
//
//        System.out.printf("%.0f", Math.floor(rowsW) * Math.floor(columns) - 3);


        //06. Fishland

//        Scanner scan = new Scanner(System.in);
//        double skumria = Double.parseDouble(scan.nextLine());
//        double caca = Double.parseDouble(scan.nextLine());
//        double palamud = skumria * 1.6;
//        double safrid = caca * 1.8;
//        double midi = 7.50;
//        double kgPalamud = Double.parseDouble(scan.nextLine());
//        double kgSafrid = Double.parseDouble(scan.nextLine());
//        int kgMidi = Integer.parseInt(scan.nextLine());
//
//        double totalPrice = (palamud * kgPalamud) + (safrid * kgSafrid) + (midi * kgMidi);
//        System.out.printf("%.2f", totalPrice);


        //07. House Painting

        //Scanner scan = new Scanner(System.in);
        //Разхода на зелената боя е 1 литър за 3.4 м2,
        // а на червената – 1 литър за 4.3 м2.

        //x - височина
        //у - дължина
        //h - височина покрив
        //врата отпред 1.2х2.00
        // на 2 стени прозорец 1.5х1.5

//        double x = Double.parseDouble(scan.nextLine());
//        double y = Double.parseDouble(scan.nextLine());
//        double h = Double.parseDouble(scan.nextLine());
//        double totalMeterSteni = (x * y * 2) - (1.5 * 1.5 * 2) + (x * x * 2) - 1.2 * 2;
//        double totalPokriv = (x * y * 2) + (x * h);
//        double greenPaint = totalMeterSteni / 3.4;
//        double redPaint = totalPokriv / 4.3;
//
//        System.out.printf("%.2f%n",greenPaint);
//        System.out.printf("%.2f",redPaint);


        //08. Circle Area and Perimeter

//        Scanner scan = new Scanner(System.in);
//
//        double r = Double.parseDouble(scan.nextLine());
//
//        System.out.printf("%.2f%n", Math.PI * r * r);
//        System.out.printf("%.2f", 2 * Math.PI * r);


        //09. Weather Forecast

//        Scanner scan = new Scanner(System.in);
//        String time = scan.nextLine();
//
//        switch (time) {
//            case "sunny":
//                System.out.println("It's warm outside!");
//                break;
//            case "cloudy":
//                System.out.println("It's cold outside!");
//                break;
//            case "snowy":
//                System.out.println("It's cold outside!");
//                break;
//        }


    }

}
