# Isaac Yong's Project Portfolio Page

## Project: PlaNus

PlaNUS is a Command Line Interface (CLI) desktop app for students majoring under the Faculty of Engineering in NUS.
It serves as a centralized platform for our target user to manage their past, current, and future courses.

### Contributions to the project

#### New Features

- **UI Class**
    - **What it does:** `Ui` class manages user interactions within PlaNus, primarily by handling input 
    errors and guiding users through correct command usage. It provides immediate feedback on invalid inputs or
    commands, offering suggestions for rectification and enhancing user experience by making the application more 
    intuitive and user-friendly.
    - **Justification:** Robust UI is crucial for ensuring that users can interact with PlaNus effectively.
    By providing clear, actionable feedback, the `Ui` class helps in minimizing user frustration and improving 
    the overall usability of PlaNus.
    - **Highlights:** The class features a comprehensive set of error messages and command guides, including prompts 
    for missing information and invalid commands. Prompts then guide the user to use PlaNus correctly with the correct 
    commands. The implementation of this class is a thoughtful consideration of user needs and common error scenarios.

#### Code Contributed: [iscyng contribution link](https://nus-cs2113-ay2324s2.github.io/tp-dashboard/?search=&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2024-02-23&tabOpen=true&tabType=authorship&tabAuthor=iscyng&tabRepo=AY2324S2-CS2113-W12-1%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code&authorshipIsBinaryFileTypeChecked=false&authorshipIsIgnoredFilesChecked=false)

#### Enhancements to Existing Features

- Updated `GradeChecker` such that GPA is correctly calculated even after user exercises S/U declaration. 
  (Pull request #66)
- Wrote `GradeCheckerTest` to test the calculation of an example's Semester and Year GPA. (Pull request #82)
- Added assertions to `PlaNus` and `GradeChecker`.
- Modified `Parser` such that user can input specific courses with the specific MCs 
(to add their UEs or any mods that they want to take) (Pull request #58)
- Modified `Parser` and `addGrade` to allow for S/U/CS/CU grades. (Pull request #66)
- Modified `Parser` such that it accepts grades in small and capitalised letter grades. (Pull request #42)
- Modified `Parser` to prevent viewing years outside of range given. (Pull request #95)
- Modified `Parser` to prevent viewing by term only. (Pull request #95)
- Modified `Parser` to fix invalid grade changes. (Pull request #95)
- Updated `Parser` to standardise the spacing between commands. (Pull request #95)

#### Documentation

- **User Guide:**
    - Added documentation for checking grades. (#69)

- **Developer Guide:**
    - Added implementation details of the Ui Class.
    - Added System Architecture Diagram to explain PlaNus.

#### Community

- Reviewed PRs (with non-trivial review comments): #77.
- Reported bugs and suggestions for other teams in the class.

