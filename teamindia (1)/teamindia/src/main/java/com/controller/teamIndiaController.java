package com.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.teamIndia;
import com.service.teamIndiaService;

@RestController
public class teamIndiaController {
   @Autowired
	teamIndiaService service;
	
	@RequestMapping("/save")
	String saveplayer(@RequestBody teamIndia teamIndia){
	service.teamIndia(teamIndia);
	return "Added successfully";
	}
	
	@GetMapping("/Get")
	List<teamIndia> getplayer(){
		 List<com.Entity.teamIndia>ll=service.getplayer();
		 return ll;
	}
	
	@PutMapping("/update")
		String updatePlayer(@RequestBody teamIndia teamIndia) {
		service.updatePlayer(teamIndia);
		return "updated successfully....";
	}	
	
	
	@DeleteMapping("/delete/{srno}")
	String deletePlayer(@PathVariable int srno) {
		service.deletePlayer(srno);
	return "deleted successfully....";
}	
}
	

