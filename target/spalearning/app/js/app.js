 var myApp = angular.module('myApp', ['ngRoute']);
 
     myApp.run(function($http, $rootScope, $location){
    	 
    	 $rootScope.loadPage = function(template){
    		 
    		 $location.path(template);
    	 };
    	 
    	 $('#indicator').hide();
    	 
     });