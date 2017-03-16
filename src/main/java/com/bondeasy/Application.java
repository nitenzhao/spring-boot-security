/**
 * Copyright (c) 2017, BondEasy All Rights Reserved.
*/

package com.bondeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Function: Spring boot 入口程序
 *
 * @author   Zhaoyc
 * 2017年3月16日 下午2:44:07
 */

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

