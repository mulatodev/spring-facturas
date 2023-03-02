use arcadia;

insert into cliente values('1', 'mulato', 'mulato@nomail.com');

insert into producto values('1', 'ABC', 10, 10);
insert into producto values('2', 'BCA', 12, 10);
insert into producto values('3', 'CAB', 18, 10);
insert into producto values('4', 'CBA', 20, 10);

insert into factura values('1', '1', now());

insert into detalle values('1', '1', '1', 2, 20);
insert into detalle values('2', '1', '2', 3, 36);
insert into detalle values('3', '1', '3', 6, 108);
insert into detalle values('4', '1', '4', 4, 80);

select d.id, p.nombre, d.cantidad, d.precio  
from factura f join detalle d
on f.id=d.id_factura join producto p
on d.id_producto = p.id
where f.id_cliente = '1'; 