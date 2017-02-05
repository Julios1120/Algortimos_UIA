 select clientes.nombre,vuelos.h_salida 
 from clientes,vuelos,reservacion,hoteles
 where clientes.id_cliente=reservacion.id_cliente 
 and hoteles.id_hotel=reservacion.id_vuelo_salida 
 and vuelos.id_vuelo=reservacion.id_vuelo_salida 
 and clientes.nombre="Lola";
 
 select clientes.nombre hoteles.nombre from clientes,reservacion,hoteles where clientes.id_cliente=reservacion.id_cliente and hoteles.id_hotel=reservacion.id_hotel and precio_total <= 15000;
 
 select clientes.nombre from clientes where clientes.forma_pago="Targeta de credito";
 select hoteles.nombre from hoteles where hoteles.num_cuartos=300;
 select vuelos.h_salida,vuelos.he_llegada from vuelos where vuelos.a_salida="CDMX";
 select paquetes.tipo_paquete from paquetes where paquetes.precio_persona <8000;
 select clientes.nombre from clientes,reservacion where clientes.id_cliente = reservacion.id_cliente and reservacion.info_acompañantes="";
 select clientes.nombre, paquetes.tipo_paquete, vuelos.id_vuelo,vuelos.a_destino from clientes,reservacion,vuelos,paquetes where clientes.id_cliente=reservacion.id_cliente and paquetes.id_paquete=reservacion.id_paquete and reservacion.precio_total < 15000 and vuelos.id_vuelo=reservacion.id_vuelo_salida;
 select clientes.nombre, vuelos.a_destino from clientes,reservacion,vuelos where clientes.forma_pago="paypal" and clientes.id_cliente=reservacion.id_cliente and vuelos.id_vuelo=reservacion.id_vuelo_salida;
 select clientes.nombre,reservacion.info_acompañantes from clientes,reservacion,vuelos where vuelos.id_vuelo=reservacion.id_vuelo_salida and vuelos.a_destino="CANCUN";