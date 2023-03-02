use arcadia;

/* Limpieza de objetos*/
drop table detalle;
drop table producto;
drop table factura;
drop table cliente;

/* Creación de tablas del modelo */
create table cliente(
	id int not null,
    nombre varchar(50) not null,
    email varchar(100)
);

create table factura(
	id int not null,
    id_cliente int not null,
    fecha datetime not null
);

create table producto(
	id int not null,
    nombre varchar(50) not null,
    precio int not null,
	stock int
);

create table detalle(
	id int not null,
    id_factura int not null,
    id_producto int not null,
    cantidad int,
    precio int
);

/* Agregar constraint de clave primaria*/
alter table cliente add constraint cliente_pk primary key(id);
alter table factura add constraint factura_pk primary key(id, id_cliente);
alter table producto add constraint producto_pk primary key(id);
alter table detalle add constraint detalle_pk primary key(id, id_factura);

/* Agregar constraint de clave foránea*/
alter table factura add constraint factura_cliente foreign key(id_cliente) references cliente(id);
alter table detalle add constraint detalle_factura foreign key(id_factura) references factura(id);
alter table detalle add constraint detalle_producto foreign key(id_producto) references producto(id);
