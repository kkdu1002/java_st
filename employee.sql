  CREATE TABLE "HR"."EMPLOYEE" 
   (	"NO" NUMBER, 
	"NAME" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"JOBGRADE" VARCHAR2(30 BYTE), 
	"DEPARTMENT" NUMBER(2,0), 
	"EMAIL" VARCHAR2(20 BYTE), 
	 PRIMARY KEY ("NO")
	 );
	 
	create sequence seq_no start with 1 increment by 1 nocycle;

	insert into EMPLOYEE(NO, NAME, JOBGRADE, DEPARTMENT, EMAIL)
	values(SEQ_NO.NEXTVAL,'고길동','차장',20,'A@naver.com');