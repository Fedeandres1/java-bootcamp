/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Operation;
import Model.Student;

/**
 *
 * @author Frederic
 */
public class Topic_7 {

    private static Operation operation = null;

    /** This is the test class we save a teacher a student and a course
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operation = new Operation();
        Student student = new Student("Federico", "Solterman", "1990-10-26");

        Teacher teacher = new Teacher("Anacleto", "Antonia", "1850-02-15");
        Course course = new Course("Español", 12, 5);
        operation.openConnection();
        operation.saveObject(student);
        operation.saveObject(teacher);
        operation.saveObject(course);
        operation.closeConnection();
    }

}
