package com.brownj;

import java.util.Stack;

class Controller {
    private ExpressionEvaluator myEvaluator;
    private Stack myStack = new Stack();


    Controller(){
        System.out.println("Controller created");

    }

    void printIntroMessage(){}

    void getUserInput(){

    }

    void runController(String equation) throws IllegalArgumentException{
        System.out.println("***Welcome to the RPN Calculator***");
        if(equation.isEmpty()) {
            throw new IllegalArgumentException();
        }

        runEvaluateExpression(equation);
    }

    private void runEvaluateExpression(String expression){
        myEvaluator = new ExpressionEvaluator(expression);
        System.out.println(expression);
        int num1 = Character.getNumericValue(expression.charAt(0));

        System.out.println(num1);
    }
}
