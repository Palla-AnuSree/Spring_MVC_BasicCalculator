package com.techpalle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController
{
	@RequestMapping(value="calc",params="btnAdd")
	public ModelAndView getAdd(String tbfn,String tbsn)
	{
		ModelAndView mv=new ModelAndView();
		//convert the String to Integer
		int fn=Integer.parseInt(tbfn);
		int sn=Integer.parseInt(tbsn);
  
		//Add the above two numbers and store it in a varible
		int res=fn+sn;

		//put the res in modelandview
		mv.addObject("result",res);
		
		//redirect the user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
	
	@RequestMapping(value="calc",params="btnSub")
	public ModelAndView getSub(String tbfn,String tbsn)
	{
		ModelAndView mv=new ModelAndView();
		//convert the String to Integer
		int fn=Integer.parseInt(tbfn);
		int sn=Integer.parseInt(tbsn);

		//Substarct the above two numbers and store it in a varible
		int res=fn-sn;

		//put the res in modelandview
		mv.addObject("result",res);
		
		//redirect the user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
	@RequestMapping(value="calc",params="btnMul")
	public ModelAndView getMul(String tbfn,String tbsn)
	{
		ModelAndView mv=new ModelAndView();
		//convert the String to Integer
		int fn=Integer.parseInt(tbfn);
		int sn=Integer.parseInt(tbsn);

		//Multiply the above two numbers and store it in a varible
		int res=fn*sn;

		//put the res in modelandview
		mv.addObject("result",res);
		
		//redirect the user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
	@RequestMapping(value="calc",params="btnDiv")
	public ModelAndView getDiv(String tbfn,String tbsn)
	{
		ModelAndView mv=new ModelAndView();
		//convert the String to Integer
		float fn=Integer.parseInt(tbfn);
		float sn=Integer.parseInt(tbsn);

		//Divide the above two numbers and store it in a varible
		double res=fn/sn;

		//put the res in modelandview
		mv.addObject("result",res);
		
		//redirect the user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
}
