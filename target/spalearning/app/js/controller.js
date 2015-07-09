myApp.controller("homeCtrl", function($scope){
	$('#indicator').hide();
	$scope.loadPage('/signup');

});

myApp.controller('signupCtrl', function($scope, $rootScope, $http){
		
	$scope.signup = function() {

		$http.post('http://localhost:8080/spalearning/rest/user/register/'
			               +$scope.fname+ '/'+ $scope.lname + '/' +$scope.uname
			               + '/'+ $scope.pass).
		  success(function(data) {
		      
			  userinfo = JSON.parse(data.message);
			  $rootScope.username = userinfo[0];
			  $rootScope.password = userinfo[1];
			  $rootScope.message = 'Signup Successful'
			  $scope.loadPage('signup_result');
			  
		  }).
		  error(function(data) {
		    
			  alert("Signup Failed" +data);	  
		  });
	};	
	
	
	
});

myApp.controller("loginCtrl", function($scope, $rootScope, $http){
  
	$scope.login = function(){
		$('#indicator').show();
		
		$http.post('http://localhost:8080/spalearning/rest/user/login/' + $scope.uname +'/'
				+ $scope.pass).
		 success(function(data){
			 $('#indicator').hide();
			 
			 console.log(data);
			 if(data.message == 'login success'){
			 $rootScope.message = 'login successful';
			 $scope.loadPage('/login_result');
			 }else{
				 
				 $('#indicator').hide();
				 alert(data.message);
			 }
		 }).
		 error(function(data){
			 alert('login failed '+ data);
		 });
	};
	
	
	$scope.forgetPass = function() {
		
		$http.post('http://localhost:8080/spalearning/rest/user/forget/'+
				$scope.uname).
				success(function(data){
					if(data.status = '200'){
						alert("password is : "+ data.message);
					}else{
						
						alert(data.message);
					}
				}).
				
				error(function(data){
					
				});
	};

});