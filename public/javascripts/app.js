var myApp = angular.module('myApp', ['ngRoute'])
    .config(['$routeProvider', function($routeProvider){
        $routeProvider.when('/', {
            templateUrl: 'assets/partials/home.html',
            controller: 'HomeController'
        })
    }]);