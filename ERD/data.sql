--------------------------------------------------------
--  File created - Monday-December-24-2018   
--------------------------------------------------------

REM INSERTING into USERS
SET DEFINE OFF;
Insert into USERS (ID,USER_NAME,PASSWORD,EMAIL,ROLE,FIRST_NAME,MIDDLE_NAME,LAST_NAME) values (1,'1546','****','as@dsa',0,'ahmed','mohamed','ali');
Insert into USERS (ID,USER_NAME,PASSWORD,EMAIL,ROLE,FIRST_NAME,MIDDLE_NAME,LAST_NAME) values (2,'1765','***','sa@sad',0,'ahmed','ali','sa');
Insert into USERS (ID,USER_NAME,PASSWORD,EMAIL,ROLE,FIRST_NAME,MIDDLE_NAME,LAST_NAME) values (3,'dr_mohamed','****','dr@mail',1,'dr','ali','ali');
Insert into USERS (ID,USER_NAME,PASSWORD,EMAIL,ROLE,FIRST_NAME,MIDDLE_NAME,LAST_NAME) values (4,'dr_ali','****','dr2@mail',1,'dr','agmed','mohamed');


REM INSERTING into USER_WEBSITE
SET DEFINE OFF;
Insert into USER_WEBSITE (ROLE,WEBSITE) values (1,'login');
Insert into USER_WEBSITE (ROLE,WEBSITE) values (2,'getdata');
Insert into USER_WEBSITE (ROLE,WEBSITE) values (2,'settimeline');
Insert into USER_WEBSITE (ROLE,WEBSITE) values (1,'addstudent');
Insert into USER_WEBSITE (ROLE,WEBSITE) values (0,'login');
Insert into USER_WEBSITE (ROLE,WEBSITE) values (2,'login');
Insert into USER_WEBSITE (ROLE,WEBSITE) values (0,'setrequest');


REM INSERTING into ROLES
SET DEFINE OFF;
Insert into ROLES (USER_ID,ROLE_ID,ROLES) values (1,1,0);
Insert into ROLES (USER_ID,ROLE_ID,ROLES) values (2,2,0);
Insert into ROLES (USER_ID,ROLE_ID,ROLES) values (3,3,1);
Insert into ROLES (USER_ID,ROLE_ID,ROLES) values (4,4,1);



REM INSERTING into EDU_LEVEL
SET DEFINE OFF;
Insert into EDU_LEVEL (ID,YEAR,DEPARTMENT_ID,FACULTY) values (0,3,0,'engineering');
Insert into EDU_LEVEL (ID,YEAR,DEPARTMENT_ID,FACULTY) values (2,1,2,'engineering');
Insert into EDU_LEVEL (ID,YEAR,DEPARTMENT_ID,FACULTY) values (3,1,3,'scince');
Insert into EDU_LEVEL (ID,YEAR,DEPARTMENT_ID,FACULTY) values (1,1,4,'computer');
Insert into EDU_LEVEL (ID,YEAR,DEPARTMENT_ID,FACULTY) values (4,1,1,'accounting');


REM INSERTING into STUDENT
SET DEFINE OFF;
Insert into STUDENT (USER_ID,EDU_LEVEL) values (1,1);
Insert into STUDENT (USER_ID,EDU_LEVEL) values (2,1);
Insert into STUDENT (USER_ID,EDU_LEVEL) values (3,1);
Insert into STUDENT (USER_ID,EDU_LEVEL) values (4,2);
