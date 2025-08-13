import java.time.LocalDate;

public class DemoLocalDate {
  public static void main(String[] args) {
    //number, String, boolean, etc.
    String birthday = "01-JAN-1999";
    // + 1 year

    LocalDate yearEnd = LocalDate.of(1999, 12, 31);
    LocalDate firstDateOfYear = yearEnd.plusDays(1L);
    System.out.println(yearEnd.plusMonths(2L)); // 2000-02-29
    System.out.println(yearEnd.plusYears(1L)); //2000-12-31

    System.out.println(firstDateOfYear);
    System.out.println(firstDateOfYear.isLeapYear()); // true

    LocalDate monthOfYear = yearEnd.plusYears(0L).plusMonths(24L).plusDays(30L);
    System.out.println(monthOfYear);

    LocalDate today = LocalDate.now();
    System.out.println(today.getDayOfWeek());

    System.out.println(today.isAfter(LocalDate.of(2025, 8, 11))); //true
    System.out.println(today.isAfter(LocalDate.of(2025, 12, 11))); //false
    System.out.println(today.isAfter(LocalDate.of(2025, 8, 12))); // true (today=2025.8.12)

    System.out.println(today.getYear()); // 2025
    System.out.println(today.getMonth()); //August
    System.out.println(today.getMonth().ordinal()); // 7, 由零開始計

    




  }
}
