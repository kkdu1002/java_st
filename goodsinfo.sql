  CREATE TABLE "HR"."GOODSINFO" 
   (	"CODE" CHAR(5 BYTE) NOT NULL ENABLE, 
	"NAME" VARCHAR2(30 BYTE) NOT NULL ENABLE, 
	"PRICE" NUMBER(8,0) NOT NULL ENABLE, 
	"MAKER" VARCHAR2(20 BYTE), 
	 PRIMARY KEY ("CODE")
  insert into goodsinfo values('10005','������ ������','400000','�Ｚ');
  
  update goodsinfo set name='Ź��ð�',price=10000,maker='LG'where code = '10006';
  
  delete from goodsinfo where code ='10005';
  delete from goodsinfo where name ='Ź��ð�' and maker = 'LG';
  delete from goodsinfo where maker = '���̸���' or price < '250000';
  
  select * from goodsinfo;