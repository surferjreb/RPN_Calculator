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

    void runEvaluateExpression(String expression){}
}
