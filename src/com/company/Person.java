package com.company;

public class Person {                                                             // . Creating a class person with all it's fields.

    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {                                                // . Creating the first method to get the first name.
        return firstName;
    }


    public String getLastName() {                                                 // . Creating the second method to get the last name.
        return lastName;
    }


    public int getAge() {                                                         // . Creating the third method to get the age.
        return age;
    }


    public void setFirstName(String name) {                                       // . Creating the first method to set the first name.
        this.firstName = name;
    }


    public void setLastName(String surname) {                                     // . Creating the second method to set the last name.
        this.lastName = surname;
    }


    public void setAge(int years) {                                               // . Creating the third method to set the age.

        if ((years >= 0) && (years <= 100)) {
            this.age = years;
        } else {
            this.age = 0;
        }
    }


    public boolean isTeen() {                                                     // . Creating a method to verify thanks to the age value if the person is a Teenager or not (>12 <20)

        if (this.age > 12 && this.age < 20) {
            return true;
        } else {
            return false;
        }
    }


    public String getFullName() {                                                 // . Creating the last method to retrieve the full name with all the possibilities that may occur.

        String fullName;                                                          // . Creating the variable String to store the full name

        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {                // . Using the if-statements to make the checks, checking thanks to the class "isEmpty()" if the String value of the first and Last name is 0 == "".
            fullName = "";                                                        // . If both are 0 then set the fullName value (that is null) to "" (to 0).
        } else if (this.lastName.isEmpty()) {                                     // . If the last name is empty set the fullName with the first name.
            fullName = this.firstName;
        } else if (this.firstName.isEmpty()) {                                    // . If the first name is empty set the firstName with the last name.
            fullName = this.lastName;
        } else {                                                                  // . if both first and last name have a value then store the sum of the 2 string divided by a space.
            fullName = this.firstName + " " + this.lastName;
        }
        return fullName;                                                          // . Return the fullName String.
    }
}

// On my first try I was checking if the values were null (this.firstName/lastName == null)
// It worked but partially because a string "" is not considered null, I had to use the class isEmpty for the value to be accepted.

