'use strict';


// Declare app level module which depends on filters, and services
var app=angular.module('admininvalid', [
  'ngRoute',
  'angularUtils.directives.dirPagination',
  'admininvalid.controllers'
]);
app.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {templateUrl: 'partials/menu.html'});
	$routeProvider.when('/Evento', {templateUrl: 'partials/Evento.html', controller: 'EventoCtrl'});$routeProvider.when('/TipoPeticion', {templateUrl: 'partials/TipoPeticion.html', controller: 'TipoPeticionCtrl'});$routeProvider.when('/DestinoPeticion', {templateUrl: 'partials/DestinoPeticion.html', controller: 'DestinoPeticionCtrl'});$routeProvider.when('/Peticion', {templateUrl: 'partials/Peticion.html', controller: 'PeticionCtrl'});$routeProvider.when('/Concejal', {templateUrl: 'partials/Concejal.html', controller: 'ConcejalCtrl'});
  	$routeProvider.otherwise({redirectTo: '/'}); 
}]);

var module=angular.module("admininvalid.controllers",[]);
