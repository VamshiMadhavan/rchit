package com.te.exm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.exm.dao.MyDataAccess;
import com.te.exm.model.Players;

@Service
public class ServiceImpl implements MyService {
	
	@Autowired
	MyDataAccess access;

	@Override
	public boolean add(Players players) {
		if(players != null) {
			return access.add(players);
		}
		return false;
	}

}
