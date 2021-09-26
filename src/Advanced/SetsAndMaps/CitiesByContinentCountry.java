package Advanced.SetsAndMaps;

import java.util.*;

public class CitiesByContinentCountry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int continents = Integer.parseInt(scan.nextLine());


        Map<String, Map<String, ArrayList<String>>> countriesInfo = new LinkedHashMap<>();
        while (continents-- > 0) {
            String input = scan.nextLine();
            String[] tokens = input.split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            countriesInfo.putIfAbsent(continent, new LinkedHashMap<>());
            countriesInfo.get(continent).putIfAbsent(country, new ArrayList<>());
            countriesInfo.get(continent).get(country).add(city);

           // input = scan.nextLine();
        }

        countriesInfo.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((key1, value1) -> {
                System.out.print("  " + key1 + " -> " +
                        String.join(", ", value1));
                System.out.println();
            });
        });
    }
}
