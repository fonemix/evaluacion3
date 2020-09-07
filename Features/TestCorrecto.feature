Feature: Realizacion de casos ingresando nombre de usuario y contraseña
Scenario: verificacion de ingreso de sesion Exitoso
Given Abrir Login
When ingresar username "cvillalm" y userpass "cvillalm"
Then inicia sesion