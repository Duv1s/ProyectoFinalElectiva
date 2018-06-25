'use strict';

module.controller('ConcejalCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Concejal', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarPeticion=function(){
            $http.get('./webresources/Peticion', {})
                .success(function (data, status, headers, config) {
                    $scope.listaPeticion = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de peticion, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarPeticion();
            $scope.listarEvento=function(){
            $http.get('./webresources/Evento', {})
                .success(function (data, status, headers, config) {
                    $scope.listaEvento = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de evento, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarEvento();
        

    $scope.listar();
    //guardar
    $scope.nuevo = function () {
        $scope.panelEditar = true;
        $scope.datosFormulario = {};
    };
    
    $scope.guardar = function () {
        $scope.errores = {};
        var error = false;
        
        if (error)
            return;
        $http.post('./webresources/Concejal', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
                $scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al guardar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
    };
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.datosFormulario = data;
    };
    //eliminar
    $scope.eliminar = function (data){
        if (confirm('\xbfDesea elminar este registro?')) {    
            $http.delete('./webresources/Concejal/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Concejal, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
