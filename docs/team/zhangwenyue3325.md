# Zhang Wenyue's Project Portfolio Page

PlaNUS is a Command Line Interface (CLI) desktop app for students majoring under the Faculty of Engineering in NUS.
It serves as a centralized platform for our target user to manage their past, current, and future courses.

<br>

### Contributions to the project
- **Code contributed**: [RepoSense link](https://nus-cs2113-ay2324s2.github.io/tp-dashboard/?search=zhangwenyue3325&breakdown=true&sort=groupTitle%20dsc&sortWithin=title&since=2024-02-23&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&tabAuthor=ZhangWenyue3325&tabRepo=AY2324S2-CS2113-W12-1%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code&authorshipIsBinaryFileTypeChecked=false&authorshipIsIgnoredFilesChecked=false)
- **Enhancements implemented**:
    - Implemented the `Grade` class
      - What it does: Contains the attributes of grades in both letter format and number format, 
        as well as methods to set them. The corresponding numerical values of letter grades are set in `Grade` class.
      - Justification: This allows PlaNUS to contain grades related features.
    - Implemented the `GradeChecker` class
      - What it does: Allows the user to check their grades for a specified period.
      - Highlights: 
        - Users can check their grades with both the year and term specified, with only the year,
          or with nothing specified. This provides flexibility and convenience for users.
        - Users can only check grades for year 1 - 6 and term 1 - 4 in accordance to the maximum
          candidature period found [here](https://nus.edu.sg/registrar/academic-information-policies/undergraduate-students/continuation-and-graduation-requirements#ResidencyRequirement).
    - Updated the `Timetable` class
      - What it does: Allows the user to **add a grade** to a course and **remove a grade** from a course.
      - Justification: This forms the basic features of grades in the project.
    - Updated the `Course` class
      - What it does: `Course` class now consists of `Grade` class, hence can set and get grades 
        by calling methods of `Grade`.
      - Justification: The association between `Course` class and `Grade` class is composition. `Grade` will be 
        meaningless if there is no `Course`.  
    - Updated the `Ui` class
      - What it does: Adds in more responses to warn and guide users when incorrect commands are entered.
      - Justification: The detailed guidance provided when users key in incorrect commands make it easier for users to 
        use PlaNUS.
      - Highlights: When users input commands that cannot be understood by PlaNUS, `Ui` will provide guidance about 
        the correct format of the commands. 
    - Updated `Parser` class
      - What it does: When commands `add grade`, `rm grade`, `change grade`, `check` are entered, the corresponding 
        methods from `Timetable` amd `GradeChecker` are called.
      - Highlights: Exceptions to incorrect format, incorrect commands and index out of bound are carefully handled.
      - Justification: `change grade` and `add grade` use the same method of adding grades, while different command 
        words are more user-friendly as they are closer to users' usual behavior.

<br>

- **Contributions to the User Guide**:
    - Added documentation and examples for grade-related features.

<br>

- **Contributions to the Developer Guide**:
    - Added implementation details of the `Grade component`
    - Added a class diagram to illustrate the relationship among all classes that are related to features of grades.
    - Added two sequence diagrams to illustrate the implementation process of `addGrade` and `removeGrade` methods.

#### Community

- Helped add features to `Ui`.
- Reported bugs and suggestions for other teams in the class and during practical exam dry run.
