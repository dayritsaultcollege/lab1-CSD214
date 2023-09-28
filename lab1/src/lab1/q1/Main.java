package lab1.q1;

/**
 Author : Andrei Dayrit
 Date : 09/27/2023
 Description : get the values of the object and print it.
 **/
public class Main extends App{


    //constructor of the class
    public Main(String firstname, String lastname, String gender, int SIN, int COUNT) {
        super(firstname, lastname, gender, SIN, COUNT);
    }

    public Main() {
    }

    public static void main(String[] args) {

        //create an object of the class and pass the values
        Main p1 = new Main("Andrei","Dayrit", "M",1234,1);
        Main p2 = new Main("Handy","Man","M",5678,2);
        Main p3 = new Main("Aneglica","Mori","F",9101,3);


        //print the values of the object
        System.out.println(p1.firstname +" "+ p1.lastname+", "+ p1.gender +", SIN="+ p1.SIN);
        System.out.println(p2.firstname +" "+ p2.lastname+", "+ p2.gender +", SIN="+ p2.SIN);
        System.out.println(p3.firstname +" "+ p3.lastname+", "+ p3.gender +", SIN="+ p3.SIN);






    }
}
