package pr4.task1;

public class Main {

    private static void printFavoriteSeason(Season season) {
        if (season == Season.WINTER) {
            System.out.println("Я люблю зиму");
        } else if (season == Season.SPRING) {
            System.out.println("Я люблю весну");
        } else if (season == Season.SUMMER) {
            System.out.println("Я люблю лето");
        } else if (season == Season.AUTUMN) {
            System.out.println("Я люблю осень");
        }
    }

    public static void main(String[] args) {
        printFavoriteSeason(Season.SUMMER);
        for (Season season : Season.values()) {
            System.out.println(
                season +
                    ": " +
                    season.getAverageTemperature() +
                    "°C, " +
                    season.getDescription()
            );
        }
    }
}
