--------------------------------------------------------
--  File created - Thursday-January-31-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ADMIN_EDU_YEAR
--------------------------------------------------------

  CREATE TABLE "HR"."ADMIN_EDU_YEAR" 
   (	"USER_ID" NUMBER, 
	"EDU_LEVEL" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table DEP_PREREQ
--------------------------------------------------------

  CREATE TABLE "HR"."DEP_PREREQ" 
   (	"DEP_ID" NUMBER, 
	"PREREQ_ID" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE( MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table DEPARTMENT
--------------------------------------------------------

  CREATE TABLE "HR"."DEPARTMENT" 
   (	"ID" NUMBER, 
	"NAME" VARCHAR2(50 BYTE), 
	"MIN_CAP" NUMBER, 
	"MAX_CAP" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table EDU_LEVEL
--------------------------------------------------------

  CREATE TABLE "HR"."EDU_LEVEL" 
   (	"ID" NUMBER, 
	"DEPARTMENT" VARCHAR2(50 BYTE), 
	"FACULTY" VARCHAR2(50 BYTE), 
	"YEAR" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table EDU_LEVEL_DEPARTMENT
--------------------------------------------------------

  CREATE TABLE "HR"."EDU_LEVEL_DEPARTMENT" 
   (	"EDU_LEVEL_ID" NUMBER, 
	"DEPARTMENT_ID" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table MESSAGES
--------------------------------------------------------

  CREATE TABLE "HR"."MESSAGES" 
   (	"FROM_USER_ID" NUMBER, 
	"REPORT" VARCHAR2(1000 BYTE), 
	"TO_USER_ID" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE( MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PREREQUISITE
--------------------------------------------------------

  CREATE TABLE "HR"."PREREQUISITE" 
   (	"SUBJECT" NUMBER, 
	"ID" NUMBER, 
	"MIN_MARK_SUBJECT" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ROLES
--------------------------------------------------------

  CREATE TABLE "HR"."ROLES" 
   (	"USER_ID" NUMBER, 
	"ROLE_ID" NUMBER DEFAULT 0, 
	"ROLES" NUMBER DEFAULT 0
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE( MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
 

   COMMENT ON COLUMN "HR"."ROLES"."ROLES" IS '0 IS STUDENT';
--------------------------------------------------------
--  DDL for Table STUDENT
--------------------------------------------------------

  CREATE TABLE "HR"."STUDENT" 
   (	"USER_ID" NUMBER, 
	"EDU_LEVEL" NUMBER, 
	"TOTAL_MARK" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table STUDENT_SUBJECT
--------------------------------------------------------

  CREATE TABLE "HR"."STUDENT_SUBJECT" 
   (	"STUDENT" NUMBER, 
	"SUBJECT" NUMBER, 
	"MARK" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table STUDENTS_REQUESTS
--------------------------------------------------------

  CREATE TABLE "HR"."STUDENTS_REQUESTS" 
   (	"DEP_ID" NUMBER, 
	"STUDENT_ID" NUMBER, 
	"ORDER" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE( MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table SUBJECT
--------------------------------------------------------

  CREATE TABLE "HR"."SUBJECT" 
   (	"ID" NUMBER, 
	"NAME" VARCHAR2(30 BYTE), 
	"EDU_LEVEL_ID1" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TIMELINE
--------------------------------------------------------

  CREATE TABLE "HR"."TIMELINE" 
   (	"EDU_LEVEL_ID" NUMBER, 
	"START_DATE" DATE, 
	"END_DATE" DATE
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE( MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table USER_WEBSITE
--------------------------------------------------------

  CREATE TABLE "HR"."USER_WEBSITE" 
   (	"ROLE" NUMBER, 
	"WEBSITE" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE( MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table USERS
--------------------------------------------------------

  CREATE TABLE "HR"."USERS" 
   (	"ID" NUMBER, 
	"USER_NAME" VARCHAR2(20 BYTE), 
	"PASSWORD" VARCHAR2(20 BYTE), 
	"EMAIL" VARCHAR2(30 BYTE), 
	"ROLE" NUMBER DEFAULT 0, 
	"FIRST_NAME" VARCHAR2(15 BYTE), 
	"MIDDLE_NAME" VARCHAR2(15 BYTE), 
	"LAST_NAME" VARCHAR2(15 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table YEARS
--------------------------------------------------------

  CREATE TABLE "HR"."YEARS" 
   (	"ID" NUMBER, 
	"NAME" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into HR.ADMIN_EDU_YEAR
SET DEFINE OFF;
Insert into HR.ADMIN_EDU_YEAR (USER_ID,EDU_LEVEL) values (3,1);
Insert into HR.ADMIN_EDU_YEAR (USER_ID,EDU_LEVEL) values (3,2);
REM INSERTING into HR.DEP_PREREQ
SET DEFINE OFF;
REM INSERTING into HR.DEPARTMENT
SET DEFINE OFF;
Insert into HR.DEPARTMENT (ID,NAME,MIN_CAP,MAX_CAP) values (1,'CSE',5,10);
Insert into HR.DEPARTMENT (ID,NAME,MIN_CAP,MAX_CAP) values (2,'CIVIL',10,15);
REM INSERTING into HR.EDU_LEVEL
SET DEFINE OFF;
Insert into HR.EDU_LEVEL (ID,DEPARTMENT,FACULTY,YEAR) values (1,'CSE','ENGINEERING',1);
Insert into HR.EDU_LEVEL (ID,DEPARTMENT,FACULTY,YEAR) values (2,'CIVIL','ENGINEERING',1);
Insert into HR.EDU_LEVEL (ID,DEPARTMENT,FACULTY,YEAR) values (3,'CIVIL','ENGINEERING',2);
Insert into HR.EDU_LEVEL (ID,DEPARTMENT,FACULTY,YEAR) values (4,'CSE','ENGINEERING',1);
REM INSERTING into HR.EDU_LEVEL_DEPARTMENT
SET DEFINE OFF;
Insert into HR.EDU_LEVEL_DEPARTMENT (EDU_LEVEL_ID,DEPARTMENT_ID) values (1,1);
Insert into HR.EDU_LEVEL_DEPARTMENT (EDU_LEVEL_ID,DEPARTMENT_ID) values (1,2);
Insert into HR.EDU_LEVEL_DEPARTMENT (EDU_LEVEL_ID,DEPARTMENT_ID) values (2,2);
REM INSERTING into HR.MESSAGES
SET DEFINE OFF;
REM INSERTING into HR.PREREQUISITE
SET DEFINE OFF;
REM INSERTING into HR.ROLES
SET DEFINE OFF;
REM INSERTING into HR.STUDENT
SET DEFINE OFF;
Insert into HR.STUDENT (USER_ID,EDU_LEVEL,TOTAL_MARK) values (1,1,1500);
Insert into HR.STUDENT (USER_ID,EDU_LEVEL,TOTAL_MARK) values (2,2,300);
REM INSERTING into HR.STUDENT_SUBJECT
SET DEFINE OFF;
Insert into HR.STUDENT_SUBJECT (STUDENT,SUBJECT,MARK) values (1,1,30);
Insert into HR.STUDENT_SUBJECT (STUDENT,SUBJECT,MARK) values (1,2,49);
Insert into HR.STUDENT_SUBJECT (STUDENT,SUBJECT,MARK) values (1,1,11);
Insert into HR.STUDENT_SUBJECT (STUDENT,SUBJECT,MARK) values (2,1,25);
Insert into HR.STUDENT_SUBJECT (STUDENT,SUBJECT,MARK) values (2,2,30);
REM INSERTING into HR.STUDENTS_REQUESTS
SET DEFINE OFF;
REM INSERTING into HR.SUBJECT
SET DEFINE OFF;
Insert into HR.SUBJECT (ID,NAME,EDU_LEVEL_ID1) values (1,'programming',1);
Insert into HR.SUBJECT (ID,NAME,EDU_LEVEL_ID1) values (2,'math',2);
REM INSERTING into HR.TIMELINE
SET DEFINE OFF;
REM INSERTING into HR.USER_WEBSITE
SET DEFINE OFF;
REM INSERTING into HR.USERS
SET DEFINE OFF;
Insert into HR.USERS (ID,USER_NAME,PASSWORD,EMAIL,ROLE,FIRST_NAME,MIDDLE_NAME,LAST_NAME) values (1,'test1','test1','test1',0,'test1','test1mn','test1ln');
Insert into HR.USERS (ID,USER_NAME,PASSWORD,EMAIL,ROLE,FIRST_NAME,MIDDLE_NAME,LAST_NAME) values (2,'test2','test2','test2',0,'test2','test2mn','testln');
Insert into HR.USERS (ID,USER_NAME,PASSWORD,EMAIL,ROLE,FIRST_NAME,MIDDLE_NAME,LAST_NAME) values (3,'test3','test3','test3',1,'test3','test3mn','test3ln');
REM INSERTING into HR.YEARS
SET DEFINE OFF;
Insert into HR.YEARS (ID,NAME) values (1,'first year');
Insert into HR.YEARS (ID,NAME) values (2,'second year');
Insert into HR.YEARS (ID,NAME) values (3,'third year');
Insert into HR.YEARS (ID,NAME) values (4,'forth year');
--------------------------------------------------------
--  DDL for Index DEPARTMENT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."DEPARTMENT_PK" ON "HR"."DEPARTMENT" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index EDU_LEVEL_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."EDU_LEVEL_PK" ON "HR"."EDU_LEVEL" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PREREQUISITE_PK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."PREREQUISITE_PK1" ON "HR"."PREREQUISITE" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index ROLES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."ROLES_PK" ON "HR"."ROLES" ("ROLE_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS NOCOMPRESS LOGGING
  STORAGE( MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index STUDENT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."STUDENT_PK" ON "HR"."STUDENT" ("USER_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SUBJECT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."SUBJECT_PK" ON "HR"."SUBJECT" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index TABLE1_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."TABLE1_PK" ON "HR"."USERS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index TABLE1_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."TABLE1_UK1" ON "HR"."USERS" ("USER_NAME", "EMAIL") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index YEARS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."YEARS_PK" ON "HR"."YEARS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Trigger DEPARTMENT_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "HR"."DEPARTMENT_TRG" 
BEFORE INSERT ON DEPARTMENT 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.ID IS NULL THEN
      SELECT DEPARTMENT_SEQ.NEXTVAL INTO :NEW.ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "HR"."DEPARTMENT_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger EDU_LEVEL_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "HR"."EDU_LEVEL_TRG" 
BEFORE INSERT ON EDU_LEVEL 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.ID IS NULL THEN
      SELECT EDU_LEVEL_SEQ.NEXTVAL INTO :NEW.ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "HR"."EDU_LEVEL_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger PREREQUISITE_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "HR"."PREREQUISITE_TRG" 
BEFORE INSERT ON PREREQUISITE 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.SUBJECT IS NULL THEN
      SELECT PREREQUISITE_SEQ.NEXTVAL INTO :NEW.SUBJECT FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "HR"."PREREQUISITE_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger PREREQUISITE_TRG1
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "HR"."PREREQUISITE_TRG1" 
BEFORE INSERT ON PREREQUISITE 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.ID IS NULL THEN
      SELECT PREREQUISITE_SEQ1.NEXTVAL INTO :NEW.ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "HR"."PREREQUISITE_TRG1" ENABLE;
--------------------------------------------------------
--  DDL for Trigger ROLES_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "HR"."ROLES_TRG" 
BEFORE INSERT ON ROLES 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.ROLE_ID IS NULL THEN
      SELECT ROLES_SEQ.NEXTVAL INTO :NEW.ROLE_ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "HR"."ROLES_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SUBJECT_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "HR"."SUBJECT_TRG" 
BEFORE INSERT ON SUBJECT 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.ID IS NULL THEN
      SELECT SUBJECT_SEQ.NEXTVAL INTO :NEW.ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "HR"."SUBJECT_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger USERS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "HR"."USERS_TRG" 
BEFORE INSERT ON USERS 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.ID IS NULL THEN
      SELECT USERS_SEQ.NEXTVAL INTO :NEW.ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "HR"."USERS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger YEARS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "HR"."YEARS_TRG" 
BEFORE INSERT ON YEARS 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.ID IS NULL THEN
      SELECT YEARS_SEQ.NEXTVAL INTO :NEW.ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "HR"."YEARS_TRG" ENABLE;
--------------------------------------------------------
--  Constraints for Table ADMIN_EDU_YEAR
--------------------------------------------------------

  ALTER TABLE "HR"."ADMIN_EDU_YEAR" MODIFY ("USER_ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."ADMIN_EDU_YEAR" MODIFY ("EDU_LEVEL" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table DEP_PREREQ
--------------------------------------------------------

  ALTER TABLE "HR"."DEP_PREREQ" MODIFY ("DEP_ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."DEP_PREREQ" MODIFY ("PREREQ_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table DEPARTMENT
--------------------------------------------------------

  ALTER TABLE "HR"."DEPARTMENT" ADD CONSTRAINT "DEPARTMENT_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "HR"."DEPARTMENT" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."DEPARTMENT" MODIFY ("NAME" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."DEPARTMENT" MODIFY ("MIN_CAP" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."DEPARTMENT" MODIFY ("MAX_CAP" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table EDU_LEVEL
--------------------------------------------------------

  ALTER TABLE "HR"."EDU_LEVEL" ADD CONSTRAINT "EDU_LEVEL_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "HR"."EDU_LEVEL" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."EDU_LEVEL" MODIFY ("DEPARTMENT" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."EDU_LEVEL" MODIFY ("FACULTY" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."EDU_LEVEL" MODIFY ("YEAR" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table EDU_LEVEL_DEPARTMENT
--------------------------------------------------------

  ALTER TABLE "HR"."EDU_LEVEL_DEPARTMENT" MODIFY ("EDU_LEVEL_ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."EDU_LEVEL_DEPARTMENT" MODIFY ("DEPARTMENT_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MESSAGES
--------------------------------------------------------

  ALTER TABLE "HR"."MESSAGES" MODIFY ("FROM_USER_ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."MESSAGES" MODIFY ("REPORT" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."MESSAGES" MODIFY ("TO_USER_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PREREQUISITE
--------------------------------------------------------

  ALTER TABLE "HR"."PREREQUISITE" ADD CONSTRAINT "PREREQUISITE_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "HR"."PREREQUISITE" MODIFY ("SUBJECT" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."PREREQUISITE" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."PREREQUISITE" MODIFY ("MIN_MARK_SUBJECT" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ROLES
--------------------------------------------------------

  ALTER TABLE "HR"."ROLES" ADD CONSTRAINT "ROLES_PK" PRIMARY KEY ("ROLE_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS NOCOMPRESS LOGGING
  STORAGE( MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "HR"."ROLES" MODIFY ("USER_ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."ROLES" MODIFY ("ROLE_ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."ROLES" MODIFY ("ROLES" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table STUDENT
--------------------------------------------------------

  ALTER TABLE "HR"."STUDENT" ADD CONSTRAINT "STUDENT_PK" PRIMARY KEY ("USER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "HR"."STUDENT" MODIFY ("USER_ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."STUDENT" MODIFY ("EDU_LEVEL" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table STUDENT_SUBJECT
--------------------------------------------------------

  ALTER TABLE "HR"."STUDENT_SUBJECT" MODIFY ("STUDENT" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."STUDENT_SUBJECT" MODIFY ("SUBJECT" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."STUDENT_SUBJECT" MODIFY ("MARK" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table STUDENTS_REQUESTS
--------------------------------------------------------

  ALTER TABLE "HR"."STUDENTS_REQUESTS" MODIFY ("DEP_ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."STUDENTS_REQUESTS" MODIFY ("STUDENT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."STUDENTS_REQUESTS" MODIFY ("ORDER" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table SUBJECT
--------------------------------------------------------

  ALTER TABLE "HR"."SUBJECT" ADD CONSTRAINT "SUBJECT_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "HR"."SUBJECT" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."SUBJECT" MODIFY ("NAME" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TIMELINE
--------------------------------------------------------

  ALTER TABLE "HR"."TIMELINE" MODIFY ("EDU_LEVEL_ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."TIMELINE" MODIFY ("START_DATE" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."TIMELINE" MODIFY ("END_DATE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table USER_WEBSITE
--------------------------------------------------------

  ALTER TABLE "HR"."USER_WEBSITE" MODIFY ("ROLE" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."USER_WEBSITE" MODIFY ("WEBSITE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table USERS
--------------------------------------------------------

  ALTER TABLE "HR"."USERS" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."USERS" MODIFY ("USER_NAME" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."USERS" MODIFY ("PASSWORD" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."USERS" MODIFY ("EMAIL" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."USERS" MODIFY ("ROLE" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."USERS" MODIFY ("FIRST_NAME" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."USERS" MODIFY ("LAST_NAME" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."USERS" ADD CONSTRAINT "TABLE1_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "HR"."USERS" ADD CONSTRAINT "TABLE1_UK1" UNIQUE ("USER_NAME", "EMAIL")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table YEARS
--------------------------------------------------------

  ALTER TABLE "HR"."YEARS" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."YEARS" MODIFY ("NAME" NOT NULL ENABLE);
 
  ALTER TABLE "HR"."YEARS" ADD CONSTRAINT "YEARS_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;