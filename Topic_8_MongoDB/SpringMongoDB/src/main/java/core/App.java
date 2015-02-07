/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;


import com.mycompany.springmongodb.SpringMongoConfig;
import java.util.List;
import model.Course;
import model.Student;
import model.StudentXCourseXNote;
import model.Teacher;
import model.TeacherXCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Update;


/**
 *
 * @author Frederic
 */
public class App {

    public static void main(String[] args) {

        // For XML
        //ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");
        // For Annotation
        ApplicationContext ctx
                = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

        //Student user = new Student("3", "federico", "solterman", "26-10-1990");
        // save
        //mongoOperation.save(user);
        // now user object got the created id.
        // System.out.println("1. user : " + user);
        // query to search user
        // Query searchUserQuery = new Query(Criteria.where("first_name").is("federico")) {
        //};
        // find the saved user again.
        //Student savedUser = mongoOperation.findOne(searchUserQuery, Student.class);
        // System.out.println("2. find - savedUser : " + savedUser);
        //This method  Fetch all students whose notes in a specific course were greater than 4
        BasicQuery query = new BasicQuery("{ $and: [{ note_1: {$gt:4 }, note_2: {$gt:4}, note_3: {$gt:4},note_final:{$gt:4  } } ] }");

        List<StudentXCourseXNote> stu = mongoOperation.find(query, StudentXCourseXNote.class);
        StudentXCourseXNote aux;

        for (int i = 0; i < stu.size(); i++) {
            aux = stu.get(i);
            BasicQuery query1 = new BasicQuery("{id_registration:" + " \"" + aux.getId_student() + "\"}");

            Student student = mongoOperation.findOne(query1, Student.class);

            System.out.println(student.toString());

        }
        //Fetch all courses ordered by name for a given teacher
        BasicQuery query2 = new BasicQuery("{ last_name:\"Sulma\" }");

        Teacher teacher = mongoOperation.findOne(query2, Teacher.class);

        BasicQuery query3 = new BasicQuery("{  id_teacher: \""
                + teacher.getId_teacher() + "\"}");

        List<TeacherXCourse> list = mongoOperation.find(query3, TeacherXCourse.class);
        
        TeacherXCourse aux2;

        for (int j = 0; j < list.size(); j++) {

            aux2 = list.get(j);

            BasicQuery query4 = new BasicQuery("{id_course: \"" + aux2.getId_course() + "\" }");

            Course course = mongoOperation.findOne(query4, Course.class);

            System.out.println(course.toString());

        }
        //This method add a new fields in the collection course
        BasicQuery queryPoint4 = new BasicQuery("{ },{ $set: { finish: boolean } },{ multi: true }");
        Update update=new Update();
        update.set("{}","");
        mongoOperation.updateFirst(queryPoint4, null, Course.class);

        // update password
        /*mongoOperation.updateFirst(searchUserQuery,
         Update.update("password", "new password"), Student.class);*/
        // find the updated user object
        /*Student updatedUser = mongoOperation.findOne(searchUserQuery, Student.class);*/
        //System.out.println("3. updatedUser : " + updatedUser);
        // delete
        // mongoOperation.remove(searchUserQuery, Student.class);
        // List, it should be empty now.
       /* List<Student> listUser = mongoOperation.findAll(Student.class);
         System.out.println("4. Number of user = " + listUser.size());*/
    }
}
