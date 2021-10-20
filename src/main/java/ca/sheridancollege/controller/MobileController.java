package ca.sheridancollege.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ca.sheridancollege.Mobile;
import ca.sheridancollege.MobileRepo;

@Controller
public class MobileController {

	@Autowired
	MobileRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}
	
	
	//Mapping to add mobile
	@RequestMapping("/addMobile")
	public String addMobile(Mobile mobile) {
		
		repo.save(mobile);
		return "home";
	}
	
	
	
	
	
	
	@RequestMapping("/mobiles")
	@ResponseBody
	public List<Mobile> getMobiles() {
		
		
		return repo.findAll();
	}
	
	@RequestMapping("/mobile/{mid}")
	@ResponseBody
	public Optional<Mobile> getMobile(@PathVariable("mid") int mid) {
		
		
		return repo.findById(mid);
	}
	
	
	
	
	
	}
	
	

