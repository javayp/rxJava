package com.rx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rx.service.LauncherService;

@RestController
public class LaunchController {
	
	@Autowired
	private LauncherService launchServ;
	
	@RequestMapping("/launch")
	public void launcher() {
		launchServ.nameService();
	}
	
	
}
