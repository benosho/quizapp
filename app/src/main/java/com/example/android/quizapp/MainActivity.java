package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Array of correct radio button options for questions 1, 5, 6, 8, 9 and 10
    String[] correctRadioButtonOptions = {"radio_1_2", "radio_5_3", "radio_6_1", "radio_8_4", "radio_9_2", "radio_10_1"};

    // Arrays of all check box options for questions 2, 3 and 4
    String[] checkBoxOptionsForQuestion2 = {"checkbox_2_1", "checkbox_2_2", "checkbox_2_3", "checkbox_2_4"};
    String[] checkBoxOptionsForQuestion3 = {"checkbox_3_1", "checkbox_3_2", "checkbox_3_3", "checkbox_3_4"};
    String[] checkBoxOptionsForQuestion4 = {"checkbox_4_1", "checkbox_4_2", "checkbox_4_3", "checkbox_4_4"};

    // Arrays of correct check box options for questions 2, 3 and 4
    List<String> correctCheckBoxChoicesForQuestion2 = Arrays.asList("checkbox_2_2", "checkbox_2_3", "checkbox_2_4");
    List<String> correctCheckBoxChoicesForQuestion3 = Arrays.asList("checkbox_3_1", "checkbox_3_2", "checkbox_3_4");
    List<String> correctCheckBoxChoicesForQuestion4 = Arrays.asList("checkbox_4_3", "checkbox_4_4");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Gets user's inputs/responses and compares them with correct/expected answers
     * Increments quiz score where responses match correct answers
     * Calls method that displays quiz score on the screen
     */
    public void getScore(View view) {

        int quizScore = 0;

        // Get the state of radio buttons for answers that are correct
        // Increment quiz score if radio button for correct answer is checked
        for (String string : correctRadioButtonOptions) {
            int radioButtonID = getResources().getIdentifier(string, "id", getPackageName());
            RadioButton radioButton = findViewById(radioButtonID);
            if (radioButton.isChecked()) {
                quizScore += 1;
            }
        }

        // Get user check box choices for question 2 and compare with correct answers
        // Increment quiz score if user's choices match the correct answers and are the exact count expected
        List<String> userCheckBoxChoicesForQuestion2 = new ArrayList<>();
        for (String string : checkBoxOptionsForQuestion2) {
            int checkBoxID = getResources().getIdentifier(string, "id", getPackageName());
            CheckBox checkBox = findViewById(checkBoxID);
            if (checkBox.isChecked()) {
                userCheckBoxChoicesForQuestion2.add(string);
            }
        }
        if (userCheckBoxChoicesForQuestion2.containsAll(correctCheckBoxChoicesForQuestion2) &&
                userCheckBoxChoicesForQuestion2.size() == correctCheckBoxChoicesForQuestion2.size()) {
            quizScore += 1;
        }

        // Get user check box choices for question 3 and compare with correct answers
        // Increment quiz score if user's choices match the correct answers and are the exact count expected
        List<String> userCheckBoxChoicesForQuestion3 = new ArrayList<>();
        for (String string : checkBoxOptionsForQuestion3) {
            int checkBoxID = getResources().getIdentifier(string, "id", getPackageName());
            CheckBox checkBox = findViewById(checkBoxID);
            if (checkBox.isChecked()) {
                userCheckBoxChoicesForQuestion3.add(string);
            }
        }
        if (userCheckBoxChoicesForQuestion3.containsAll(correctCheckBoxChoicesForQuestion3) &&
                userCheckBoxChoicesForQuestion3.size() == correctCheckBoxChoicesForQuestion3.size()) {
            quizScore += 1;
        }

        // Get user check box choices for question 4 and compare with correct answers
        // Increment quiz score if user's choices match the correct answers and are the exact count expected
        List<String> userCheckBoxChoicesForQuestion4 = new ArrayList<>();
        for (String string : checkBoxOptionsForQuestion4) {
            int checkBoxID = getResources().getIdentifier(string, "id", getPackageName());
            CheckBox checkBox = findViewById(checkBoxID);
            if (checkBox.isChecked()) {
                userCheckBoxChoicesForQuestion4.add(string);
            }
        }
        if (userCheckBoxChoicesForQuestion4.containsAll(correctCheckBoxChoicesForQuestion4) &&
                userCheckBoxChoicesForQuestion4.size() == correctCheckBoxChoicesForQuestion4.size()) {
            quizScore += 1;
        }

        // Get user text entry for question 7 and parse for expected keywords
        // Increment quiz score if all expected keywords are found in user's entry
        EditText editTextView = findViewById(R.id.edit_text_7_1);

        // get user's free text input and convert to lowercase
        String editText = editTextView.getText().toString().toLowerCase();

        // remove punctuations and extra space
        editText = editText.replaceAll("\\p{Punct}", " ");
        editText = editText.replaceAll("\\s{2,}", " ");
        editText = editText.trim();

        // check for expected keywords in user's free text input
        String[] arrayOfUserInputForQuestion7 = editText.split(" ");
        List<String> listOfUserInputForQuestion7 = Arrays.asList(arrayOfUserInputForQuestion7);
        List<String> expectedKeywordsForQuestion7 = Arrays.asList(getString(R.string.keyword_1),
                getString(R.string.keyword_2), getString(R.string.keyword_3));
        if (listOfUserInputForQuestion7.containsAll(expectedKeywordsForQuestion7)) {
            quizScore += 1;
        }

        displayToast(quizScore);
    }

    /**
     * Displays quiz score as a toast on the screen
     *
     * @param quizScore is the number of points scored on the quiz
     */
    private void displayToast(int quizScore) {
        String gradeUnit;
        if (quizScore == 1) {
            gradeUnit = getString(R.string.grade_unit_singular);
        } else {
            gradeUnit = getString(R.string.grade_unit_plural);
        }

        String toastText = getString(R.string.quiz_score_message, quizScore, gradeUnit);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, toastText, duration);
        toast.show();
    }
}