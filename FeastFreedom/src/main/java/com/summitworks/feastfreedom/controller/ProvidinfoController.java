package com.summitworks.feastfreedom.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.summitworks.feastfreedom.bean.ProvidinfoBean;
import com.summitworks.feastfreedom.model.Providinfo;
import com.summitworks.feastfreedom.service.ProvidinfoService;

@Controller
public class ProvidinfoController {
	
	@Autowired
	private ProvidinfoService providinfoService;
	
	@RequestMapping(value = "/saveinfo", method = RequestMethod.POST)
	public ModelAndView saveProvidinfo(@ModelAttribute("command") ProvidinfoBean providinfoBean, 
			BindingResult result) {
		Providinfo providinfo = prepareModel(providinfoBean);
		providinfoService.addProvidinfo(providinfo);
		return new ModelAndView("redirect:/addinfo.html");
	}

	@RequestMapping(value="/providinfos", method = RequestMethod.GET)
	public ModelAndView listProvidinfos() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("providinfos",  prepareListofBean(providinfoService.listProvidinfos()));
		return new ModelAndView("providinfosList", model); // logical name of view, logical name of model, actual model
	}

	@RequestMapping(value = "/addinfo", method = RequestMethod.GET)
	public ModelAndView addProvidinfo(@ModelAttribute("command")  ProvidinfoBean providinfoBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("providinfos",  prepareListofBean(providinfoService.listProvidinfos()));
		return new ModelAndView("addProvidinfo", model);
	}
	
	@RequestMapping(value = "/indexinfo", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("indexinfo");
	}
	
	@RequestMapping(value = "/deleteinfo", method = RequestMethod.GET)
	public ModelAndView editProvidinfo(@ModelAttribute("command")  ProvidinfoBean providinfoBean,
			BindingResult result) {
		providinfoService.deleteProvidinfo(prepareModel(providinfoBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("providinfo", null);
		model.put("providinfos",  prepareListofBean(providinfoService.listProvidinfos()));
		return new ModelAndView("addProvidinfo", model);
	}
	
	@RequestMapping(value = "/editinfo", method = RequestMethod.GET)
	public ModelAndView deleteProvidinfo(@ModelAttribute("command")  ProvidinfoBean providinfoBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("providinfo", prepareProvidinfoBean(providinfoService.getProvidinfo(providinfoBean.getId())));
		model.put("providinfos",  prepareListofBean(providinfoService.listProvidinfos()));
		return new ModelAndView("addProvidinfo", model);
	}
	
	private Providinfo prepareModel(ProvidinfoBean providinfoBean){
		Providinfo providinfo = new Providinfo();
		providinfo.setName(providinfoBean.getName());
		providinfo.setStarttime(providinfoBean.getStarttime());
		providinfo.setEndtime(providinfoBean.getEndtime());
		providinfo.setMonday(providinfoBean.isMonday());
		providinfo.setTuesday(providinfoBean.isTuesday());
		providinfo.setWendesday(providinfoBean.isWendesday());
		providinfo.setThursday(providinfoBean.isTuesday());
		providinfo.setFriday(providinfoBean.isFriday());
		providinfo.setSaturday(providinfoBean.isSaturday());
		providinfo.setSunday(providinfoBean.isSunday());
		providinfo.setId(providinfoBean.getId());
		providinfoBean.setId(null);
		return providinfo;
	}
	
	private List<ProvidinfoBean> prepareListofBean(List<Providinfo> providinfos){
		List<ProvidinfoBean> beans = null;
		if(providinfos != null && !providinfos.isEmpty()){
			beans = new ArrayList<ProvidinfoBean>();
			ProvidinfoBean bean = null;
			for(Providinfo providinfo : providinfos){
				bean = new ProvidinfoBean();
				bean.setStarttime(providinfo.getStarttime());
				bean.setEndtime(providinfo.getStarttime());
				bean.setName(providinfo.getName());
				bean.setMonday(providinfo.isMonday());
				bean.setTuesday(providinfo.isTuesday());
				bean.setWendesday(providinfo.isWendesday());
				bean.setThursday(providinfo.isThursday());
				bean.setFriday(providinfo.isFriday());
				bean.setSaturday(providinfo.isSaturday());
				bean.setSunday(providinfo.isSunday());
				bean.setId(providinfo.getId());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private ProvidinfoBean prepareProvidinfoBean(Providinfo providinfo){
		ProvidinfoBean bean = new ProvidinfoBean();
		bean.setStarttime(providinfo.getStarttime());
		bean.setEndtime(providinfo.getStarttime());
		bean.setName(providinfo.getName());
		bean.setMonday(providinfo.isMonday());
		bean.setTuesday(providinfo.isTuesday());
		bean.setWendesday(providinfo.isWendesday());
		bean.setThursday(providinfo.isThursday());
		bean.setFriday(providinfo.isFriday());
		bean.setSaturday(providinfo.isSaturday());
		bean.setSunday(providinfo.isSunday());
		bean.setId(providinfo.getId());
		return bean;
	}
}
