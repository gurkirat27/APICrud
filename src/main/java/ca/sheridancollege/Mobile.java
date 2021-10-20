package ca.sheridancollege;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Mobile implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int mid;
	private String mname;
	private String model;
	

	

}
