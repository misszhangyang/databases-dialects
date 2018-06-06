package main.ssh.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import main.ssh.entity.VoiceVideo;
import main.ssh.service.VoiceVideoService;
import main.ssh.service.impl.VoiceVideoServiceImpl;

@Controller
public class VoiceVideoController {
	@RequestMapping(value = "voicevideo")
	public String voiceVideoRequest(HttpServletRequest req, Model model, VoiceVideo voiceVideo) {
		String region = req.getParameter("region");
		String spread = req.getParameter("spread");
		VoiceVideoService voiceVideoService = new VoiceVideoServiceImpl();
		if ("".equals(region) || region == null) {
			VoiceVideo voicevideo = voiceVideoService.queryVoiceVideo("shexian");
			model.addAttribute("voicevideo", voicevideo.vocabulary);
			return "voicevideo";
		}
		return setReturnDataFormDb(model, region, spread, voiceVideoService);
	}

	private String setReturnDataFormDb(Model model, String region, String spread, VoiceVideoService voiceVideoService) {
		VoiceVideo voicevideo = voiceVideoService.queryVoiceVideo(region);
		if ("shexian".equals(region)) {
			model.addAttribute("place", "歙县");
		}
		if ("xiunin".equals(region)) {
			model.addAttribute("place", "休宁");
		}
		if ("essay".equals(spread)) {
			model.addAttribute("overview", voicevideo.essay);
			return "overview";
		}
		if ("clause".equals(spread)) {
			model.addAttribute("overview", voicevideo.clause);
			return "overview";
		}
		return setReturnData(model, spread, region, voicevideo);
	}

	private String setReturnData(Model model, String spread, String region, VoiceVideo voicevideo) {
		if ("vocabulary".equals(spread)) {
			if ("shexian".equals(region)) {
				model.addAttribute("voicevideo", voicevideo.vocabulary);
				return "voicevideo";
			} else {
				model.addAttribute("overview", voicevideo.vocabulary);
				return "overview";
			}
		} else {
			if ("shexian".equals(region)) {
				model.addAttribute("overview", voicevideo.phonology);
				return "overview";
			} else {
				model.addAttribute("voicevideo", voicevideo.phonology);
				return "voicevideo";
			}
		}
	}
}
