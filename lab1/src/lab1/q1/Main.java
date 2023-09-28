package lab1.q1;

/**
 Author : Andrei Dayrit
 Date : 09/27/2023
 Description : get the values of the object and print it.
 **/
public class Main extends App {


    //constructor of the class
    public Main(String firstname, String lastname, String gender, int SIN, int COUNT) {
        super(firstname, lastname, gender, SIN, COUNT);
    }

    public static void main(String[] args) {

        //create an object of the class
        Main person = new Main("Andrei","Dayrit","M",1234,1);
        Main person2 = new Main("Fredrich","Dayrit","M",5678,2);


        //print the values of the object
        System.out.println(person.firstname +" "+ person.lastname+", "+ person.gender +", SIN="+ person.SIN);
        System.out.println(person2.firstname +" "+ person2.lastname+", "+ person2.gender +", SIN="+ person2.SIN);




    }
}
