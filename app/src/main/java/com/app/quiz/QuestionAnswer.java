package com.app.quiz;

public class QuestionAnswer {

    public static String question[] = {
            "What is Java?",
            "Which of the following is not a primitive data type in Java?",
            "What is the default value of int variable in Java?",
            "What is the use of 'this' keyword in Java?",
            "What is the difference between '== and '.equals()' in Java?"
    };

    public static String choice[][] = {
            {"A programming language", "A coffee brand", "A car manufacturer", "A type of tea"},
            {"float", "boolean", "char", "integer"},
            {"0", "1", "null", "undefined"},
            {"To refer to the current instance of the class", "To declare a new variable", "To define a static method", "To create an instance of another class"},
            {"'==' compares object references, '.equals()' compares object contents", "'==' is used for primitives, '.equals()' is used for objects", "'==' compares primitive values, '.equals()' compares object references", "'==' is a logical operator, '.equals()' is a method"}
            };
    public static String correctAnswers[] = {
            "A programming language",     // Correct answer for "What is Java?"
            "integer",                      // Correct answer for "Which of the following is not a primitive data type in Java?"
            "0",                          // Correct answer for "What is the default value of int variable in Java?"
            "To refer to the current instance of the class",  // Correct answer for "What is the use of 'this' keyword in Java?"
            "'==' compares object references, '.equals()' compares object contents" // Correct answer for "What is the difference between '== and '.equals()' in Java?"
    };
    }
