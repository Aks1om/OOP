package pr4.task1;

public class Main {

    private static void printFavoriteSeason(Season season) {
        if (season == Season.WINTER) {
            System.out.println("зима");
        } else if (season == Season.SPRING) {
            System.out.println("весна");
        } else if (season == Season.SUMMER) {
            System.out.println("лето");
        } else if (season == Season.AUTUMN) {
            System.out.println("осень");
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
