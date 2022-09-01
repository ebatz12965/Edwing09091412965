/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

function capturar(){
    var cod=document.getElementById("codigo").value;
    var nom=document.getElementById("nombre").value;
    var ape=document.getElementById("apellido").value;
    var mail=document.getElementById("correo").value;
    var dir=document.getElementById("direccion").value;
    var tel=document.getElementById("telefono").value;
        if (cod===""){
            alert("Ingresar el Código");
           document.getElementById("codigo").focus();
        }else {
            if (nom===""){
            alert("Ingresar un Nombre");
           document.getElementById("nombre").focus();
        } else{
            if (ape===""){
            alert("Ingresar un Apellido");
           document.getElementById("apellido").focus();
        } else {
            if (mail===""){
            alert("Ingresar un Correo Electrónico");
           document.getElementById("correo").focus();
        } else {
            if (dir===""){
            alert("Ingresar una dirección domiciliar");
           document.getElementById("direccion").focus();
        } else {
            if (tel===""){
            alert("Ingresar un Número de Contacto");
           document.getElementById("telefono").focus();
        }}}}}}
            
        console.log(cod, nom, ape, dir, tel);
}
