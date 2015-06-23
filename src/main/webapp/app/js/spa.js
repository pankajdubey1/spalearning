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
    });
