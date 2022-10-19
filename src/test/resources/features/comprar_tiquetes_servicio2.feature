#language: es
# Autor: David Cruz

Característica: compra servicio ruta Cusco-Machu Picchu
  Yo como usuario de la pagina PERURAIL – BOOKING DE VIAJES
  Quiero hacer la compra de tiquetes de viaje
  Para verificar su funcionamiento

  Antecedentes: el usuario Ingresa a la pagina web
    Dado el usuario intenta ingresar a la pagina booking de viajes

  Escenario:  El usuario realiza la compra de tiquetes para ruta 3
    Cuando    el usuario intenta realizar la compra de tiquetes para la ruta Cusco-Machu Picchu
    Entonces  el usuario deberia ver el mensaje que la compra fue exitosa