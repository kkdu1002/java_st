CREATE TABLE "HR"."DEPARTMENT" 
   (	"DEPTNO" NUMBER(3,0) NOT NULL ENABLE, 
	"DNAME" VARCHAR2(50 BYTE) NOT NULL ENABLE, 
	"COLLEGE" NUMBER(3,0) NOT NULL ENABLE, 
	"LOC" VARCHAR2(10 BYTE) NOT NULL ENABLE, 
	 CONSTRAINT "DEPPARTMENT_PK" PRIMARY KEY ("DEPTNO")
	 
	 insert into department values(203,'����������а�',200,'7ȣ��');
	 insert into department values(101,'��ǻ���а�',200,'1ȣ��');
	 
	 update department set dname = '���ڰ���а�' where deptno = '101';
	 
	 delete from department where dname = '���ڰ���а�';
	 commit
	 select * from DEPARTMENT order by deptno desc;
	 desc department
	 
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
-- ����
insert into professor values(9901,'ȫ�浿','capool','����',500,TO_DATE('24-06-1982'
,'DD-MM-YYYY'),20,101);
-- ������ �θ� ���� ������ �ڽĻ��� / ������ �ڽ� ������ �θ����
--�˻�
select * from professor;
select * from department;
--���̺� ����
drop table professor;
drop table department;
--���ڵ� ����
delete from where department deptno = 101;

select * from department order by deptno desc;