package com.xebia.spa.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;

import com.sun.research.ws.wadl.Response;
import com.xebia.spa.error.SpaException;
import com.xebia.spa.model.User;
import com.xebia.spa.service.UserService;
import com.xebia.spa.to.ResponseTo;


@Path("/user")
public class UserServiceController {
	 		
	
	    UserService userservice = new UserService();
	    User user = new User();
	    ResponseTo response = new ResponseTo();
	    
	    
		@POST
		@Path("/register/{fname}/{lname}/{uname}/{password}")
		@Produces("application/json")
		public Object register(@PathParam("fname") String fname, @PathParam("lname") String lname, 
				@PathParam("uname") String uname, @PathParam("password") String password) throws JSONException {
	         
			try {
				
				userservice.registerUser(fname, lname, uname, password);
			} catch (Exception e) {
				
			}
		    
			
			JSONArray jsonarry = new JSONArray();
			jsonarry.put(0, uname);
			jsonarry.put(1, password);
			
			response.setMessage(jsonarry.toString());
	         return response.toJSON();	
	}
		
		
		@POST
		@Path("/login/{uname}/{password}")
		@Produces("application/json")
		public Object login(@PathParam("uname") String uname, @PathParam("password")
		String password) throws SpaException{
			
			try {
			
				userservice.userLogin(uname, password);
				
			} catch (SpaException e) {
				response.setMessage("username or password is incorrect");
				return response.toJSON();
			}
			response.setMessage("login success");
			return response.toJSON();
		}
		
		
		@POST
		@Path("/forget/{uname}")
		@Produces("application/json")
        public Object forgetPass(@PathParam("uname") String uname){
			
			try {
				String password = userservice.forgetPassword(uname);
				response.setMessage(password);
				response.setStatus("200");
			} catch (SpaException e) {
				response.setMessage("username is not in database");
				return response.toJSON();
			}
			return response.toJSON();
		}
}