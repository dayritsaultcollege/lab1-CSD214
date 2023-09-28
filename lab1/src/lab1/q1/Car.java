package lab1.q1;

/**
 Author : Andrei Dayrit
 Date : 09/27/2023
 Description : declaration of the variables and create a constructor for the class car.
 **/


public class Car extends Main{


    //global variables declaration
    String make;
    String model;
    int year;
    int VIN;
    int COUNT;



    public Car(String make, String model, int year, int VIN, int COUNT){

        this.make = make;
        this.model = model;
        this.year = year;
        this.VIN = VIN;
        this.COUNT = COUNT;


    }


    public Car(String firstname, String lastname, String gender, int SIN, int COUNT) {
        super(firstname, lastname, gender, SIN, COUNT);
    }
}