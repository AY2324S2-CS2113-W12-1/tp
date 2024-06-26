//@@author ZhangWenyue3325
package seedu.planus;

import java.util.ArrayList;
import java.util.logging.Logger;

public class GradeChecker {
    private static Logger logger = Logger.getLogger("myLogger");
    private static final int TERM_PER_YEAR = 4;
    private static final int MAX_CANDIDATURE_YEAR = 6;

    /**
     * Returns a formatted string containing the grades for all semesters of the user
     *
     * @param timetable Timetable of the user
     * @return A string with the grades
     */
    public static String checkGrade(Timetable timetable) {
        assert timetable != null : "Timetable provided cannot be null.";
        int totalMCsWithoutSU = 0;
        int yearMCsWithoutSU = 0;
        int termMCsWithoutSU = 0;
        double totalGrade = 0.00;
        double yearGrade = 0.00;
        double termGrade = 0.00;
        int maxYear = Math.max(findMaxYear(timetable), 4);

        StringBuilder plan = new StringBuilder();

        for (int y = 1; y <= maxYear; y++) {
            plan.append("Year ").append(y).append(":").append(System.lineSeparator());

            for (int t = 1; t <= TERM_PER_YEAR; t++) {
                int index = timetable.searchTimetableIndex(y, t);
                if (index == -1) {
                    continue;
                }

                plan.append(timetable.courses.get(index).get(0).getYearAndTerm()).append(":")
                        .append(System.lineSeparator());

                for (Course course : timetable.courses.get(index)) {
                    plan.append("  ").append(course.getGrade()).append(System.lineSeparator());
                    Pair<Integer, Double> MCandGrade = getMCandGrade(course);
                    termMCsWithoutSU += MCandGrade.getKey();
                    termGrade += MCandGrade.getValue();
                }

                double termGPA = 0.00;
                if (termMCsWithoutSU != 0) {
                    termGPA = termGrade / termMCsWithoutSU;
                }

                plan.append("Term GPA: ").append(String.format("%.2f", termGPA)).append(System.lineSeparator())
                        .append("-----------------------------").append(System.lineSeparator());

                yearMCsWithoutSU += termMCsWithoutSU;
                yearGrade += termGrade;
                termMCsWithoutSU = 0;
                termGrade = 0.00;
            }

            double yearGPA = 0.00;
            if (yearMCsWithoutSU != 0) {
                yearGPA = yearGrade / yearMCsWithoutSU;
            }

            plan.append("Year ").append(y).append(" GPA: ").append(String.format("%.2f", yearGPA))
                    .append(System.lineSeparator()).append(System.lineSeparator());

            totalMCsWithoutSU += yearMCsWithoutSU;
            totalGrade += yearGrade;
            yearMCsWithoutSU = 0;
            yearGrade = 0.00;
        }

        double cumulativeGPA = 0.00;
        if (totalMCsWithoutSU != 0) {
            cumulativeGPA = totalGrade / totalMCsWithoutSU;
        }
        assert cumulativeGPA >= 0.00 && cumulativeGPA <= 5.00 : "Cumulative GPA is out of bounds.";
        plan.append("Total GPA: ").append(String.format("%.2f", cumulativeGPA)).append(System.lineSeparator())
                .append(System.lineSeparator());

        return plan.toString();
    }

