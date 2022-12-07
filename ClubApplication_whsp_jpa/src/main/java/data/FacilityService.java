package data;

import java.util.List;

import javax.persistence.EntityManager;

import model.Facility;


public class FacilityService {
   protected EntityManager em;
   
   public FacilityService(EntityManager em) {
      this.em = em;
   }
   
   public Facility createFacility(String name, String description) {
      Facility facility=new Facility();
      facility.setName(name);
      facility.setDescription(description);
      em.persist(facility);
      return facility;
   }
   
   public Facility updateFacility(int id, String name, String description) {
      // To be completed
      return null;
   }
   
   public void removeFacility(int id) {
      // To be completed
   }
   
   public Facility findFacility(int id) {
      // To be completed
      return null;
   }
   
   public List<Facility> listAllFacilities() {
      // To be completed
      return null;
   }
   
}
