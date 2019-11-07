package com.brownj;

class Controller {
    private ExpressionEvaluator myEvaluator;



    Controller(){
        System.out.println("Controller created");
        myEvaluator = new ExpressionEvaluator();
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
        System.out.println(expression);
    }
}
