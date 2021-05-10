package Block5.Holiday;

import java.util.ArrayList;
import java.util.Collections;

public class HolidayApp {     public static void main(String[] args) {
    Holiday summerHoliday = new Holiday("Österreich", 7, 4);
    Holiday winterHoliday = new Holiday("Österreich", 2, 4);

    Holiday defaultHoliday = new Holiday(); // now the constructor without parameters is called
    summerHoliday.setNrPersons(3);
    System.out.println(summerHoliday.getNrPersons());
    System.out.println(summerHoliday);


    ArrayList<Holiday> holidays = new ArrayList<>();
    holidays.add(summerHoliday);
    holidays.add(winterHoliday);
    holidays.add(defaultHoliday);
    holidays.add(new Holiday("Graz",2,2));
    holidays.add(new Holiday("Graz",2,3));

    System.out.println(holidays);
    Collections.sort(holidays);
    System.out.println(holidays);
    holidays.sort(new DestinationComparator());
    System.out.println(holidays);
}
}

