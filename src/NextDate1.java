import java.util.Scanner;
public class NextDate1 {
    public static void main(String[] args){
        System.out.println("Enter today`s date in the form MM DD YYYY:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        //定义day,month,year初始值
        int tomorrowDay=day;
        int tomorrowMonth=month;
        int tomorrowYear=year;
        //case month of
        switch (((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10))?1:
                ((month==4)||(month==6)||(month==9)||(month==11))?2:month==12?3:4) {
            case 1:
                if (day < 31) {
                    tomorrowDay = day + 1;
                } else {
                    tomorrowDay = 1;
                    tomorrowMonth = month + 1;
                }
                break;
            case 2:
                if (day < 30) {
                    tomorrowDay = day + 1;
                } else if(day==30){
                    tomorrowDay = 1;
                    tomorrowMonth = month + 1;
                }
                else{
                    System.out.println(month+" month cannot have " + day);
                    System.exit(0);
                }
                break;
            case 3:
                if (day < 31) {
                    tomorrowDay = day + 1;
                } else {
                    tomorrowDay = 1;
                    tomorrowMonth = 1;
                    if (year == 2012) {
                        System.out.println("2012 is over");
                        System.exit(0);
                    } else {
                        tomorrowYear = year + 1;
                    }
                }
                break;
            default:
                if (day < 28) {
                    tomorrowDay = day + 1;
                } else {
                    if (day == 28) {
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {   //is leap year
                            tomorrowDay = 29;
                        } else {
                            tomorrowDay = 1;
                            tomorrowMonth = 3;
                        }
                    }
                    else if (day == 29) {
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                            tomorrowDay = 1;
                            tomorrowMonth = 3;
                        }
                           else{
                            System.out.println(year+" year Feb cannot have " + day);
                            System.exit(0);
                        }

                    }
                    else{
                        System.out.println("Cannot have Feb." + day);
                        System.exit(0);
                    }
                }
        }
         System.out.println("Tomorrow date is:" + tomorrowMonth + " " + tomorrowDay + " " + tomorrowYear);
    }
}
