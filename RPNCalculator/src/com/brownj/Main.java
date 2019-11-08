package com.brownj;

import com.sun.jdi.AbsentInformationException;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {
	Controller myController = new Controller();

	try {
        String equation = args[0];
        myController.runController(equation);
    }
	catch(IllegalStateException f){
	    myController.printFixExpressionErrorMessage2();
    }
	catch(EmptyStackException g){
	    myController.printFixExpressionErrorMessage();
    }
    catch(ArrayIndexOutOfBoundsException | AbsentInformationException d ){
            myController.printNoEntryErrorMessage();
	}

    }
}
