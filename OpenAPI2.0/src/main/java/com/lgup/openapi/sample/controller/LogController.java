package com.lgup.openapi.sample.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/log")
public class LogController {
	
	
	@RequestMapping(value="/level/{level}", method = RequestMethod.POST)
	@ResponseBody
	public String changeLog(@PathVariable("level")String level) {
		String status = "success";
		Level changeLevel = null;
		
		try {
			
			if(StringUtils.isEmpty(level)) {
				throw new Exception("level is null.");
			}
			
			Logger root =  (Logger)LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
			List<Logger> loggerList = root.getLoggerContext().getLoggerList();
			
			if(level.toUpperCase().equals(Level.INFO.levelStr)) {
				changeLevel = Level.INFO;
			} else if (level.toUpperCase().equals(Level.DEBUG.levelStr)) {
				changeLevel = Level.DEBUG;
			} else if (level.toUpperCase().equals(Level.ERROR.levelStr)) {
				changeLevel = Level.ERROR;
			} else {
				
			}
			root.setLevel(changeLevel);
			for(Logger logger : loggerList) {
				logger.setLevel(changeLevel);
			}
			
		} catch(Exception ex) {
			return "fail";
		}
		
		return status;
	}

}
