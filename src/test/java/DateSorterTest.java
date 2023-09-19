import org.example.DateSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class DateSorterTest {

    @DisplayName("Sorting test")
    @Test
    public void sort(){
        List<LocalDate> sortedList = new ArrayList<>();
        sortedList.add(LocalDate.of(2005, Month.JANUARY, 1));
        sortedList.add(LocalDate.of(2005, Month.JANUARY, 2));
        sortedList.add(LocalDate.of(2005, Month.MARCH, 3));
        sortedList.add(LocalDate.of(2005, Month.JULY, 1));
        sortedList.add(LocalDate.of(2005, Month.MAY, 3));
        DateSorter dateSorter = new DateSorter();

        assertNotNull(sortedList);
        assertEquals(sortedList, dateSorter.sortDates(listDates()));
        assertEquals(sortedList.size(), dateSorter.sortDates(listDates()).size());

        System.out.println("List before sorting: " + listDates());
        System.out.println("List after sorting: " + dateSorter.sortDates(listDates()));

    }

    private static List<LocalDate> listDates(){
        List<LocalDate> localDates = new ArrayList<>();
        localDates.add(LocalDate.of(2005, Month.JULY, 1));
        localDates.add(LocalDate.of(2005, Month.MAY, 3));
        localDates.add(LocalDate.of(2005, Month.JANUARY, 1));
        localDates.add(LocalDate.of(2005, Month.JANUARY, 2));
        localDates.add(LocalDate.of(2005, Month.MARCH, 3));
        return localDates;
    }
}
