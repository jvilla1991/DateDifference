import java.util.Scanner;
import java.util.Date;

public class Main
{
    public static void main (String [ ] args)
    {
        Scanner scnr = new Scanner(System.in);

        int[] firstDate = new int[3];        //this makes an array, making sure that specific time frames go into
        System.out.println("First date");    //their correct index.
        System.out.println("Enter Year: ");
        firstDate[0] = scnr.nextInt();
        System.out.println("Enter Month: ");
        firstDate[1] = scnr.nextInt();
        System.out.println("Enter Day: ");
        firstDate[2] = scnr.nextInt();

        int[] secondDate = new int[3];      // this, too, prompts the user to populate an array
        System.out.println("Second date");
        System.out.println("Enter Year: ");
        secondDate[0] = scnr.nextInt();
        System.out.println("Enter Month: ");
        secondDate[1] = scnr.nextInt();
        System.out.println("Enter Day: ");
        secondDate[2] = scnr.nextInt();

        Date firstTime = new Date (firstDate[0], firstDate[1], firstDate[2]);
        Date secondTime = new Date (secondDate[0], secondDate[1], secondDate[2]);

        long difference = secondTime.getTime() - firstTime.getTime();
        difference = difference < 0 ? difference * -1 : difference;
        // this terenary statement makes sure that the difference value is positive

        int totalDays = (int)(difference / (1000 * 60 * 60 * 24));

        // these are all the caluclations, while filtering out already used Years or months
        int years = totalDays / 365;
        int months = (int)((totalDays - (years * 365.0)) / 30.416666666666);
        int days = (int)(totalDays - (years * 365) - (months * 30.4166666666));

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

        return;
    }
}