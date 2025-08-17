package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// For these exercises, you need to declare a single variable
// in each function that uses the appropriate collection type
// (Array, ArrayList, HashSet, HashMap)
//
// You do not need to populate this array or add any additional code.
// If you get stuck, refer to the java basics 4 (arrays and collections) curriculum
public class CollectionChoiceExercises {
    public void MakeColorCollection() {
        String[] colors = new String[]{"Red", "Blue", "Green"};

        // EXAMPLE:
        // Create an appropriate variable for holding a collection
        // of three strings that are known ahead of time to be "Red", "Green" and "Blue"
        // and will not change during program execution.
    }

    public void MakeStudentCollection() {
        ArrayList<String> students = new ArrayList<>();
        students.add("student1");
        students.add("student2");
        students.add("student3");
        students.remove("John");
        // Create an appropriate collection variable for holding a list of student names
        // that will be added to and removed from during program execution.
    }

    public void MakeLoggedInUsersCollection() {
        HashSet<String> users = new HashSet<>();
        users.add("John");
        users.add("Jane");
        users.add("Jack");
        users.add("John");
        // Create an appropriate collection variable for holding a set of
        // unique logged in usernames where adding a username that's already
        // present is ignored and checking if a user is in the collection can
        // be done very quickly.
    }

    public void MakeEmployeeAccessCodesCollection() {
        HashMap<String, String> employeeAccessCodes = new HashMap<>();
        employeeAccessCodes.put("student1", "John");
        employeeAccessCodes.put("student2", "Jane");
        employeeAccessCodes.put("student3", "John");


        // Create an appropriate collection variable for holding a set of
        // key-value pairs where they key is an employee name (String) and the
        // value is an employee access code (String.)
    }
}
