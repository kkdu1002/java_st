CREATE TABLE "HR"."DEPARTMENT" 
   (	"DEPTNO" NUMBER(3,0) NOT NULL ENABLE, 
	"DNAME" VARCHAR2(50 BYTE) NOT NULL ENABLE, 
	"COLLEGE" NUMBER(3,0) NOT NULL ENABLE, 
	"LOC" VARCHAR2(10 BYTE) NOT NULL ENABLE, 
	 CONSTRAINT "DEPPARTMENT_PK" PRIMARY KEY ("DEPTNO")
	 
	 insert into department values(203,'제어계측공학과',200,'7호관');
	 insert into department values(101,'컴퓨터학과',200,'1호관');
	 
	 update department set dname = '전자계산학과' where deptno = '101';
	 
	 delete from department where dname = '전자계산학과';
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
-- 삽입
insert into professor values(9901,'홍길동','capool','교수',500,TO_DATE('24-06-1982'
,'DD-MM-YYYY'),20,101);
-- 삽입은 부모 먼저 삽입후 자식삽입 / 삭제는 자식 삭제후 부모삭제
--검색
select * from professor;
select * from department;
--테이블 삭제
drop table professor;
drop table department;
--레코드 삭제
delete from where department deptno = 101;

select * from department order by deptno desc;