myApp.config(function($routeProvider){
	$routeProvider
	
	  .when('/signup', {
		 
		   templateUrl : 'app/template/signup.html',
		   controller  :  'signupCtrl'
	  })
	  
	  .when('/signup_result', {
		  
		  templateUrl : 'app/template/signup_result.html',
		   controller  :  'signupCtrl'
	  })
	
	  .when('/login',{
		  
		  templateUrl : 'app/template/login.html',
		   controller  :  'loginCtrl'
	  })
	  
	  .when('/login_result',{
		 
		  templateUrl : 'app/template/login_result.html',
		   controller  :  'loginCtrl'	  
	  })
	  
	  .when('/forget_pass',{
		
		templateUrl : 'app/template/forget_pass.html',
		  controller  :  'loginCtrl'
	});
});