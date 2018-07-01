# quizapp

The Quiz App can be downloaded here:

https://drive.google.com/open?id=13Tt1B0FVp-2zNznJMm0luN8_Oo0fOYzn

Synopsis:

The quiz App grades user response to quiz questions. My quiz App tests knowledge about fire safety.
Different input types are used to capture user responses. I developed this App during the 7 Days of Code Challenge
of the Google Africa Scholarship Program. The Challenge tests skills learnt on the Android Basic course by Udacity.

Design:

The quiz contains 10 questions. A point is scored when a question is correctly answered. A maximum of 10 points
can be scored. Quiz scores pop-up on the screen when the "Get Score" button is clicked. The App is single screen. 
Radio buttons, check boxes and text fields are used to capture user responses. The questions and correct responses are listed
in the "Quiz Questions & Answers" section.

To keep code to a minimum, arrays and collections were used. This required reviewing the Java documentation and borrowing code snippets
from sites like Stack Overflow. Specifically arrays and collections were used to store user responses and expected responses.
Array and collection methods were also useful in comparing user responses with expected responses.

Grading Logic:

For questions with radio buttons (i.e., questions 1, 5, 6, 8, 9 and 10)

A point is scored if the following condition is met:

-- the radio button corresponding to the only correct answer is selected.

For questions with check boxes (questions 2, 3 and 4)

A point is scored if the following condtions are met:

-- all correct options are selected.

-- the number (i.e., count) of options selected by the user exactly matches the number of correct options for the question.

For questions requiring free text input (question 7)

A point is scored if the following condition is met:

--  all expected keywords are found in the user's response.


Quiz Questions & Answers

1. Where should you aim the nozzle of a fire extinguisher when putting out a fire?

A. At the center of the fire

B. At the base of the fire   

C. At the top of the fire

D. It doesn't matter as long as it is aimed at the fire

Ans: B

2. Which extinguisher should you use for fires caused by flammable liquids like petrol? Select all that apply.

A. Water B. Liquid Foam C. Carbon Dioxide D. Dry Powder 

Ans: B, C, D

3. Which extinguisher should you use for burning wood or paper? Select all that apply.

A. Water B. Liquid Foam C. Carbon Dioxide D. Dry Powder

Ans: A, B, D

4. Which extinguisher should you use for electrical fires? Select all that apply.

A. Water B. Liquid Foam C. Carbon Dioxide D. Dry Powder

Ans: C, D

5. When using a fire extinguisher, how far away from the fire should you stand?

A. 2 to 4 feet B. 4 to 6 feet C. 6 to 8 feet  D. 8 to 9 feet

Ans: C

6. What does the symbol below tell you about a material?

<Image>
    
A. Material can cause other materials to burn quickly B. Material is flammable C. Material is corrosive D. Material is explosive

Ans: A

7. What three (3) elements are needed for fire to burn?

Ans: Fuel, Heat and Oxygen

8. What does the fire safety sign below mean?

<Image>

A. Fire hose location B. Designated meeting point in the event of a fire C. Fire extinguisher location D. Fire alarm location

Ans: D

9. Where a stairwell is unavailable during a fire you should exit the building quickly using an elevator if available.
     
Ans: False

10. Dry sand may be used to fight small fires caused by inflammable liquids.
    
Ans: True


Attribution

Fire warning sign image by OpenClipart-Vectors on Pixabay.com

















