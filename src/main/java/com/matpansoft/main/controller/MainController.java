package com.matpansoft.main.controller;

import java.io.OutputStream;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.matpansoft.main.service.TestService;

@Controller("mainController")
public class MainController {
	
	@Resource(name = "testService")
	private TestService testService;
	
	@RequestMapping(value = "/main.do")
	public String mainPage(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return "/main/main";
	}
	
	@RequestMapping(value = "/main.ajax")
	public void mainPageAjax(@RequestParam Map<String, String>param, HttpServletRequest request, HttpServletResponse response) throws Exception {
		JSONObject jObj = new JSONObject();
		String resultCode = "00";
		
		try {
		} catch(Exception e) {
			resultCode = "99";
			e.printStackTrace();
		}
		
		jObj.put("resultCode", resultCode);

		response.addHeader("Content-Type", "application/json");
    	OutputStream out = response.getOutputStream();
		out.write(jObj.toString().getBytes("UTF-8"));
		out.flush();
		out.close();
	}
}