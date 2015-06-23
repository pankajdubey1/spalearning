var scotchApp = angular.module('scotchApp', ['ngRoute']);    
    scotchApp.run(function($http, $rootScope, $location) {
    	$rootScope.loadPage = function(template) {
    		$location.path(template);
    	}  	
    });