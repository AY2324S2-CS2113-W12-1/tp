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

        String expectedOutput = String.join(
                System.lineSeparator(),
                "Year 1:",
                "Year 1 Semester 1:",
                "  CS1010: A",
                "  CG1111A: B",
                "  MA1511: C",
                "  MA1512: S",
                "Term GPA: 3.8",
                "-----------------------------",
                "Year 1 Semester 2:",
                "  DTK1234: A+",
                "  PF1101: B+",
                "  CG2111A: A-",
                "Term GPA: 4.5",
                "-----------------------------",
                "Year 1 GPA: 4.181818181818182",
                "",
                ""
        );

        String actualOutput = GradeChecker.checkGrade(timetable, 1);

        assertEquals(expectedOutput, actualOutput);
    }
}
