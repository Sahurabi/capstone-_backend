package example.medicare.com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import example.medicare.com.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine, Integer>{
	@Query("Select m from Medicine m where m.name=?1")
	public Medicine findMedByName(String name);

}