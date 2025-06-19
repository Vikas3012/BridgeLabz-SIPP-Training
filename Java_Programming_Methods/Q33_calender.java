import java.time.*;
class Q33_calender {
    public static void printCalendar(int month, int year) {
        YearMonth ym = YearMonth.of(year, month);
        int days = ym.lengthOfMonth();
        LocalDate first = LocalDate.of(year, month, 1);
        int start = first.getDayOfWeek().getValue() % 7;

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < start; i++) System.out.print("    ");

        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day);
            if ((day + start) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
}
