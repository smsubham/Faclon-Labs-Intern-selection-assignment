#Faclon Labs Intern selection assignment
##1) Implement a dynamically populated list of CardView.

###Objective:
Make an activity which fetches data from an Array and populates the ListView with
Cards, the number of Cards in the ListView will be equal to the number of entries in
the array.

###Example:
A string array containing: {“first”, “second”, “third”}
Total of 3 elements, so the number of card in the ListView will be 3 with each card
displaying the string as text inside the CardView.


##2) Implement a dynamically populated ListView with a “Show more” button

###Objective:
Make an activity which fetches data from an Array and populates the ListView, the
number of elements in the ListView will be equal to a pre specified number (say 20),
after the first 20 entries a Load More button appears which add another 20 items to
the ListView.
Each item in the ListView shows a String inside the TextView.

###Example:
An array of 150 elements is used the source. The ListView fetches first 20 String
values and builds a List of 20 items with a Load More button at the end. Clicking the
button will fetch additional 20 items and add them to the list. Towards the end it will
fetch the last 10 remaining elements and add them to the list.
