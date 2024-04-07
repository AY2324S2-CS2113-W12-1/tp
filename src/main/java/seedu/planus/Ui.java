package seedu.planus;
import java.util.Scanner;

//@@author iscyng
public class Ui {

    public static final String MISSING_MAJOR = "Please retry with a major code.\ne.g. init CEG";
    public static final String MISSING_MAJOR_DISPLAY = "Please retry with a major code.\ne.g. display CEG";
    public static final String INVALID_COMMAND = "Command entered is invalid.\nPlease enter: \"help\" " +
            "for available commands.";
    public static final String INVALID_ADD_COURSE = "To add course, please enter: add course " +
            "[course code] y/[year] t/[term] m/[modular credit]\n    e.g. add course CS1010 y/1 t/1";
    public static final String INVALID_ADD_GRADE = "To add grade, please enter: add grade [course code] " +
            "[letter grade]\n    e.g. add grade CS1010 A";
    public static final String INVALID_ADD = "To add course, please enter: add course [course code] " +
            "y/[year] t/[term] m/[modular credit]\n"
            + "    e.g. add course CS1010 y/1 t/1\nTo add grade, please enter: add grade [course code] [letter grade]\n"
            + "    e.g. add grade CS1010 A";
    public static final String INVALID_REMOVE_COURSE = "To remove course, please enter: rm course [course code]\n" +
            "    e.g. rm course CS1010";
    public static final String INVALID_REMOVE_GRADE = "To remove grade, please enter: rm grade [course code]\n" +
            "    e.g. rm grade CS1010";
    public static final String INVALID_REMOVE = "To remove course, please enter: rm course [course code]\n" +
            "    e.g. rm course CS1010\nTo remove grade, please enter: rm grade [course code]\n" +
            "    e.g. rm grade CS1010";
    public static final String INVALID_MOVE_COURSE = "To move course, please enter: " +
            "move course [course code] y/[year] t/[term]\n" +
            "    e.g. move course CS1010 y/1 t/2";
    public static final String INVALID_CHANGE_GRADE = "To change grade, please enter: change grade " +
            "[course code] [letter grade]\n    e.g. change grade CS1010 A";
    public static final String INVALID_CHECK_YEAR_GRADE = "To check grade of a year, please enter: check y/[year]\n" +
            "    e.g. check y/1";
    public static final String INVALID_CHECK_TERM_GRADE = "To check grade of a term, please enter: " +
            "check y/[year] t/[term]\n    e.g. check y/1 t/1";
    public static final String INVALID_VIEW_YEAR_PLAN = "To view course plan of a year, please enter: " +
            "view y/[year]\n    valid from y/1-y/6, e.g. view y/1";
    public static final String INVALID_VIEW_TERM_PLAN = "To view course plan of a term, please enter: " +
            "view y/[year] t/[term]\n   valid from y/1-y/6, t/1-t/4  e.g. view y/1 t/1";
    public static final String INVALID_CHANGE_TIMETABLE = "To change to another timetable please enter: " +
            "change timetable [timetable index]\n e.g. change timetable 2";
    public static final String INVALID_CHANGE = "To change grade, please enter: change grade " +
            "[course code] [letter grade]\n    e.g. change grade CS1010 A\n" +
            "To change to another timetable please enter: " +
            "change timetable [timetable index]\n    e.g. change timetable 2";

    public static void printLogo() {
        System.out.println(" ________  ___       ________  ________   ___  ___  ________\n" +
                "|\\   __  \\|\\  \\     |\\   __  \\|\\   ___  \\|\\  \\|\\  \\|\\   ____\\\n" +
                "\\ \\  \\|\\  \\ \\  \\    \\ \\  \\|\\  \\ \\  \\\\ \\  \\ \\  \\\\\\  \\ \\  \\___|_\n" +
                " \\ \\   ____\\ \\  \\    \\ \\   __  \\ \\  \\\\ \\  \\ \\  \\\\\\  \\ \\_____  \\\n" +
                "  \\ \\  \\___|\\ \\  \\____\\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\\\\\  \\|____|\\  \\\n" +
                "   \\ \\__\\    \\ \\_______\\ \\__\\ \\__\\ \\__\\\\ \\__\\ \\_______\\____\\_\\  \\\n" +
                "    \\|__|     \\|_______|\\|__|\\|__|\\|__| \\|__|\\|_______|\\_________\\\n" +
                "                                                      \\|_________|\n\n");
    }

