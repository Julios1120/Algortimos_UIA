 
 
select persona.nombre from persona;
select persona.nombre, persona.apellido, persona.edad from persona;
select persona.nombre, persona.apellido, persona.edad, trabajador.salario, trabajador.puesto from persona, trabajador where persona.idpersona = trabajador.idtrabajador and trabajador.puesto = "obrero";
select persona.nombre, trabajador.puesto from persona, trabajador where persona.idpersona = trabajador.idtrabajador and trabajador.puesto = "ingeniera";
select proyecto.nombre, persona.nombre, trabajador.puesto from proyecto, persona, trabajador where proyecto.idproyecto = persona.idpersona and persona.idpersona = trabajador.idtrabajador and trabajador.puesto = "obrero";
select persona.NOMBRE, maquinaria.NOMBRE from maquinaria, persona, trabajador where persona.IDPERSONA = trabajador.IDPERSONA and maquinaria.IDTRABAJADOR = trabajador.IDTRABAJADOR and persona.NOMBRE = "SERGIO";
select departamento.nombre, persona.nombre from departamento, persona, trabajador where departamento.iddepartamento = trabajador.idubicacion and trabajador.idtrabajador = persona.idpersona and persona.nombre = "ALFONSO";
select maquinaria.nombre, maquinaria.sifunciona from maquinaria where maquinaria.sifunciona ="1";
select proyecto.nombre, proyecto.presupuesto from proyecto where presupuesto < 1000000;
select proyecto.descripcion, proyecto.presupuesto from proyecto where presupuesto > 10000000;
select trabajador.salario, persona.nombre from trabajador, persona where trabajador.idtrabajador = persona.idpersona and persona.nombre = "Luisa";
select trabajador.salario, trabajador.puesto from trabajador where trabajador.puesto = "obrero";
select trabajador.salario, departamento.nombre, persona.nombre from trabajador, departamento, persona where persona.idpersona = trabajador.idtrabajador and trabajador.iddepartamento = departamento.iddepartamento and departamento.nombre = "Construccion"; 
select persona.nombre, trabajador.puesto, sucursal.direccion from persona, trabajador, sucursal where persona.idpersona = trabajador.idtrabajador and trabajador.idubicacion = sucursal.direccion and trabajador.puesto = "obrero";
select persona.NOMBRE, sucursal.NOMBRE, trabajador.PUESTO from persona, sucursal, trabajador where persona.IDPERSONA = trabajador.IDPERSONA and sucursal.IDSUCURSAL = trabajador.IDUBICACION and trabajador.PUESTO = "OBRERO";
select persona.nombre, trabajador.puesto, proyecto.nombre from persona, trabajador, proyecto where persona.idpersona = trabajador.idtrabajador and trabajador.idproyecto = proyecto.idproyecto;