

    /*
    Write a test application named DateTest that demonstrates classDate’s capabilities.
     */


    import java.util.Scanner;

    public class DateTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Date myDate = new Date(11,23, 1978);

        System.out.println("Introduceti luna");
        int myMonth = input.nextInt();
        myDate.setMonthDate(myMonth);

        System.out.println("Introduceti ziua");
        int myDay = input.nextInt();
        myDate.setMonthDate(myDay);

        System.out.println("Introduceti anul");
        int myYear = input.nextInt();
        myDate.setYearDate(myYear);

        myDate.displayDate();




    }

}
