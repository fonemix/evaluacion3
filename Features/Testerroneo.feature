Feature: Realizacion de casos ingresando nombre de usuario y contraseña
Scenario: verificacion de ingreso de sesion Exitoso
Given Abrir Login wrong
When ingresar username "incorrecto" y userpass "incorrecto" wrong
Then inicia sesion wrong