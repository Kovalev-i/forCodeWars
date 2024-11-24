import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class VacCheckTest {
    VacCheck vacCheck;
    Date correctDate;

    @BeforeEach
    void setUp() {
        vacCheck = new VacCheck();
        correctDate = new Date(124, 10, 25);
    }

    @Test
    void getVacCheckWorkDay() {
        Date workDay = new Date(124, 10, 22);
        assertEquals(vacCheck.getVacCheck(workDay), workDay);
    }
    @Test
    void getVacCheckSunday() {
        Date sunday = new Date(124, 10, 24);
        assertEquals(vacCheck.getVacCheck(sunday), correctDate);
    }
    @Test
    void getVacCheckSaturday() {
        Date saturday = new Date(124, 10, 23);
        assertEquals(vacCheck.getVacCheck(saturday), correctDate);
    }
}