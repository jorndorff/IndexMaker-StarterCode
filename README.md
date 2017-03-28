Document Indexer
================

Overview
--------

In this lab, you will create a program that creates an index for a text file. This index will list all of the line numbers where a given word appears. For example:

``` Example Input
Because I do not hope to turn again
Because I do not hope
Because I do not hope to turn
```

``` Example Output
AGAIN 1
BECAUSE 1, 2, 3
DO 1, 2, 3
HOPE 1, 2, 3
I 1, 2, 3
TO 1, 3
TURN 1, 3
```



Useage
------

Authors
-------

License
-------

Assignment
----------
** Remember to delete or revise this content before submitting **

Look for updates to the starter code here: https://github.com/jorndorff/IndexMaker-StarterCode.git

You will need to use 4 classes:

* IndexMaker
* DocumentIndex
* IndexEntry
* FileMaker (already written for you)

The relationship of these classes looks like this:

IndexMaker is your runner class that will contain your main method. This main method will utilize the FileMaker class. To run IndexMaker, your program needs to know 2 things: the name of the file to read and the name of the file to write. Your program should take these in as command-line arguments. For example:

`java IndexMaker Ash_Wednesday.txt AW_Index.txt`

However, if the appropriate command line argument is not given, your program should prompt the user (using the Scanner class) to enter in the appropriate information.

You should create a new instance of FileMaker and use the readChar method to give you back a character from the file. You'll need to watch for characters like space and new line to keep track of words and lines. You may find `Character.isLetter()` helpful. Lastly, your main method should output the DocumentIndex to the appropriate file once it is completed. There is a static method within FileMaker to allow you to easily write a file.

###IndexEntry Class

Class fields: A string that is the word and a List to hold the line numbers where that word appears.

Methods:

- Constructor that takes in a string that is the word and stores it in all caps. It should also initialize the line number list.

- void add(int num) that adds a given number to the line number list if the line number is not already there.

- String getWord() accessor for the word.

- String toString() that creates a string representation of the IndexEntry.

###DocumentIndex class

Make 2 constructors: one that creates a list with the default capacity, and another that creates a list with a given capacity. (Hint - just use ArrayLists constructors)

Create 3 public methods:

void addWord (String word, int lineNum) - if the word is already in the index, update 
that entry accordingly. Otherwise, create a new entry and add it to the DocumentIndex.

boolean add(IndexEntry entry) - puts the IndexEntry in the proper place in the DocumentIndex. The words should be sorted alphabetically. (Hint - use ArrayLists other add method.) The method should return whether or not the IndexEntry was successfully added (which it should always be unless the word already exists).

String toString() - returns a String representation of the DocumentIndex.
