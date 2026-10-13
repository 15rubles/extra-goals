public class TimeMachine {
    public static void main(String[] args) {
        int hours = 8;
        int minutes = 15;
        int minutesToAdd = 3000;

        int numOfMinInHour = 60;
        int numOfHoursInDay = 24;
        int numOfHours = minutesToAdd / numOfMinInHour;
        int numOfMin = minutesToAdd % numOfMinInHour;
        minutes += numOfMin;
        int extraHour = minutes / numOfMinInHour;
        minutes %= numOfMinInHour;
        hours += numOfHours + extraHour;
        hours %= numOfHoursInDay;
        System.out.printf("Time is %02d:%02d", hours , minutes);
    }
}
