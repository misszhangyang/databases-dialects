package main.ssh.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import main.ssh.entity.OverviewDialects;
import main.ssh.entity.RegionPoint;
import main.ssh.entity.RegionSpread;
import main.ssh.service.OverViewDialectsService;
import main.ssh.service.impl.OverViewDIalectsServiceImpl;
import main.ssh.service.impl.RegionPointServiceImpl;

@Controller
public class OverViewDialectsController {
	@RequestMapping(value = "overview")
	public String overViewDialectsRequest(HttpServletRequest req, Model model, OverviewDialects overviewDialects) {
		String place = req.getParameter("place");
		RegionPointServiceImpl rs = new RegionPointServiceImpl();
		OverViewDialectsService ovd = new OverViewDIalectsServiceImpl();
		if ("".equals(place) || place == null) {
			overviewDialects = ovd.queryViewDialects();
			model.addAttribute("overview", overviewDialects.overview);
			model.addAttribute("place", "方言总览");
		} else {
			setReturnData(model,place,ovd);
		}
		return "overview";
	}

	private void setReturnData(Model model, String place,OverViewDialectsService ovd) {
		RegionSpread regionSpread = new RegionSpread();
		regionSpread = ovd.queryRegionSpread();
		if ("shexian".equals(place)) {
			model.addAttribute("overview", regionSpread.Shexian);
			model.addAttribute("place", "歙县");
		}
		if ("xiunin".equals(place)) {
			model.addAttribute("overview", regionSpread.Xiunin);
			model.addAttribute("place", "休宁");
		}
		if ("qimen".equals(place)) {
			model.addAttribute("overview", regionSpread.Qimen);
			model.addAttribute("place", "祁门");
		}
		if ("yixian".equals(place)) {
			model.addAttribute("overview", regionSpread.Yixian);
			model.addAttribute("place", "黟县");
		}
		if ("jixi".equals(place)) {
			model.addAttribute("overview", regionSpread.Jixi);
			model.addAttribute("place", "绩溪");
		}
	}
}
