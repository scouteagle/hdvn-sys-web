/**
 * Copyright Huong Dao Viet Nam
 */
package org.hdvn.web.controllers;

import java.util.List;

import org.hdvn.model.table.MProvince;
import org.hdvn.web.services.impl.CacheSevices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Admin
 *
 */
@Controller
public class IndexController {

	private final Logger logg = LoggerFactory.getLogger(IndexController.class);

	@Autowired
	private CacheSevices cacheServices;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		List<MProvince> provinceList = cacheServices.getMProvince();
		logg.debug("=======ACCESS TO=======");
		logg.debug("index page");
		model.addAttribute("province", provinceList);

		return "index";
	}
}
