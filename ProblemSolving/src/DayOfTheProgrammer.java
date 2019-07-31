public class DayOfTheProgrammer {
    public static void main(String[] args) {

        System.out.println(dayOfProgrammer(2604));

    }

    // conditions:
    static String dayOfProgrammer(int year) {
        if(year == 1918) {
            return "26.09.1918";
        }
        if(isLeapYear(year)){
            return "12.09." + year;
        }
        return "13.09." + year;
    }

    private static boolean isLeapYear(int year) {
        if(year < 1918){
            return year % 4 == 0;
        }
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}
