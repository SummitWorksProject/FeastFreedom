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
import com.summitworks.feastfreedom.bean.ProvidinfoDetailBean;
import com.summitworks.feastfreedom.model.ProvidinfoDetail;
import com.summitworks.feastfreedom.service.ProvidinfoDetailService;

@Controller
public class ProvidinfoDetailController {
	
	@Autowired
	private ProvidinfoDetailService providinfoDetailService;
	
	@RequestMapping(value = "/saveprovidinfodetail", method = RequestMethod.POST)
	public ModelAndView saveProvidinfoDetail(@ModelAttribute("command") ProvidinfoDetailBean providinfoDetailBean, 
			BindingResult result) {
		System.out.println("1111");
		ProvidinfoDetail providinfoDetail = prepareModel(providinfoDetailBean);
		providinfoDetailService.addProvidinfoDetail(providinfoDetail);
		return new ModelAndView("redirect:/addprovidinfodetail.html?providerId=");
	}

	@RequestMapping(value="/providinfodetails", method = RequestMethod.GET)
	public ModelAndView listProvidinfoDetails() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("providinfoDetails",  prepareListofBean(providinfoDetailService.listProvidinfoDetails()));
		return new ModelAndView("providinfoDetailsList", model); // logical name of view, logical name of model, actual model
	}

	@RequestMapping(value = "/addprovidinfodetail", method = RequestMethod.GET)
	public ModelAndView addProvidinfoDetail(@ModelAttribute("command")  ProvidinfoDetailBean providinfoDetailBean,
			BindingResult result) {
		
		 Map<String, Object> model = new HashMap<String, Object>();
		 model.put("providinfoDetails", prepareListofBean(providinfoDetailService.listProvidinfoDetails()));
		 
		return new ModelAndView("addProvidinfoDetail",model);
	}
	
	@RequestMapping(value = "/loginprovidinfodetail", method = RequestMethod.GET)
	public ModelAndView loginProvidinfoDetail(@ModelAttribute("command")  ProvidinfoDetailBean providinfoDetailBean,
			BindingResult result) {
		
		System.out.println("loginprovidinfoDetail");
		return new ModelAndView("loginProvidinfoDetail");
	}
	
	@RequestMapping(value = "/loginprovidinfoindex", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("loginprovidinfoindex");
	}
	
	
	@RequestMapping(value = "/deleteprovidinfoDetail", method = RequestMethod.GET)
	public ModelAndView editProvidinfoDetail(@ModelAttribute("command")  ProvidinfoDetailBean providinfoDetailBean,
			BindingResult result) {
		providinfoDetailService.deleteProvidinfoDetail(prepareModel(providinfoDetailBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("providinfoDetail", null);
		model.put("providinfoDetails",  prepareListofBean(providinfoDetailService.listProvidinfoDetails()));
		return new ModelAndView("addProvidinfoDetail", model);
	}
	
	@RequestMapping(value = "/editprovidinfoDetail", method = RequestMethod.GET)
	public ModelAndView deleteProvidinfoDetail(@ModelAttribute("command")  ProvidinfoDetailBean providinfoDetailBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("providinfoDetail", prepareProvidinfoDetailBean(providinfoDetailService.getProvidinfoDetail(providinfoDetailBean.getId())));
		model.put("providinfoDetails",  prepareListofBean(providinfoDetailService.listProvidinfoDetails()));
		return new ModelAndView("addProvidinfoDetail", model);
	}
	
	//when login , check name exist or not
	@RequestMapping(value = "/checkprovidinfoDetail", method = RequestMethod.GET)
	public ModelAndView checkprovidinfoDetail(@ModelAttribute("command")  ProvidinfoDetailBean providinfoDetailBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		//model.put("providinfoDetail", prepareProvidinfoDetailBean(providinfoDetailService.getProvidinfoDetailByName(providinfoDetailBean.getName())));
		//if(providinfoDetailBean.getPassword())
		return new ModelAndView("addProvidinfoDetail", model);
	}
	
	private ProvidinfoDetail prepareModel(ProvidinfoDetailBean providinfoDetailBean){
		ProvidinfoDetail providinfoDetail = new ProvidinfoDetail();
		providinfoDetail.setName(providinfoDetailBean.getName());
		providinfoDetail.setPrice(providinfoDetailBean.getPrice());
		providinfoDetail.setType(providinfoDetailBean.getType());
		providinfoDetail.setProvidinfoId(providinfoDetailBean.getProvidinfoId());
		providinfoDetail.setId(providinfoDetailBean.getId());
		providinfoDetailBean.setId(null);
		return providinfoDetail;
	}
	
	private List<ProvidinfoDetailBean> prepareListofBean(List<ProvidinfoDetail> providinfoDetails){
		List<ProvidinfoDetailBean> beans = null;
		if(providinfoDetails != null && !providinfoDetails.isEmpty()){
			beans = new ArrayList<ProvidinfoDetailBean>();
			ProvidinfoDetailBean bean = null;
			for(ProvidinfoDetail providinfoDetail : providinfoDetails){
				bean = new ProvidinfoDetailBean();
				bean.setType(providinfoDetail.getType());
				bean.setPrice(providinfoDetail.getPrice());
				bean.setName(providinfoDetail.getName());
				bean.setProvidinfoId(providinfoDetail.getProvidinfoId());
				bean.setId(providinfoDetail.getId());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private ProvidinfoDetailBean prepareProvidinfoDetailBean(ProvidinfoDetail providinfoDetail){
		ProvidinfoDetailBean bean = new ProvidinfoDetailBean();
		bean.setType(providinfoDetail.getType());
		bean.setPrice(providinfoDetail.getPrice());
		bean.setName(providinfoDetail.getName());
		bean.setProvidinfoId(providinfoDetail.getProvidinfoId());
		bean.setId(providinfoDetail.getId());
		return bean;
	}
}
