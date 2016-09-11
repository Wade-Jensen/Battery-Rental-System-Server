package au.com.battery.rental.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import au.com.battery.rental.persistence.model.Battery;

public interface BatteryRepository extends JpaRepository<Battery, Long>{
	
	Battery findById(Integer id);
}