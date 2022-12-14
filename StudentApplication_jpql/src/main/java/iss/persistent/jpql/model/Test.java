package iss.persistent.jpql.model;

import java.util.List;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
   public static void main(String[] args) {
      EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JPA");
      EntityManager entityManager = emFactory.createEntityManager();
      DataService dataService = new DataService(entityManager);

      findAllStudents(dataService);
      
      findAllStudentsWithOrder(dataService);
            
      findAllStudentsByName(dataService);
      
      findAllStudentsByCAP(dataService);
      
      entityManager.close();
      emFactory.close();
   }

   static void findAllStudents(DataService ds) {
      List<Student> students = ds.findAllStudents();
      for (Student s: students) {
         System.out.println(s);
      }
   }
   
   static void findAllStudentsWithOrder(DataService ds) {
	   List<Student> students = ds.findAllStudentsWithOrder();
	   for (Student s: students) {
	         System.out.println(s);
	      }
   }
   
   static void findAllStudentsByName(DataService ds) {
	   List<Student> students = ds.findAllStudentsByName();
	   for (Student s: students) {
	         System.out.println(s);
	      }
   }
   
   static void findAllStudentsByCAP(DataService ds) {
	   List<Student> students = ds.findAllStudentsByCAP();
	   for (Student s: students) {
	         System.out.println(s);
	      }
   }
}
