Feature: Realizacion de casos ingresando nombre de usuario y contraseña en blancos
Scenario: verificacion de ingreso de sesion sin parametros
Given Abrir Login Blank
When ingresar username vacio y userpass vacio
Then inicia sesion Blank