package com.brownj;


import com.sun.jdi.AbsentInformationException;

public class Parser {
    private char[] expressionValues;

    void runParser(String expression) throws AbsentInformationException {
        if(expression.length() > 1) {
            expressionValues = new char[expression.length()];
        }
        else{
            throw new AbsentInformationException();
        }

        parseExpression(expression);
    }

    private void parseExpression(String expression){
        int index = expressionValues.length;

        char value;

        for(int i = 0; i < index; i++){
            expressionValues[i] = expression.charAt(i);
        }

    }

    public char[] getExpressionValues(){
        return expressionValues;
    }

}//end class
