import java.util.Scanner;

public class NextDate2 {
    public static void main(String[] args){
        Boolean c1,c2,c3;
        System.out.println("Enter today date in the form MM DD YYYY:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        int tomorrowDay=day;
        int tomorrowMonth=month;
        int tomorrowYear=year;
        c1 = (1<=day)&&(day<=31);
        c2 = (1<=month)&&(month<=12);
        c3 = (1812<=year)&&(year<=2012);
        if(c1==false){
            System.out.println("Value of day not in the range 1..31");
        }
        if(c2==false){
            System.out.println("Value of month not in the range 1..12");
        }
        if(c3==false){
            System.out.println("Value of year not in the range 1812..2012");
        }
        if(c1&&c2&&c3){
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
                    } else {
                        if (day == 30) {
                            tomorrowDay = 1;
                            tomorrowMonth = month + 1;
                        } else {
                            System.out.println("Invalid Input Date");
                            System.exit(0);
                        }
                    }
                    break;
                case 3:
                    if (day < 31) {
                        tomorrowDay = day + 1;
                    } else {
                        tomorrowDay = 1;
                        tomorrowMonth = 1;
                    }
                    if (year == 2012) {
                        System.out.println("Invalid Input Date");
                        System.exit(0);
                    } else {
                        tomorrowYear = year + 1;
                    }
                default:
                    if(day<28){
                        tomorrowDay = day+1;
                    }
                    else{
                        if(day==28){
                            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                               tomorrowDay = 29;
                            }
                            else{
                                tomorrowDay = 1;
                                tomorrowMonth = 3;
                            }
                        }
                         else{
                             if(day==29){
                                 if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                                     tomorrowDay = 1;
                                     tomorrowMonth = 3;
                                 }
                                 else{
                                     System.out.println("Invalid Input Date");
                                     System.exit(0);
                                 }
                             }
                        }
                    }
            }
            System.out.println("Tomorrow date is:"+tomorrowMonth+" "+tomorrowDay+" "+tomorrowYear);
            }

        }

    }

