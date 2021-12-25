public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int w){
        if(x <= 9 || x >= 1001 || y <= 9 || y >= 1001 || w <= 9 || w >= 1001){
            return false;
        }
        int xLast = x % 10;
        int yLast = y % 10;
        int wLast = w % 10;

        return (xLast == yLast || xLast == wLast || wLast == yLast);

    }
    public static boolean isValid(int number){
        return (number >= 10 && number <= 1000);

    }
}
