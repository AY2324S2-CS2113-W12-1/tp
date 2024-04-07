package seedu.planus;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

//@@author ZhouJunmin
public class StorageTest {
    @Test
    public void getUserTimetableFilePath_defaultTimetable() {
        assertEquals("./data/myTimetable0.csv", Storage.getUserTimetableFilePath());
    }

    @Test
    public void getUserTimetableFilePath_changedTimetable() {
        Storage.changeTimetable(1);
        assertEquals("./data/myTimetable1.csv", Storage.getUserTimetableFilePath());
        Storage.changeTimetable(0);
    }

    @Test
    public void getUserTimetableFileName_defaultTimetable() {
        assertEquals("myTimetable0", Storage.getUserTimetableFileName());
    }

    @Test
    public void getUserTimetableFileName_changedTimetable() {
        Storage.changeTimetable(1);
        assertEquals("myTimetable1", Storage.getUserTimetableFileName());
        Storage.changeTimetable(0);
    }

    @Test
    public void writeToFile_emptyFile() {
        Timetable timetable = new Timetable();
        Storage.writeToFile(timetable);
        File f = new File(Storage.getUserTimetableFilePath());
        Scanner s = null;
        try {
            s = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertTrue(f.exists());
        assertFalse(s.hasNextLine());
    }

    @Test
    public void writeToFile_oneCourseFile() {
        Timetable timetable = new Timetable();
        try {
            Course course = new Course("CS1010", "Programming Methodology", 4, 1, 1);
            timetable.addCourse(course);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Storage.writeToFile(timetable);
        File f = new File(Storage.getUserTimetableFilePath());
        Scanner s = null;
        try {
            s = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertEquals("CS1010,Programming Methodology,4,1,1,null", s.nextLine());
    }

    @Test
    public void writeToFile_multipleCoursesFile() {
        Timetable timetable = new Timetable();
        try {
            Course courseOne = new Course("CS1010", "Programming Methodology", 4, 1, 1);
            Course courseTwo = new Course("CS1010S", "Programming Methodology", 4, 1, 1);
            timetable.addCourse(courseOne);
            timetable.addCourse(courseTwo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Storage.writeToFile(timetable);
        File f = new File(Storage.getUserTimetableFilePath());
        Scanner s = null;
        try {
            s = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertEquals("CS1010,Programming Methodology,4,1,1,null" +
                "CS1010S,Programming Methodology,4,1,1,null", s.nextLine() + s.nextLine());
    }

    @Test
    public void loadTimetable_emptyFile() {
        Timetable timetable = Storage.loadTimetable("myTimetable-1.csv");
        assertEquals(timetable.toString(), "");
    }

    @Test
    public void loadTimetable_normalFile() {
        Timetable timetableExpected = new Timetable();
        try {
            Course course = new Course("CS1010", "Programming Methodology", 4, 1, 1);
            timetableExpected.addCourse(course);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Storage.changeTimetable(-2);
        Storage.writeToFile(timetableExpected);
        Timetable timetableActual = Storage.loadTimetable("myTimetable-2.csv");
        assertEquals(timetableActual.toString(), timetableExpected.toString());
        Storage.changeTimetable(0);
    }

    @Test
    public void changTimetable_arbitraryIndex() {
        Storage.changeTimetable(1);
        assertEquals("./data/myTimetable1.csv", Storage.getUserTimetableFilePath());
        Storage.changeTimetable(-1);
        assertEquals("./data/myTimetable-1.csv", Storage.getUserTimetableFilePath());
        Storage.changeTimetable(0);
        assertEquals("./data/myTimetable0.csv", Storage.getUserTimetableFilePath());
    }

}
