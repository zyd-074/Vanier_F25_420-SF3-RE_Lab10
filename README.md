**Info:**
- School: Vanier College
- Course: 420-SF3-RE
- Semester: Fall 25
- Lab: 10

**Note:**
- This lab was built to learn how to sue SceneBuilder to design a GUI containing a MenuBar and how to handle the items.
- All event handlers are **NOT** actually handling actions but ONLY printing to the console.
- Save and Open files handlers technically should **only** print the selected file's path.
- Save file will NOT create an actual file and should NOT overwrite any selected file. To avoid any lose of data, please DO NOT REPLACE any IMPORTANT file during the test.

**Handlers Explaination**:
- Initialized as:
  - All functions should work except `Close` & `Save`
- If `New` got pressed:
  - `New has been pressed` should be printed in the console
  - `New` & `Open` should be disabled.
- If `Open` got pressed:
  - A file chooser should pop up. When a file got chosen,  `User opened: $PATH$` should be printed in the console.
  - `New` & `Open` should be disabled.
- If `Close` got pressed:
  - `New` & `Open` should be enabled.
  - `Close` & `Save` should be disabled.
  - `User closed the file` should be printed in the console.
- If `Save` got pressed: 
  - A file chooser should pop up. When a path and file name is decided / a file got chosen by the user and saved, `User saved file to: $PATH$` should be printed in the console.
  - This action should NOT create / overwrite any file. 
  - All functions stay the same
- If `Use Gridlines` got selected / unselected:
  - One of `USE GRIDLINES selected/unselected` should be printed in the console.
- If `Copy`, `Find` or `Repace` got pressed:
  - `COPY/FIND/REPLACE has been pressed` should be printed in the console.
- If `Small`, `Medium` or `Large` got pressed:
  - `User switched to SMALL/MEDIUM/LARGE` should be printed in the console.
- If mouse right-clicked in the empty area: 
  - A popup with `Help` & `Inspect` should show
    - If `Help` got pressed, `HELP has been pressed` should be printed in the console.
    - If `Inspect` got pressed, `INSPECT has been pressed` should be printed in the console.