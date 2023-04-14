import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class day {
    public static void main( String args[]){
        Scanner keyboard = new Scanner(System.in);
        String []array = {"January","Jan","Jan.","1","February","Feb.","Feb","2","3","March","Mar.","Mar", "4","April","Apr.","Apr","5","May","6","June","Jun","7","July","Jul","8","August","Aug.","Aug","9","September","Sep.","Sep","10","October","Oct.","Oct","11","November","Nov.","Nov","12","December","Dec.","Dec"};
        List k  = Arrays.asList(array);

        System.out.println("Enter month :");
        String month = keyboard.nextLine();
        while(!k.contains(month) ){
            System.out.println("Enter month :");
            month = keyboard.nextLine();
        }
        System.out.println("Enter year :");
        int year = keyboard.nextInt();
        while(year <0){
            System.out.println("Enter year :");
            year = keyboard.nextInt();
        }
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month)
		{
			case "January":
            case "Jan":
            case "Jan.":
            case "1":
            System.out.println("January " + year + " had 31 days"); break;
			case "February":
            case "Feb.":
            case "Feb":
            case "2": 
            System.out.println("February " + year + " had" +((leapYear) ? " 29 days" : " 28 days")); break;
			case "3": 
            case "March":
            case "Mar.":
            case "Mar":
            System.out.println(
					 "March " + year + " had 31 days"); break;
			case "4":
            case "April":
            case "Apr.":
            case "Apr": 
            System.out.println(
					 "April " + year + " had 30 days"); break;
			case "5":
            case "May":

            System.out.println(
					 "May " + year + " had 31 days"); break;
			case "6":
            case "June":
            case "Jun": 
            System.out.println(
					 "June " + year + " had 30 days"); break;
			case "7":
            case "July":
            case "Jul":
            System.out.println(
					 "July " + year + " had 31 days"); break;
			case "8": 
            case "August":
            case "Aug.":
            case "Aug":
            System.out.println(
					 "August " + year + " had 31 days"); break;
			case "9":
            case "September":
            case "Sep.":
            case "Sep": 
            System.out.println(
					 "September " + year + " had 30 days"); break;
			case "10":
            case "October":
            case "Oct.":
            case "Oct":
             System.out.println(
					 "October " + year + " had 31 days"); break;
			case "11": 
            case "November":
            case "Nov.":
            case "Nov":
            System.out.println(
					 "November " + year + " had 30 days"); break;
			case "12":
            case "December":
            case "Dec.":
            case "Dec":
            System.out.println(
					 "December " + year + " had 31 days");
		}
    }
}
