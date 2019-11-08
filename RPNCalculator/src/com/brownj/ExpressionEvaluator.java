package com.brownj;

import java.util.Stack;

class ExpressionEvaluator {
    private Stack<Integer> myNumbers = new Stack<>();
    private int num1;
    private int num2;
    private char operator;

    void runExpressionEvaluator(char[] expressionValues){
        int MaxIndex = expressionValues.length;
        if(MaxIndex > 0) {
            expressionEvaluatorProcessor(MaxIndex, expressionValues);
        }
        else{
            throw new IllegalArgumentException();
        }
    }//end runExpressionEvaluator

    private void expressionEvaluatorProcessor(int MaxIndex, char[] expressionValues){
        char value;
        int num;

        for(int i = 0; i < MaxIndex; i++){

            value = expressionValues[i];
            switch(value){
                case '+':
                    num1 = myNumbers.pop();
                    num2 = myNumbers.pop();
                    num = addStackValues(num1, num2);
                        myNumbers.push(num);

                    break;
                case '*':
                    num1 = myNumbers.pop();
                    num2 = myNumbers.pop();
                    num = multiplyStackValues(num1, num2);
                    myNumbers.push(num);
                    break;
                case '/':
                    num1 = myNumbers.pop();
                    num2 = myNumbers.pop();
                    num = divideStackValues(num1, num2);
                    myNumbers.push(num);
                    break;
                case '%':
                    num1 = myNumbers.pop();
                    num2 = myNumbers.pop();
                    num = modStackValues(num1, num2);
                    myNumbers.push(num);
                    break;
                case '-':
                    num1 = myNumbers.pop();
                    num2 = myNumbers.pop();
                    num = subtractStackValues(num1, num2);
                    myNumbers.push(num);
                    break;
                default:
                    num = Character.getNumericValue(value);
                    myNumbers.push(num);
            }//end switch


        }//end for

        if(myNumbers.size() > 1){
            throw new IllegalStateException();
        }//end if


    }//end intake

    private int addStackValues(int num1, int num2){
        return num1 = num1 + num2;
    }

    private int subtractStackValues(int num1, int num2){
        return num1 = num1 - num2;
    }

    private int multiplyStackValues(int num1, int num2){
        return num1 = num1 * num2;
    }

    private int divideStackValues(int num1, int num2){
        return num1 = num1 / num2;
    }

    private int modStackValues(int num1, int num2){
        return num1 = num1 % num2;
    }

    public String AnswerToUser(){
        String temp;
        temp = String.valueOf(myNumbers.pop());

        return temp;
    }
}//end class
