package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({"10,99,0", "10, 100, 1", "200, 300, 3", "9801, 9802, 1", "9802, 10000, 0"})
    public void shouldReturnCorrectRangeEntriesAmount(long lowerLimit, long upperLimit, int entries) {
        SQRService sqrService = new SQRService();

        int entriesNumber = sqrService.findRangeEntriesAmount(lowerLimit, upperLimit);
        assertEquals(entries, entriesNumber);
    }
}
