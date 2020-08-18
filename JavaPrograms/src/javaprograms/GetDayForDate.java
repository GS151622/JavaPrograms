package javaprograms;
import java.io.IOException;

//PROBLEM STATEMENT

/*
 * You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

For example, if you are given the date , the method should return  as the day on that date
 * 
 * 
 * Input Format

A single line of input containing the space separated month, day and year, respectively, in    format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY
 */

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        int days = 0;

        for(int i = 2001; i<year; i++){
            if(i%4 == 0)
                days = days + 366;
            else
                days = days + 365;
        }

        for(int i = 1; i < month; i++){
        if(i ==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
            days = days + 31;
        else{
                if(i != 2)
                    days = days + 30;
                else if(year%4 == 0)
                    days = days + 29;
                else
                    days = days + 28;
        	}
        }

        days = days + day;
        int d = days % 7;
        if(d == 0)
            return "Sunday";
        else if(d == 1)
            return "Monday";
        else if(d == 2)
            return "Tuesday";
        else if(d == 3)
            return "Wednesday";
        else if(d == 4)
            return "Thursday";
        else if(d == 5)
            return "Friday";
        else
            return "Saturday";
    }
}

public class GetDayForDate {
    public static void main(String[] args) throws IOException {
        String res = Result.findDay(4, 6, 2012);
        System.out.println(res);
    }
}

