/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

function capturarDatos(){
    let cod=document.getElementById("codigo").value;
    let nom=document.getElementById("nombre").value;
    let ape=document.getElementById("apellido").value;
    let mail=document.getElementById("correo").value;
    let dir=document.getElementById("direccion").value;
    let tel=document.getElementById("telefono").value;
        if (cod===""){
            alert("Ingresar el Código");
           document.getElementById("codigo").focus();
        } else {
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
        } else {
            console.log(cod, nom, ape, dir, tel);
            document.getElementById("codigo").value="";
            document.getElementById("nombre").value="";
            document.getElementById("apellido").value="";
            document.getElementById("correo").value="";
            document.getElementById("direccion").value="";
            document.getElementById("telefono").value="";
            document.getElementById("codigo").focus();
        }}}}}}
        
        
        
        
        
}
