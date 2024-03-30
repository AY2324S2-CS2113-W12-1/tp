package seedu.planus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeCheckerTest {
    private Timetable timetable;

    @BeforeEach
    public void setUp() {
        timetable = new Timetable();
    }

    @Test
    public void gradeAddingAndCheckingIntegrationTest() throws Exception {
        timetable.addCourse(new Course("CS1010", "Programming Methodology",
                4, 1, 1));
        timetable.addGrade("CS1010", "A");

        timetable.addCourse(new Course("CG1111A", "Engineering Principles & Practice I",
                4, 1, 1));
        timetable.addGrade("CG1111A", "B");

        timetable.addCourse(new Course("MA1511", "Engineering Calculus",
                2, 1, 1));
        timetable.addGrade("MA1511", "C");

        timetable.addCourse(new Course("MA1512", "Differential Equation for Engineering",
                2, 1, 1));
        timetable.addGrade("MA1512", "S");

        timetable.addCourse(new Course("DTK1234", "Design Thinking",
                4, 1, 2));
        timetable.addGrade("DTK1234", "A+");

        timetable.addCourse(new Course("PF1101", "Fundamentals of Project Management",
                4, 1, 2));
        timetable.addGrade("PF1101", "B+");

        timetable.addCourse(new Course("CG2111A", "Engineering Principles & Practice II",
                4, 1, 2));
        timetable.addGrade("CG2111A", "A-");

        String expectedOutput = "Year 1:\n"
                + "Year 1 Semester 1:\n"
                + "  CS1010: A\n"
                + "  CG1111A: B\n"
                + "  MA1511: C\n"
                + "  MA1512: S\n"
                + "Term GPA: 3.8\n"
                + "-----------------------------\n"
                + "Year 1 Semester 2:\n"
                + "  DTK1234: A+\n"
                + "  PF1101: B+\n"
                + "  CG2111A: A-\n"
                + "Term GPA: 4.5\n"
                + "-----------------------------\n"
                + "Year 1 GPA: 4.181818181818182\n\n";

        String actualOutput = GradeChecker.checkGrade(timetable, 1);

        assertEquals(expectedOutput, actualOutput);
    }
}
