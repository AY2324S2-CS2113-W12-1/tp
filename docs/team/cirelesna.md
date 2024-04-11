# Ansel Eric - Project Portfolio Page

## Project: PlaNus

PlaNus is a Command Line Interface (CLI) desktop app tailored for students in the Faculty of Engineering at NUS,
aiming to offer a unified solution for managing courses from the past, present, and future.

### Contributions to the project
#### New Features

- **PlaNus Class** 
  - **What it does:** PlaNus class is the main class from which the applications runs from.
  - **Justification:** It is the main class in charge of initialising the application, loading/creating initial save
  file and the loop to take in user input using Ui class and parsing it through Parser class.
  - **Highlights:** Minimal amount of code is used in main class so that setup of application is seamless and
  efficient.

- **Parser Class**

  - **What it does:** Enhanced the Parser class to include more intuitive command parsing, error handling, and user
  feedback mechanisms. These improvements encompassed recognizing a broader range of user commands, providing clearer
  error messages for incorrect inputs, and suggesting possible corrections. This made the application more
  user-friendly and significantly reduced potential user frustration from misinterpretations or mistyped commands.
  - **Justification:** The command parser is the heart of any CLI application, directly impacting user experience.
  By making the parser more robust and intuitive, the usability of PlaNus was significantly enhanced, making it easier
  for users to achieve their goals without needing to refer to the manual frequently.
  - **Highlights:** This feature is distinguished by its flexible command parsing, which can interpret a
  wide range of user inputs, and error handling mechanisms that guide users towards the correct
  usage with helpful messages. 

#### Code Contributed: [cirelesna contribution link](https://nus-cs2113-ay2324s2.github.io/tp-dashboard/?search=w12&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2024-02-23&tabOpen=true&tabType=authorship&tabAuthor=cirelesna&tabRepo=AY2324S2-CS2113-W12-1%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code~other&authorshipIsBinaryFileTypeChecked=false&authorshipIsIgnoredFilesChecked=false)

#### Enhancements to Existing Features

- Implemented the capability to switch between multiple timetables, allowing users to manage different 
schedules seamlessly. This was a significant usability improvement for users that wished to compare different 
schedules.
- Introduced logging and assertions within the Parser.java file to enhance debugging and ensure the reliability 
of command parsing under various scenarios. 
- Revised the default checkGrade feature to display grades for 4 years unless there are courses in year 5 or 6, as the
majority of users will only have courses within 4 years.

#### Documentation
- **User Guide:**
  - Documented the enhanced parser functionality, detailing the commands supported and providing examples of the 
  new error handling capabilities. This section aimed to make it easier for new users to familiarize themselves 
  with PlaNus.

- **Developer Guide:**
  - Elaborated on the parser's design and implementation, offering insights into the logic behind command
  processing and error feedback. Included diagrams to visualize the parser's role within the system's architecture,
  clarifying its function and interaction with other components.

#### Community
- Participated in peer code reviews, offering constructive feedback to colleagues to refine and improve their
contributions.
- Participated in manually testing other teams project and reported bugs