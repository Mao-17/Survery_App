# Survey App

This is a sample Android application called Survey App that allows participants of the Odyssey event to provide feedback. The app collects information about the participant's name, role, events attended, and ratings for each event. The entered information is displayed in a third activity upon submission. The app also provides the ability to clear the entered information and ensures robustness across rotations.

## Features

- Collect participant information (name and role) in the first activity using text views and edit text boxes.
- Display a list of events (Music, Dance, Play, Fashion, and Food) with checkboxes in the first activity.
- Allow participants to select the events they attended and provide ratings for each event.
- Provide a submit button to show the entered information in a third activity.
- Provide a clear button to allow users to clear the entered information in the second activity.
- Show a toast message upon submission, indicating that the entry has been recorded.
- Log state transitions of each activity (from Resumed to Paused, etc.) using INFO level logs.
- Show a toast message for each state transition of each activity.


## Installation

To run the Survey App on your Android device, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/odyssey-survey-app.git
   ```

2. Open the project in Android Studio.

3. Build and run the app on your connected device or emulator.

## Usage

1. Launch the app on your Android device.

2. Fill in your name and role in the first activity.

3. Click the "Next" button to proceed to the second activity.

4. Select the events you attended by checking the checkboxes and provide ratings for each event.

5. Click the "Submit" button to view the entered information in the third activity.

6. To clear the entered information, click the "Clear" button in the second activity.

7. A toast message will be shown upon submission, confirming that the entry has been recorded.

8. The state transitions and toast messages will be logged and displayed in the Android Logcat.

## Development

This app was developed using the following:

- Android Studio
- Java programming language
- LinearLayout for UI layout
