package ca.sheridancollege;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MobileRepo extends JpaRepository<Mobile, Integer>
{
	List<Mobile> findByModel(String mname);
	
	List<Mobile> findByMid(int mid);
}
