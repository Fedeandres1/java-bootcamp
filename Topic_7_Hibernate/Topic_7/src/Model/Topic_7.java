/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Operation;
import Model.Student;
import java.util.Date;

/**
 *
 * @author Frederic
 */
public class Topic_7 {

    private static Operation operation = null;

    /**
     * This is the test class we save a teacher a student and a course
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operation = new Operation();
        Student student = new Student("Federico", "Solterman", new Date());

        Teacher teacher = new Teacher("Anacleto", "Antonia", new Date());
        Course course = new Course("Español", 12, 5);
        /* operation.openConnection();
         operation.saveObject(student);
         operation.saveObject(teacher);
         operation.saveObject(course);
         operation.closeConnection();
         
         operation.openConnection();
         operation.fetchTeacher();
         operation.closeConnection();
         
        operation.openConnection();
        System.out.println(operation.fetchCourse());
        operation.closeConnection();

        
         operation.openConnection();
         System.out.println(operation.fetchCourse());
         operation.closeConnection();*/
        operation.openConnection();
        System.out.println(operation.fetchStudentsOfCourse(2));
        operation.closeConnection();
    }

}
