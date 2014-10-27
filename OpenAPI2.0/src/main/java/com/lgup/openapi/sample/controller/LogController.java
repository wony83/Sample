package com.lgup.openapi.sample.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/log")
public class LogController {
	
	
	@RequestMapping(value="/change/{level}", method = RequestMethod.GET)
	@ResponseBody
	public String changeLog(@PathVariable("level")String level) {
		String status = "success";
		
		try {
			
			Logger root =  (Logger)LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
			List<Logger> loggerList = root.getLoggerContext().getLoggerList();
			
			root.setLevel(Level.INFO);
			for(Logger logger : loggerList) {
				logger.setLevel(Level.INFO);
			}
			
		} catch(Exception ex) {
			return "fail";
		}
		
		return status;
	}

}