    /**
     * Returns a formatted string containing the grades for the year specified
     *
     * @param timetable Timetable of the user
     * @param year      Year of study for which the user wants to check the grade
     * @return A string with the year's grades
     */
    public static String checkGrade(Timetable timetable, int year) {
        assert year >= 1 && year <= MAX_CANDIDATURE_YEAR : "Year parameter is out of valid range.";
        int yearMCsWithoutSU = 0;
        int termMCsWithoutSU = 0;
        double yearGrade = 0.00;
        double termGrade = 0.00;

        StringBuilder plan = new StringBuilder();

        plan.append("Year ").append(year).append(":").append(System.lineSeparator());

        for (int t = 1; t <= TERM_PER_YEAR; t++) {
            int index = timetable.searchTimetableIndex(year, t);
            if (index == -1) {
                continue;
            }

            plan.append(timetable.courses.get(index).get(0).getYearAndTerm()).append(":")
                    .append(System.lineSeparator());

            for (Course course : timetable.courses.get(index)) {
                plan.append("  ").append(course.getGrade()).append(System.lineSeparator());
                Pair<Integer, Double> MCandGrade = getMCandGrade(course);
                termMCsWithoutSU += MCandGrade.getKey();
                termGrade += MCandGrade.getValue();
            }

            double termGPA = 0.00;
            if (termMCsWithoutSU != 0) {
                termGPA = termGrade / termMCsWithoutSU;
            }

            plan.append("Term GPA: ").append(String.format("%.2f", termGPA)).append(System.lineSeparator())
                    .append("-----------------------------").append(System.lineSeparator());

            yearMCsWithoutSU += termMCsWithoutSU;
            yearGrade += termGrade;
            termMCsWithoutSU = 0;
            termGrade = 0.00;
        }

        double yearGPA = 0.00;
        if (yearMCsWithoutSU != 0) {
            yearGPA = yearGrade / yearMCsWithoutSU;
        }
        assert yearGPA >= 0.00 : "The GPA for the given academic year should be non-negative.";

        plan.append("Year ").append(year).append(" GPA: ").append(String.format("%.2f", yearGPA))
                .append(System.lineSeparator()).append(System.lineSeparator());

        return plan.toString();
    }

    /**
     * Returns a formatted string containing the grades for the year and term specified
     *
     * @param timetable Timetable of the user
     * @param year      Year of study for which the user wants to check the grade
     * @param term      Term of study for which the user wants to check the grade
     * @return A string with the term's grades
     */
    public static String checkGrade(Timetable timetable, int year, int term) {
        assert year >= 1 && year <= MAX_CANDIDATURE_YEAR : "Year parameter is out of valid range.";
        assert term >= 1 && term <= TERM_PER_YEAR : "Term parameter is out of valid range.";
        int termMCsWithoutSU = 0;
        double termGrade = 0.00;
        int index = timetable.searchTimetableIndex(year, term);

        StringBuilder plan = new StringBuilder();

        plan.append(timetable.courses.get(index).get(0).getYearAndTerm()).append(":").append(System.lineSeparator());

        for (Course course : timetable.courses.get(index)) {
            plan.append("  ").append(course.getGrade()).append(System.lineSeparator());
            Pair<Integer, Double> MCandGrade = getMCandGrade(course);
            termMCsWithoutSU += MCandGrade.getKey();
            termGrade += MCandGrade.getValue();
        }

        double termGPA = 0.00;
        if (termMCsWithoutSU != 0) {
            termGPA = termGrade / termMCsWithoutSU;
        }
        assert termGPA >= 0.00 : "The GPA of the semester should be non-negative.";

        plan.append("Term GPA: ").append(String.format("%.2f", termGPA)).append(System.lineSeparator())
                .append("-----------------------------").append(System.lineSeparator());

        return plan.toString();
    }

    private static Pair<Integer, Double> getMCandGrade(Course course) {

        if (course.getLetterGrade() == null) {
            return new Pair<>(0, 0.00);
        }

        if (!course.getLetterGrade().equals("S") && !course.getLetterGrade().equals("CS")
                && !course.getLetterGrade().equals("U") && !course.getLetterGrade().equals("CU")
                && !(course.getLetterGrade() == null)) {
            return new Pair<>(course.getModularCredit(), course.getNumberGrade() * course.getModularCredit());
        }

        return new Pair<>(0, 0.00);
    }

    private static int findMaxYear(Timetable timetable) {
        int maxYear = 0;
        for (ArrayList<Course> termCourses : timetable.courses) {
            for (Course course : termCourses) {
                if (course.getYear() > maxYear) {
                    maxYear = course.getYear();
                }
            }
        }
        return maxYear;
    }
}
