package com.brownj;

public class Main {

    public static void main(String[] args) {
	Controller myController = new Controller();

	try {
        String equation = "35+45++";
        myController.runController(equation);
    }
	catch(Exception e){
	    e.printStackTrace();
    }

    }
}
