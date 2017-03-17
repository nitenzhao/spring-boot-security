/**
 * Copyright (c) 2017, BondEasy All Rights Reserved.
*/

package com.bondeasy.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Function: 主控制类
 *
 * @author   Zhaoyc
 * 2017年3月16日 下午2:48:39
 */

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/login")
	public String login() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails)
			return "main";
		else
			return "login";
	}

	@RequestMapping("/main")
	public String main() {
		return "main";
	}
}

