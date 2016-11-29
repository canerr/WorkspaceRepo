/// <reference path="angular.min.js" />

var myApp = angular
				.module("myModule", [])
				.controller("myController", function($scope) {
					var employees = [
						{ firstName: "Ben", lastName: "Hastings", gender: "Male", salary: 55000 },
						{ firstName: "Reggie", lastName: "Miller", gender: "Male", salary: 35000 },
						{ firstName: "Shaquille", lastName: "O'Neal", gender: "Male", salary: 60000 },
						{ firstName: "Dwight", lastName: "Howard", gender: "Male", salary: 50000 },
						{ firstName: "Stephen", lastName: "Curry", gender: "Male", salary: 45000 },
					];
					
					$scope.employees = employees;
					
					$scope.genders = [ "Male", "Female" ];
					
					$scope.salaryDelta = 1000;
					
					$scope.increaseSalary = function(employee) {
						employee.salary  += parseInt($scope.salaryDelta, 10);
					};
					
					$scope.decreaseSalary = function(employee) {
						employee.salary  -= parseInt($scope.salaryDelta, 10);
					};
					
					$scope.getTotalSalary = function(){
						var total = 0;
						for(var i = 0; i < $scope.employees.length; i++){
							var product = parseInt($scope.employees[i].salary, 10);
							total += product;
						}
						return total;
					}
					
					$scope.getAvgSalary = function(){
						return parseInt($scope.getTotalSalary()/$scope.employees.length, 10);
					}
					
					$scope.save = function() {
						$scope.employees.push(
							{ firstName: $scope.txtFirstname, 
								lastName: $scope.txtLastname,
								gender: $scope.txtGender, 
								salary: parseInt($scope.txtSalary, 10)
							}
						);
						$scope.txtFirstname = "";
						$scope.txtLastname = "";
						$scope.txtGender = "";
						$scope.txtSalary = "";
						
					}
					
					$scope.removeRow = function(idx) {
						$scope.employees.splice(idx, 1);
					}
					
					
				});