    //@@author ZhouJunmin
    public static void printHelp() {
        System.out.println("Listed below are all available commands:\n" +
                "    init [major]\n        e.g. init CEG\n" +
                "    add course [course code] y/[year] t/[term] m/[modular credit]\n" +
                "        e.g. add course CS1010 y/1 t/1 m/4\n" +
                "    add grade [course code] [letter grade]\n        e.g. add grade CS1010 A\n" +
                "    rm course [course code]\n        e.g. rm course CS1010\n" +
                "    rm grade [course code]\n        e.g. rm grade CS1010\n" +
                "    move course [course code] y/[year] t/[term]\n        e.g. move course CS1010 y/1 t/2\n" +
                "    change grade [course code] [letter grade]\n        e.g. change grade CS1010 A\n" +
                "    change timetable [timetable index]\n        e.g. change timetable 1\n" +
                "    check y/[year]\n        e.g. check y/1\n" +
                "    check y/[year] t/[term]\n        e.g. check y/1 t/1\n" +
                "    view y/[year]\n        e.g. view y/1\n" +
                "    view y/[year] t/[term]\n        e.g. view y/1 t/1\n" +
                "    display [major]\n        e.g. display CEG\n" +
                "    help\n" +
                "    bye\n\n");
    }

    //@@author iscyng
    public static void printExit() {
        System.out.println("Bye~ Hope to see you again soon!");
    }

    public static void printErrorMessage(String message) {
        System.out.println(message);
    }

    public static void printCourseNotFound(){
        System.out.println("Oops, the course does not exist! You may want to check your spelling.");
    }

    public static void printCourseAdded(String courseCode) {
        System.out.println("Sure! " + courseCode + " has been added to your schedule.");
    }

    //@@author ZhouJunmin
    public static void printFileNotFound(String filePathName) {
        System.out.println("File at " + filePathName + " is not found. Trying to create one.");
    }

    public static void printCorruptedData(int lineNumber, String filePathName) {
        System.out.println("Data corrupted at line " + lineNumber + " of file at " + filePathName);
    }

    //@@author iscyng
    public static void printFileCreated() {
        System.out.println("File creation successful.");
    }

    public static void printFileFailedToCreate() {
        System.out.println("File creation failed.");
    }

    public static void printFailedLoadingFile() {
        System.out.println("Loading file failed.");
    }

    public static void printInvalidAddGrade() {
        System.out.println("To add grade, please enter: add grade [course code] [letter grade]\n    " +
                "e.g. add grade CS1010 A");
    }

    //@@author ZhangWenyue3325
    public static void printFailedToAddGrade() {
        System.out.println("The course does not exist in the current timetable! You may want to add the course first.");
    }

    public static void printSuccessToAddGrade(String courseCode) {
        System.out.println("The grade has been added to " + courseCode);
    }

    public static void printFailedToRemoveGrade() {
        System.out.println("The course does not exist in the current timetable!");
    }

    public static void printSuccessToRemoveGrade(String courseCode) {
        System.out.println("The grade has been removed for " + courseCode);
    }

    public static void printCourseRemoved(String courseCode) {
        System.out.println("The course " + courseCode + " has been successfully removed from your timetable.");
    }

    public static void printCourseMoved(String courseCode) {
        System.out.println("The course " + courseCode + " has been successfully moved.");
    }

    public static void printGradeChanged(String courseCode, String newGrade) {
        System.out.println("The grade of " + courseCode + " has been changed to " + newGrade + " successfully.");
    }

    public static void printTimetableChanged() {
        System.out.println("You have successfully switched to another timetable.");
    }

    //@@author ZhouJunmin
    public static void printInvalidInputGrade() {
        System.out.println("The letter grade entered is invalid!\nPlease enter: A+/A/A-/B+/B/B-/C+/C/D+/D/F/S/U/CS/CU");
    }

    public static void printFailedToWrite() {
        System.out.println("Failed writing timetable to file.");
    }

    public static void printCourseNotExist() {
        System.out.println("Course you wish to add does not exist in our database, please provide the course name:");
    }
    public static void printFailedSearchingInDatabase() {
        System.out.println("Searching course in database failed.");
    }

    public static void printCourseAlreadyAdded() {
        System.out.println("This course has already been added.\n" +
                "If you want to add this course elsewhere, please use \"move\" command.\n" +
                "    e.g. move course DTK1234 y/4 t/1");
    }

    //@@author cirelesna
    public static String getUserCommand() {
        System.out.print("Command: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}


