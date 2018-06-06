package main.ssh.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import main.ssh.entity.RegionPoint;

@Controller
public class RegionPointController {

	@RequestMapping(value="regionspread")
	public String regionPointRequest(HttpServletRequest req,Model model,RegionPoint regionPoint){
		return null;
	}
	
}
