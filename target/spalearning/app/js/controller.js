/*var scotchApp = angular.module('scotchApp', ['ngRoute']);    
    scotchApp.run(function($http, $rootScope, $location) {
    	$rootScope.loadPage = function(template) {
    		$location.path(template);
    	}  	
    });
    
    
    scotchApp.config(function($routeProvider) {
        $routeProvider
 
            .when('/', {
                templateUrl : 'app/template/home.html',
                controller  : 'mainController'
            })

            
            .when('/about', {
                templateUrl : 'app/template/about.html',
                controller  : 'aboutController'
            })

            
            .when('/contact', {
                templateUrl : 'pages/contact.html',
                controller  : 'contactController'
            });
    });*/
   
    scotchApp.controller('mainController', function($scope) {

        $scope.message = 'home page';
        //alert("switching to about page");
        //$scope.loadPage("/about");
    });

    scotchApp.controller('aboutController', function($scope) {
        $scope.message = 'about page.';
                
    });

    scotchApp.controller('contactController', function($scope) {
        $scope.message = 'contact page';
    });