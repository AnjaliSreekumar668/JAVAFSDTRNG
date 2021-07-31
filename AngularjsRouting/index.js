var app=angular.module('myApp',["ngRoute"])

app.config(function($routeProvider){
	$routeProvider.when("/one",{
		templateUrl: "one.html",
		controller : "myCntrl1"
	}).when("/two",{
		templateUrl:"two.html",
		controller : "myCntrl2"
	})
})

app.controller('myCntrl1',function($scope){
	$scope.msg="I am from the first controller"
})

app.controller('myCntrl2',function($scope){
	$scope.msg="I am from the  second controller"
})/**
 * 
 */