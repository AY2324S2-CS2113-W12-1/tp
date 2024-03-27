package seedu.planus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class TimetableTest {
    @Test
    public void addCourse_validYearAndTerm_success() throws Exception {
        Timetable timetable = new Timetable();
        timetable.addCourse(new Course("MA1511", "Engineering Calculus", 2, 1, 1));
        assertEquals("Year 1 Semester 1:" + System.lineSeparator() + "  MA1511 Engineering Calculus (MC: 2)"
                + System.lineSeparator() + "Term MCs: 2" + System.lineSeparator(),
                PlanGetter.getPlan(timetable, 1, 1));
    }

    @Test
    public void addCourse_invalidYearAndTerm_exceptionThrown() {
        Timetable timetable = new Timetable();

        try {
            timetable.addCourse(new Course("CS1010", "", 1, 5));
            fail(); // the test should not reach this line
        } catch (Exception e) {
            assertEquals("Term provided is not from 1 to 4", e.getMessage());
        }

        try {
            timetable.addCourse(new Course("CS1010", "", 0, 1));
            fail(); // the test should not reach this line
        } catch (Exception e) {
            assertEquals("Year provided is not from 1 to 6", e.getMessage());
        }
    }

    @Test
    public void removeCourse_courseNotInPlan_returnFalse() {
        Timetable timetable = new Timetable();
        assertFalse(timetable.removeCourse("MA1511"));
    }

    @Test
    public void removeCourse_courseInPlan_returnTrue() throws Exception {
        Timetable timetable = new Timetable();
        timetable.addCourse(new Course("MA1511", "Engineering Calculus", 2, 1, 1));
        assertTrue(timetable.removeCourse("MA1511"));
    }

    @Test
    public void addGrade_success() {
        Timetable timetable = new Timetable();
        Course course = new Course("CS1010", "Programming Methodology", 1, 1);
        timetable.addGrade("CS1010", "B");
        assertEquals("Year 1 Semester 1:" + System.lineSeparator() + "  CS1010: B" + System.lineSeparator() + "Term GPA: 5.00" + System.lineSeparator(), GradeChecker.checkGrade(timetable, 1, 1));
    }
}
