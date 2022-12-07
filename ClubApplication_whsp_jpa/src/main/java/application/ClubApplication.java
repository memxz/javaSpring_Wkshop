package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import data.FacilityService;

public class ClubApplication {
	   public static void main(String[] args) {
	      EntityManagerFactory emf =    
	              Persistence.createEntityManagerFactory("JPAWorkshop");
	      EntityManager em = emf.createEntityManager();
	      FacilityService fs = new FacilityService(em);
	      
	      em.getTransaction().begin();
	      fs.createFacility("chair","office chair");
	      fs.createFacility("Meetingroom 3A","Meetingroom at 3rd floor");
	      fs.createFacility("Meeting room 3B","Meetingroom at 3rd floor");
	      fs.createFacility("Meeting room 4A","Meetingroom at 4th floor");

	      em.getTransaction().commit();
	   }
	}
