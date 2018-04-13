/*
 * HelloWorld! test Class 
 *  IMPORTANTE *********************************************
 *  
 *  REMOVE THESE CLASS AND THE DEFAULT USER CREATED FOR TEST!
*/
package ram.jenkin.github.MavenSampleGit.controller;


import javax.inject.Inject;

import ram.jenkin.github.MavenSampleGit.business.LoginService;



public class HelloAction extends BaseAction{
	@Inject
	LoginService sv;
	
	public String execute(){
		sv.createFirst();
		return "success";
	}

}
