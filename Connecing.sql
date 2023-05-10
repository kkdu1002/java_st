create table professor(
	profno	number(5,0) not null primary key,
	name	varchar2(10) not null,
	ename	varchar2(20) not null,
	position varchar2(20) not null,
	sal		number(4,0) not null,
	hiredate	date	not null,
	age		number(3,0) not null,
	deptno	number(3,0) not null,
);
Alter table professor 
add
foreign key(deptno)
references department(deptno);

insert into professor values(9901,'È«±æµ¿','capool','±³¼ö',500,TO_DATE('24-06-1982')
,'DD-MM-YYYY'),20,101);