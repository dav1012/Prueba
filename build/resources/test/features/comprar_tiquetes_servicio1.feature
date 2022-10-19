#language: es
# Autor: David Cruz

Característica: compra servicio ruta Puno-Cusco y Arequipa-Cusco
  Yo como usuario de la pagina PERURAIL – BOOKING DE VIAJES
  Quiero hacer la compra de tiquetes de viaje
  Para verificar su funcionamiento

  Antecedentes: el usuario Ingresa a la pagina web
    Dado el usuario intenta ingresar a la pagina booking de viajes


  Escenario:  El usuario realiza la compra de tiquetes para ruta 1
    Cuando    el usuario intenta realizar la compra de tiquetes para la ruta Puno-Cusco
    Entonces  el usuario deberia ver que la compra fue exitosa

  Escenario:  El usuario realiza la compra de tiquetes para ruta 2
    Cuando    el usuario intenta realizar la compra de tiquetes para la ruta Arequipa-Cusco
    Entonces  el usuario deberia ver que la compra fue exitosa