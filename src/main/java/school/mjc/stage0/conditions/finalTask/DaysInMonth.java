package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(year>0 && month>0 && month<13){
            boolean isYearLeap;
            if(year%400==0 && year %100==0) isYearLeap=true;
            else if (year%4==0 && year %100>0) isYearLeap=true;
            else isYearLeap=false;
            String numberOfDays=switch (month){
                case (2):
                    if (isYearLeap==true) yield  "29";
                    else yield "28";
                case (1):
                case (3):
                case (5):
                case (7):
                case (8):
                case (10):
                case (12):
                    yield "31";
                default:  yield "30";
            };
            System.out.println(numberOfDays);
        }
        else System.out.println("invalid date");

    }
}
