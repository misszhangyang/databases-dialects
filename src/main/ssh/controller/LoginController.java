package main.ssh.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import main.ssh.entity.User;
import main.ssh.service.LogionService;
import main.ssh.service.impl.LogionServiceImpl;

@Controller
public class LoginController {
	@RequestMapping(value="login")
	public String login(HttpServletRequest req, Model model) {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		LogionService logionService = new LogionServiceImpl();
		User user = logionService.queryFromUser(name);
		String result = "login";
		// 请求为登录
		if ("submit".equals(req.getParameter("submit"))) {
			if (" ".equals(user) || user == null || !name.equals(user.name) || !password.equals(user.password)) {
				JOptionPane.showMessageDialog(null, "操作失败", "用户信息错误", JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "登录成功");
				model.addAttribute("name", user.name);
				result = "welcome";
			}
		}
		// 请求为注册
		else {
			if ("".equals(user) || user == null && logionService.insertIntoUser(name, password)) {
				JOptionPane.showMessageDialog(null, "注册成功，请登录");
			} else {
				JOptionPane.showMessageDialog(null, "操作失败", "用户名重复了", JOptionPane.ERROR_MESSAGE);
			}
		}
		return result;
	}
}
