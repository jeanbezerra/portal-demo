package br.com.trendsoftware.portal.controller;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class HomeController implements Serializable {

	private static final long serialVersionUID = -5916015573543467486L;

	private String currentDate;

	public HomeController() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		this.currentDate = sdf.format(new Date());
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

}
