public class Rainbow {
    private static String Color1 = "red" ;
    private static String Color2 = "orange" ;
    private static String Color3 = "yellow" ;
    private static String Color4 = "green" ;
    private static String Color5 = "blue" ;
    private static String Color6 = "indigo" ;
    private static String Color7 = "violet" ;
    public String getColorName(int number) {
        switch (number) {
            case 1:
                return Color1;
            case 2:
                return Color2;
            case 3:
                return Color3;
            case 4:
                return Color4;
            case 5:
                return Color5;
            case 6:
                return Color6;
            case 7:
                return Color7;
            default:
                return "íåïîíÿòíî";
        }
    }
}
