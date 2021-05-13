package FundamentalsBasic2;

import java.util.Scanner;

public class FundamentalsDataTypes {
    public static void main(String[] args) {

        //1. Integer Operations

//        Scanner scan = new Scanner(System.in);
//
//        int first = Integer.parseInt(scan.nextLine());
//        int second = Integer.parseInt(scan.nextLine());
//        int third = Integer.parseInt(scan.nextLine());
//        int four = Integer.parseInt(scan.nextLine());
//
//        System.out.println((first+second) / third * four);


        //2. Sum Digits

//        Scanner scan = new Scanner(System.in);
//        int num = Integer.parseInt(scan.nextLine());
//        int sum = 0;
//
//        while (num != 0) {
//            sum += num % 10;
//            num = num / 10;
//        }
//        System.out.println(sum);

        //3. Elevator

//        Scanner scan = new Scanner(System.in);
//
//        int people = Integer.parseInt(scan.nextLine());
//        int capacity = Integer.parseInt(scan.nextLine());
//
//        double courses = people * 1.0 / capacity;
//
//        System.out.printf("%.0f", Math.ceil(courses));


        //04. Sum of Chars

//        Scanner scan = new Scanner(System.in);
//        int numLines = Integer.parseInt(scan.nextLine());
//
//        int sumASCII = 0;
//
//        for (int i = 0; i < numLines; i++) {
//            char symbol = scan.next().charAt(0);
//            sumASCII+= (int) symbol;
//
//        }
//        System.out.println("The sum equals: " + sumASCII);


        //05. Print Part Of ASCII Table

//        Scanner scan = new Scanner(System.in);
//
//        int start = Integer.parseInt(scan.nextLine());
//        int end = Integer.parseInt(scan.nextLine());
//
//        for (int i = start; i <= end; i++) {
//            System.out.printf("%c ", (char)i);
//        }


        //06. Triples of Latin Letters

//        Scanner scan = new Scanner(System.in);
//        int num = Integer.parseInt(scan.nextLine());
//
//        for (int i = 'a'; i < 'a'+num; i++) {
//            for (int j = 'a'; j < 'a'+num; j++) {
//                for (int k = 'a'; k < 'a'+num; k++) {
//                    System.out.printf("%c%c%c%n", i, j, k);
//                }
//            }
//        }


        //07. Water Overflow

//        Scanner scan = new Scanner(System.in);
//        int capacity = 255;
//        int pourTimes = Integer.parseInt(scan.nextLine());
//        int counter = 0;
//        int totalWater = 0;
//        int maxWater = 0;
//
//        while (pourTimes != counter) {
//            int liters = Integer.parseInt(scan.nextLine());
//            totalWater+=liters;
//            counter++;
//            if (totalWater > capacity) {
//                System.out.println("Insufficient capacity!");
//                totalWater -= liters;
//            maxWater = totalWater - liters;
//            }
//        }
//        if (totalWater < capacity) {
//            System.out.println(totalWater);
//        } else {
//            System.out.println(maxWater);
//        }


        //08. Beer Kegs

//        Scanner scan = new Scanner(System.in);
//
//        int count = Integer.parseInt(scan.nextLine());
//
//        String biggestKen = "";
//        float max = 0;
//
//        for (int i = 0; i < count; i++) {
//            //count ++;
//            String kegModel = scan.nextLine();
//            float radius = Float.parseFloat(scan.nextLine());
//            int height = Integer.parseInt(scan.nextLine());
//            float volume = (float) Math.PI * (radius * radius) * height;
//            if (volume > max) {
//                max = volume;
//                biggestKen = kegModel;
//            }
//        }
//
//        System.out.println(biggestKen);


        //09. Spice Must Flow


//        Scanner scan = new Scanner(System.in);

        //1. Имаме подправки като всеки ден се берат започвайки от максималния капацитет
        //2. Всеки ден се берат по 10 единици подправка
        //3. всеки ден берачите консумират по 26 единици подправка
        //4. Ако единиците за подправка паднат под 100, тя се зарязва, защото няма печалба
        //5. берачите не могат да консумират повече, отколкото има в склада
        //6. На изхода на два реда да се извадят ДНИТЕ и общо набраните подправки

//        int field = Integer.parseInt(scan.nextLine());
//        int days = 0;
//        int extracted = 0;
//
//        while (field > 0) {
//            if (field < 100) {
//                if (extracted < 26) {
//                    break;
//                }
//                extracted -= 26;
//                break;
//            }
//
//            extracted+=field-26;
//            field-=10;
//            days++;
//        }
//        System.out.println(days);
//        System.out.println(extracted);


        //10. Poke Mon

        //poke power - integer. Изминавайки разстояние се намалява енергията му
        //Дистанция - в метри, Integer
        //Фактор умора - Integer

        // Трябва да намаляваме Power, докато дистанцията не стане по-голяма от него
        // Всеки път, когато е дадена дистанция, увеличаваме стигнатата мишена с 1
        //Когато силата стане ТОЧНО 50% от първоначалната си стойност, трябва да разделим силата на фактора, АКО Е ВЪЗМОЖНО

//        Scanner scan = new Scanner(System.in);
//        int power = Integer.parseInt(scan.nextLine());
//        int initialPower = power;
//        int distance = Integer.parseInt(scan.nextLine());
//        int factor = Integer.parseInt(scan.nextLine());
//        int pokedTarget = 0;
//
//        while (power >= distance) {
//            if ((double)power == (double)(initialPower/2)) {
//                power /= factor;
//            }
//            if (power >= distance) {
//                power -= distance;
//            } else {
//                break;
//            }
//
//            if (power < 0) {
//                power += distance;
//                break;
//            }
//            pokedTarget++;
//        }
//        System.out.println(power);
//        System.out.println(pokedTarget);


        //11. *Snowballs

        Scanner scan = new Scanner(System.in);
        int numOfBalls = Integer.parseInt(scan.nextLine());
        int bestSnowBall = 0;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;

        for (int i = 0; i < numOfBalls; i++) {
         int   snowballSnow = Integer.parseInt(scan.nextLine());
         int   snowballTime = Integer.parseInt(scan.nextLine());
         int   snowballQuality = Integer.parseInt(scan.nextLine());
            if (snowballTime != 0 && snowballSnow != 0) {
                double newSnowball = (double) Math.pow(snowballSnow / snowballTime, snowballQuality);
                if (bestSnowBall < newSnowball) {
                    bestQuality = snowballQuality;
                    bestSnow = snowballSnow;
                    bestTime = snowballTime;
                    bestSnowBall = (int)newSnowball;
                }
            }


        }

        System.out.printf("%d : %d = %d (%d)",bestSnow, bestTime, bestSnowBall, bestQuality);


    }
}
