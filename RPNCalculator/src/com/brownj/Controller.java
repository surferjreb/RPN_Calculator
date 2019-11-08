package com.brownj;

import com.sun.jdi.AbsentInformationException;

class Controller {
    private ExpressionEvaluator myEvaluator;
    private Parser myParser;


    Controller(){
        myParser = new Parser();
        myEvaluator = new ExpressionEvaluator();
    }

    void printNoEntryErrorMessage(){
        System.out.println("\t\t***Error***");
        System.out.println("Sorry, you did not enter an expression.");
        System.out.println("Please enter an expression. ");
        System.out.println("i.e.: \"55+\" or \"5545++-\" or \"55+45+-\"");
        System.out.println("Please try again...");
    }

    void printFixExpressionErrorMessage(){
        System.out.println("\t\t***Error***");
        System.out.println("Sorry, You have entered the expression incorrectly...");
        System.out.println("You have not entered enough numbers for the expression"+
                " to be evaluated.");
        System.out.println("Please try again...");
    }

    void printFixExpressionErrorMessage2(){
        System.out.println("\t\t***Error***");
        System.out.println("Sorry, You have entered the expression incorrectly...");
        System.out.println("You have not entered enough operands for the expression"+
                " to be evaluated.");
        System.out.println("Please try again...");
    }

    void runController(String equation) throws AbsentInformationException {
        System.out.println("***Welcome to the RPN Calculator***");

        runParser(equation);
        runEvaluateExpression();
        printResults();

    }

    private void runParser(String equation) throws AbsentInformationException {
        myParser.runParser(equation);

    }

    private void runEvaluateExpression(){

        myEvaluator.runExpressionEvaluator(myParser.getExpressionValues());

    }

    private void printResults(){
        String answer = myEvaluator.AnswerToUser();
        System.out.println("********************");
        System.out.println("Your answer is: " + answer);
        System.out.println("********************");
        System.out.println("Have a great day!!");
    }
}//end class
