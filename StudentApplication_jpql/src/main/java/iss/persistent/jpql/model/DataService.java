package iss.persistent.jpql.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class DataService {

   protected EntityManager em;

   public DataService(EntityManager entityManager) {
      em = entityManager;
   }

   public List<Student> findAllStudents() {
      String q = "SELECT s FROM Student s";
      
      return (List<Student>) em
               .createQuery(q).getResultList();
   }
   
   public List<Student> findAllStudentsWithOrder(){
	   String q=" SELECT s "+
			   	" FROM Student s "+
			   	" ORDER BY s.matricNo";
	   return (List<Student>) em
			   .createQuery(q).getResultList();
   }
   
   public List<Student> findAllStudentsByName(){
	   String q=" SELECT s "+
			   	" FROM Student s "+
			   	" WHERE s.name LIKE '%n'";
	   return (List<Student>) em
			   .createQuery(q).getResultList();
   }
   
   //3.	Retrieve all students with CAP >= 2.0.
   public List<Student> findAllStudentsByCAP(){
	   String q=" SELECT s "+
			   	" FROM Student s "+
			   	" WHERE s.cap>2.0";
	   return (List<Student>) em
			   .createQuery(q).getResultList();
   }
   //4.	Assume a search page has 4 students and pages start with 1, retrieve all students on page 2.


}
