package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {

//            createStudent(studentDAO);

//            createMultipleStudents(studentDAO);

//            readStudent(studentDAO);

            queryForStudentsByLastName(studentDAO, "Duck");
        };
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO, String lastName) {
        // get a list of students
        List<Student> students = studentDAO.findByLastName(lastName);


        // display list of students
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void queryForStudents(StudentDAO studentDAO) {
        // get a list of students
        List<Student> students = studentDAO.findAll();


        // display list of students
        for (Student student : students) {
            System.out.println(student);
        }
    }


    private void readStudent(StudentDAO studentDAO) {

        // create a student

        System.out.println("Creating new studnet object ...");
        Student student = new Student("Ram", "Doe", "ram@doe.com");


        // save the student
        System.out.println("Saving the student");
        studentDAO.save(student);

        int theId = student.getId();
        // display id of saved student
        System.out.println("Saved student. Generated id: " + theId);

        // retrieve student based on the id: primary key
        System.out.println("Retrieving student with id: " + theId);
        Student myStudent = studentDAO.findById(theId);

        // display the student
        System.out.println("Found the student: " + myStudent);


    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        // create multiple students
        System.out.println("Creating new student object ...");

        Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
        Student tempStudent2 = new Student("Jane", "Doe", "jane@luv2code.com");
        Student tempStudent3 = new Student("Mary", "Duck", "mary@luv2code.com");

        // save the student objects
        System.out.println("Saving the student ...");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);

    }

    private void createStudent(StudentDAO studentDAO) {
        // create the student object
        System.out.println("Creating new student object ...");

        Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");

        // save the student object
        System.out.println("Saving the student ...");
        studentDAO.save(tempStudent);

        // display id of the saved student
        System.out.println("Saved student. Generated id: " + tempStudent.getId());

    }

}
