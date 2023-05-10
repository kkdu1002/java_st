CREATE TABLE stock
(
	code CHAR(5 BYTE) NOT NULL ENABLE PRIMARY KEY,
	quantity number(3) NOT NULL ENABLE, 
);

insert into stock values('10001',100);
insert into stock values('10002',200);
insert into stock values('10003',50);
insert into stock values('10004',100);
insert into stock values('10005',150);