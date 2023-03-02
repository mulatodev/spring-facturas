use arcadia;

/* Limpieza de objetos*/
drop table detalle;
drop table factura;
drop table producto;
drop table cliente;

/* Creación de tablas del modelo */
create table cliente(
	id int not null,
    nombre varchar(50) not null,
    email varchar(100),
    primary key `cliente_pk` (id)
);

create table factura(
	id int not null,
    id_cliente int not null,
    fecha datetime not null,
    primary key `factura_pk` (id, id_cliente),
    key `idx_fk_id_cliente` (id_cliente),
    constraint `factura_detalle` foreign key (id_cliente) references cliente (id) on delete restrict on update cascade
);

create table producto(
	id int not null,
    nombre varchar(50) not null,
    precio int not null,
	stock int,
    primary key `producto_pk` (id)
);

create table detalle(
	id int not null,
    id_factura int not null,
    id_producto int not null,
    cantidad int,
    precio int,
    primary key `detalle_pk` (id, id_factura),
    key `idx_fk_id_factura` (id_factura),
    key `idx_fk_id_producto` (id_producto),
    constraint `detalle_factura` foreign key (id_factura) references factura (id) on delete restrict on update cascade,
    constraint `detalle_producto` foreign key (id_producto) references producto (id) on delete restrict on update cascade
);