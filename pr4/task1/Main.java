package pr4.task1;

public class Main {
    private static void printFavoriteSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        printFavoriteSeason(Season.SUMMER);
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getAverageTemperature()
                + "°C, " + season.getDescription());
        }
    }
}
