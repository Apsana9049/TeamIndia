package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.teamIndiaDao;

@Service
public class teamIndiaService {
@Autowired
    teamIndiaDao dao;
	public void teamIndia(com.Entity.teamIndia teamIndia) {
		dao.teamIndia(teamIndia);
		
	}
	
	public List<com.Entity.teamIndia> getplayer(){
		dao.getplayer();
		 List<com.Entity.teamIndia>ll=dao.getplayer();
		 return ll;
}

	

	public String updatePlayer(com.Entity.teamIndia teamIndia) {
		dao.updatePlayer(teamIndia);
		return "updated successfully....";
	}

	public String deletePlayer(int srno) {
		dao.deletePlayer(srno);
		return "deleted successfully....";
	}
	}
