# Zhou Junmin's Project Portfolio Page

PlaNUS is a Command Line Interface (CLI) desktop app for students majoring under the Faculty of Engineering in NUS.
It serves as a centralized platform for our target user to manage their past, current, and future courses.

## Contributions to the project

### Code contribution:
- [RepoSense link](https://nus-cs2113-ay2324s2.github.io/tp-dashboard/?search=ZhouJunmin&breakdown=true&sort=groupTitle%20dsc&sortWithin=title&since=2024-02-23&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&tabAuthor=ZhouJunmin&tabRepo=AY2324S2-CS2113-W12-1%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code&authorshipIsBinaryFileTypeChecked=false&authorshipIsIgnoredFilesChecked=false)

### Enhancements implemented:
- Implemented the `Storage` class
  - What it does: Deals with file access. It stores user data into __myTimetable[index].csv__ files, and load courses from 
    files storing different majors' recommended timetables (e.g. __CEG.csv__), 
    as well as a __CourseList.csv__ file that stores all available courses.
    Storage class also deals with user-added courses, and stores such courses to __CourseList.csv__ for future uses.
  - Justification: This allows PlaNUS to have memories of user data, also to form a database for courses.
- Updated the `Timetable` class
  - What it does: Implements restrictions to prevent user adding duplicated courses into the timetable. Implement method 
    to search for grade given the course code. Overrides `toString` method of Timetable class for storing purposes.
  - Justification: The restriction enhances the user experience when adding courses. Other implemented methods provides 
    necessary aid to achieve other feature like `move course` and storing user data to files.
- Updated the `Ui` class
  - What it does: Adds in more responses to warn and guide users when incorrect commands are entered.
  - Justification: The detailed guidance provided when users key in incorrect commands make it easier for users to
    use PlaNUS.
  - Highlights: When users input commands that cannot be understood by PlaNUS, `Ui` will provide guidance about
    the correct format of the commands.
- Updated `Parser` class
  - What it does: Implements `move course` feature. Add exceptions to handle potential errors.
  - Highlights: Exceptions to incorrect format, incorrect commands and index out of bound are carefully handled.
  - Justification: `move course` allows user to use single command to move a course from one place to another, 
  instead of typing three commands `rm course`, `add course`, and `add grade` consecutively.

### Contributions to the User Guide:
- Added documentation and examples for `init` and `move course` features.

### Contributions to the Developer Guide:
- Added implementation details of the __Storage component__.
- Explained details of 3 main APIs in Storage Class and other private methods.
- Added a sequence diagram to illustrate how the programme works with Storage.

### Contributions to team-based tasks:
- Set up team repository.
- Set up milestones `v1.0` and `v2.0`.
- Assign issues to team members and allocate to respective milestones.