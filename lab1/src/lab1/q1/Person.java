package lab1.q1;

import java.util.Objects;

public class Person {
    // Enum for representing gender of Person
    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    // Attributes of Person class (private)
    private String firstname;
    private String lastname;
    private Gender gender; // Use enum for gender
    private int SIN;
    private static int COUNT = 0; // Class variable

    // Constructors
    public Person(String firstname, String lastname, Gender gender, int SIN) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.SIN = SIN;
        COUNT++; // Increment COUNT when a Person is created
    }


    // Getters and Setters for attributes
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getSIN() {
        return SIN;
    }

    public void setSIN(int SIN) {
        this.SIN = SIN;
    }

    // toString Method
    @Override
    public String toString() {
        return "{ " + firstname + " " + lastname + ", Gender: " + gender + ", SIN=" + SIN + " }";
    }

    // Equals and HashCode Methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return SIN == person.SIN &&
                firstname.equals(person.firstname) &&
                lastname.equals(person.lastname) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, gender, SIN);
    }

    // Static method to get COUNT
    public static int getCount() {
        return COUNT;
    }

    // Finalize Method
    @Override
    protected void finalize() throws Throwable {
        COUNT--; // Decrement COUNT when a Person is deleted
        super.finalize();
    }
}
