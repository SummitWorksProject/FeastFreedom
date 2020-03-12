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
import com.summitworks.feastfreedom.bean.ProviderBean;
import com.summitworks.feastfreedom.model.Provider;
import com.summitworks.feastfreedom.service.ProviderService;

@Controller
public class ProviderController {
	
	@Autowired
	private ProviderService providerService;
	
	@RequestMapping(value = "/saveprovider", method = RequestMethod.POST)
	public ModelAndView saveProvider(@ModelAttribute("command") ProviderBean providerBean, 
			BindingResult result) {
		Provider provider = prepareModel(providerBean);
		providerService.addProvider(provider);
		return new ModelAndView("redirect:/addprovidinfo.html?providerId="+provider.getId());
	}

	@RequestMapping(value="/providers", method = RequestMethod.GET)
	public ModelAndView listProviders() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("providers",  prepareListofBean(providerService.listProviders()));
		return new ModelAndView("providersList", model); // logical name of view, logical name of model, actual model
	}

	@RequestMapping(value = "/addprovider", method = RequestMethod.GET)
	public ModelAndView addProvider(@ModelAttribute("command")  ProviderBean providerBean,
			BindingResult result) {
		
		 Map<String, Object> model = new HashMap<String, Object>();
		 model.put("providers", prepareListofBean(providerService.listProviders()));
		 
		return new ModelAndView("addProvider",model);
	}
	
	@RequestMapping(value = "/loginprovider", method = RequestMethod.GET)
	public ModelAndView loginProvider(@ModelAttribute("command")  ProviderBean providerBean,
			BindingResult result) {
		
		System.out.println("loginprovider");
		return new ModelAndView("loginProvider");
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}
	
	
	@RequestMapping(value = "/deleteprovider", method = RequestMethod.GET)
	public ModelAndView editProvider(@ModelAttribute("command")  ProviderBean providerBean,
			BindingResult result) {
		providerService.deleteProvider(prepareModel(providerBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("provider", null);
		model.put("providers",  prepareListofBean(providerService.listProviders()));
		return new ModelAndView("addProvider", model);
	}
	
	@RequestMapping(value = "/editprovider", method = RequestMethod.GET)
	public ModelAndView deleteProvider(@ModelAttribute("command")  ProviderBean providerBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("provider", prepareProviderBean(providerService.getProvider(providerBean.getId())));
		model.put("providers",  prepareListofBean(providerService.listProviders()));
		return new ModelAndView("addProvider", model);
	}
	
	//when login , check name exist or not
	@RequestMapping(value = "/checkprovider", method = RequestMethod.GET)
	public ModelAndView checkprovider(@ModelAttribute("command")  ProviderBean providerBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("provider", prepareProviderBean(providerService.getProviderByName(providerBean.getName())));
		//if(providerBean.getPassword())
		return new ModelAndView("addProvider", model);
	}
	
	private Provider prepareModel(ProviderBean providerBean){
		Provider provider = new Provider();
		provider.setName(providerBean.getName());
		provider.setPassword(providerBean.getPassword());
		provider.setEmail(providerBean.getEmail());
		provider.setId(providerBean.getId());
		providerBean.setId(null);
		return provider;
	}
	
	private List<ProviderBean> prepareListofBean(List<Provider> providers){
		List<ProviderBean> beans = null;
		if(providers != null && !providers.isEmpty()){
			beans = new ArrayList<ProviderBean>();
			ProviderBean bean = null;
			for(Provider provider : providers){
				bean = new ProviderBean();
				bean.setEmail(provider.getEmail());
				bean.setPassword(provider.getPassword());
				bean.setName(provider.getName());
			
				bean.setId(provider.getId());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private ProviderBean prepareProviderBean(Provider provider){
		ProviderBean bean = new ProviderBean();
		bean.setEmail(provider.getEmail());
		bean.setPassword(provider.getPassword());
		bean.setName(provider.getName());
	
		bean.setId(provider.getId());
		return bean;
	}
}
