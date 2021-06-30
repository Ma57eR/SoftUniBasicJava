package Fundamentals.Objects.AdvertisementMessage;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> phrases = Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product.");
        List<String> events = Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!");
        List<String> authors = Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva");
        List<String> cities = Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse");

        int citySize = cities.size();
        int phrasesSize = phrases.size();
        int eventsSize = events.size();
        int authorsSize = authors.size();

        Random rand = new Random();
        //int myRandom = rand.nextInt(maxBound);
        int numOfArticles = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <=numOfArticles; i++) {
            int cityR = rand.nextInt(citySize);
            int phraseR = rand.nextInt(phrasesSize);
            int eventR = rand.nextInt(eventsSize);
            int authorR = rand.nextInt(authorsSize);
            System.out.printf("%s %s %s - %s%n", phrases.get(phraseR), events.get(eventR), authors.get(authorR), cities.get(cityR));
        }
    }
}
