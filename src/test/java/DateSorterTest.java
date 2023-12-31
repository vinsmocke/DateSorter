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
        Collection<LocalDate> expected = new ArrayList<>();
        expected.add(LocalDate.of(2005, Month.JANUARY, 1));
        expected.add(LocalDate.of(2005, Month.JANUARY, 2));
        expected.add(LocalDate.of(2005, Month.MARCH, 3));
        expected.add(LocalDate.of(2005, Month.JULY, 1));
        expected.add(LocalDate.of(2005, Month.MAY, 3));

        DateSorter dateSorter = new DateSorter();
        Collection<LocalDate> sortedList = dateSorter.sortDates(listDates());

        assertNotNull(sortedList);
        assertEquals(expected, sortedList);
        assertEquals(expected.size(), sortedList.size());

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
