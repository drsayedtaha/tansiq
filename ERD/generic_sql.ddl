CREATE TABLE admin_edu_year (
    user_id     NUMBER NOT NULL,
    edu_level   NUMBER NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS UNLIMITED FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE TABLE dep_prereq (
    dep_id      NUMBER NOT NULL,
    prereq_id   NUMBER NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE TABLE department (
    id        NUMBER NOT NULL,
    name      VARCHAR2(50 BYTE) NOT NULL,
    min_cap   NUMBER NOT NULL,
    max_cap   NUMBER NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
    DEFAULT );

CREATE UNIQUE INDEX department_pk ON
    department (
        id
    ASC )
        TABLESPACE users PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE department
    ADD CONSTRAINT department_pk PRIMARY KEY ( id )
        USING INDEX department_pk;

CREATE TABLE edu_level (
    id              NUMBER NOT NULL,
    department      VARCHAR2(50 BYTE) NOT NULL,
    faculty         VARCHAR2(50 BYTE) NOT NULL,
    year            NUMBER NOT NULL,
    department_id   NUMBER NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
    DEFAULT );

CREATE UNIQUE INDEX edu_level_pk ON
    edu_level (
        id
    ASC )
        TABLESPACE users PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE edu_level
    ADD CONSTRAINT edu_level_pk PRIMARY KEY ( id )
        USING INDEX edu_level_pk;

CREATE TABLE edu_level_department (
    edu_level_id    NUMBER NOT NULL,
    department_id   NUMBER NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
    DEFAULT );

CREATE TABLE messages (
    from_user_id   NUMBER NOT NULL,
    report         VARCHAR2(1000 BYTE) NOT NULL,
    to_user_id     NUMBER NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE TABLE prerequisite (
    subject                NUMBER NOT NULL,
    id                     NUMBER NOT NULL,
    min_mark_subject       NUMBER NOT NULL,
    current_edu_level_id   NUMBER NOT NULL,
    min_mark_dep           NUMBER NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE UNIQUE INDEX prerequisite_pk1 ON
    prerequisite (
        id
    ASC )
        TABLESPACE users PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

ALTER TABLE prerequisite
    ADD CONSTRAINT prerequisite_pk PRIMARY KEY ( id )
        USING INDEX prerequisite_pk1;

CREATE TABLE roles (
    user_id   NUMBER NOT NULL,
    role_id   NUMBER DEFAULT 0 NOT NULL,
    roles     NUMBER DEFAULT 0 NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

COMMENT ON COLUMN roles.roles IS
    '0 IS STUDENT';

CREATE UNIQUE INDEX roles_pk ON
    roles (
        role_id
    ASC )
        TABLESPACE users PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

ALTER TABLE roles
    ADD CONSTRAINT roles_pk PRIMARY KEY ( role_id )
        USING INDEX roles_pk;

CREATE TABLE student (
    user_id      NUMBER NOT NULL,
    edu_level    NUMBER NOT NULL,
    total_mark   NUMBER
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
    DEFAULT );

CREATE UNIQUE INDEX student_pk ON
    student (
        user_id
    ASC )
        TABLESPACE users PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE student
    ADD CONSTRAINT student_pk PRIMARY KEY ( user_id )
        USING INDEX student_pk;

CREATE TABLE student_subject (
    student   NUMBER NOT NULL,
    subject   NUMBER NOT NULL,
    mark      NUMBER NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS UNLIMITED FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE TABLE students_requests (
    dep_id       NUMBER NOT NULL,
    student_id   NUMBER NOT NULL,
    "ORDER"      NUMBER NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE TABLE subject (
    id              NUMBER NOT NULL,
    name            VARCHAR2(30 BYTE) NOT NULL,
    edu_level_id    INTEGER,
    edu_level_id1   NUMBER NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE UNIQUE INDEX subject_pk ON
    subject (
        id
    ASC )
        TABLESPACE users PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

ALTER TABLE subject
    ADD CONSTRAINT subject_pk PRIMARY KEY ( id )
        USING INDEX subject_pk;

CREATE TABLE timeline (
    edu_level_id   NUMBER NOT NULL,
    start_date     DATE NOT NULL,
    end_date       DATE NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE TABLE user_website (
    role      NUMBER NOT NULL,
    website   VARCHAR2(100 BYTE) NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE TABLE users (
    id            NUMBER NOT NULL,
    user_name     VARCHAR2(20 BYTE) NOT NULL,
    password      VARCHAR2(20 BYTE) NOT NULL,
    email         VARCHAR2(30 BYTE) NOT NULL,
    role          NUMBER DEFAULT 0 NOT NULL,
    first_name    VARCHAR2(15 BYTE) NOT NULL,
    middle_name   VARCHAR2(15 BYTE),
    last_name     VARCHAR2(15 BYTE) NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE users LOGGING
    STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE UNIQUE INDEX table1_pk ON
    users (
        id
    ASC )
        TABLESPACE users PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

CREATE UNIQUE INDEX table1_uk1 ON
    users (
        user_name
    ASC,
        email
    ASC )
        TABLESPACE users PCTFREE 10
            STORAGE ( PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT )
        LOGGING;

ALTER TABLE users
    ADD CONSTRAINT table1_pk PRIMARY KEY ( id )
        USING INDEX table1_pk;

ALTER TABLE users
    ADD CONSTRAINT table1_uk1 UNIQUE ( user_name,
                                       email )
        USING INDEX table1_uk1;

ALTER TABLE admin_edu_year
    ADD CONSTRAINT admin_edu_year_fk1 FOREIGN KEY ( user_id )
        REFERENCES users ( id )
    NOT DEFERRABLE;

ALTER TABLE admin_edu_year
    ADD CONSTRAINT admin_edu_year_fk2 FOREIGN KEY ( edu_level )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE dep_prereq
    ADD CONSTRAINT dep_prereq_fk1 FOREIGN KEY ( dep_id )
        REFERENCES department ( id )
    NOT DEFERRABLE;

ALTER TABLE dep_prereq
    ADD CONSTRAINT dep_prereq_fk2 FOREIGN KEY ( prereq_id )
        REFERENCES prerequisite ( id )
    NOT DEFERRABLE;

ALTER TABLE edu_level_department
    ADD CONSTRAINT edu_level_department_fk1 FOREIGN KEY ( department_id )
        REFERENCES department ( id )
    NOT DEFERRABLE;

ALTER TABLE edu_level_department
    ADD CONSTRAINT edu_level_department_fk2 FOREIGN KEY ( edu_level_id )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE edu_level
    ADD CONSTRAINT edu_level_fk1 FOREIGN KEY ( year )
        REFERENCES years ( id )
    NOT DEFERRABLE;

ALTER TABLE edu_level
    ADD CONSTRAINT edu_level_fk2 FOREIGN KEY ( department_id )
        REFERENCES department ( id )
    NOT DEFERRABLE;

ALTER TABLE messages
    ADD CONSTRAINT messages_fk1 FOREIGN KEY ( to_user_id )
        REFERENCES users ( id )
    NOT DEFERRABLE;

ALTER TABLE prerequisite
    ADD CONSTRAINT prerequisite_fk1 FOREIGN KEY ( current_edu_level_id )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE prerequisite
    ADD CONSTRAINT prerequisite_fk2 FOREIGN KEY ( subject )
        REFERENCES subject ( id )
    NOT DEFERRABLE;

ALTER TABLE messages
    ADD CONSTRAINT reports_fk1v1 FOREIGN KEY ( from_user_id )
        REFERENCES users ( id )
    NOT DEFERRABLE;

ALTER TABLE students_requests
    ADD CONSTRAINT requests_fk1 FOREIGN KEY ( student_id )
        REFERENCES student ( user_id )
    NOT DEFERRABLE;

ALTER TABLE students_requests
    ADD CONSTRAINT requests_fk2 FOREIGN KEY ( dep_id )
        REFERENCES department ( id )
    NOT DEFERRABLE;

ALTER TABLE roles
    ADD CONSTRAINT roles_fk1 FOREIGN KEY ( user_id )
        REFERENCES users ( id )
    NOT DEFERRABLE;

ALTER TABLE student
    ADD CONSTRAINT student_fk1 FOREIGN KEY ( user_id )
        REFERENCES users ( id )
    NOT DEFERRABLE;

ALTER TABLE student
    ADD CONSTRAINT student_fk2 FOREIGN KEY ( edu_level )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE student_subject
    ADD CONSTRAINT student_subject_fk1 FOREIGN KEY ( student )
        REFERENCES student ( user_id )
    NOT DEFERRABLE;

ALTER TABLE student_subject
    ADD CONSTRAINT student_subject_fk2 FOREIGN KEY ( subject )
        REFERENCES subject ( id )
    NOT DEFERRABLE;

ALTER TABLE subject
    ADD CONSTRAINT subject_edu_level_fk FOREIGN KEY ( edu_level_id1 )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE timeline
    ADD CONSTRAINT timeline_fk1 FOREIGN KEY ( edu_level_id )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE user_website
    ADD CONSTRAINT user_website_fk1 FOREIGN KEY ( role )
        REFERENCES roles ( role_id )
    NOT DEFERRABLE;

ALTER TABLE admin_edu_year
    ADD CONSTRAINT admin_edu_year_fk1 FOREIGN KEY ( user_id )
        REFERENCES users ( id )
    NOT DEFERRABLE;

ALTER TABLE admin_edu_year
    ADD CONSTRAINT admin_edu_year_fk2 FOREIGN KEY ( edu_level )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE dep_prereq
    ADD CONSTRAINT dep_prereq_fk1 FOREIGN KEY ( dep_id )
        REFERENCES department ( id )
    NOT DEFERRABLE;

ALTER TABLE dep_prereq
    ADD CONSTRAINT dep_prereq_fk2 FOREIGN KEY ( prereq_id )
        REFERENCES prerequisite ( id )
    NOT DEFERRABLE;

ALTER TABLE edu_level_department
    ADD CONSTRAINT edu_level_department_fk1 FOREIGN KEY ( department_id )
        REFERENCES department ( id )
    NOT DEFERRABLE;

ALTER TABLE edu_level_department
    ADD CONSTRAINT edu_level_department_fk2 FOREIGN KEY ( edu_level_id )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE edu_level
    ADD CONSTRAINT edu_level_fk2 FOREIGN KEY ( department_id )
        REFERENCES department ( id )
    NOT DEFERRABLE;

ALTER TABLE messages
    ADD CONSTRAINT messages_fk1 FOREIGN KEY ( to_user_id )
        REFERENCES users ( id )
    NOT DEFERRABLE;

ALTER TABLE prerequisite
    ADD CONSTRAINT prerequisite_fk1 FOREIGN KEY ( current_edu_level_id )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE prerequisite
    ADD CONSTRAINT prerequisite_fk2 FOREIGN KEY ( subject )
        REFERENCES subject ( id )
    NOT DEFERRABLE;

ALTER TABLE messages
    ADD CONSTRAINT reports_fk1v1 FOREIGN KEY ( from_user_id )
        REFERENCES users ( id )
    NOT DEFERRABLE;

ALTER TABLE students_requests
    ADD CONSTRAINT requests_fk1 FOREIGN KEY ( student_id )
        REFERENCES student ( user_id )
    NOT DEFERRABLE;

ALTER TABLE students_requests
    ADD CONSTRAINT requests_fk2 FOREIGN KEY ( dep_id )
        REFERENCES department ( id )
    NOT DEFERRABLE;

ALTER TABLE roles
    ADD CONSTRAINT roles_fk1 FOREIGN KEY ( user_id )
        REFERENCES users ( id )
    NOT DEFERRABLE;

ALTER TABLE student
    ADD CONSTRAINT student_fk1 FOREIGN KEY ( user_id )
        REFERENCES users ( id )
    NOT DEFERRABLE;

ALTER TABLE student
    ADD CONSTRAINT student_fk2 FOREIGN KEY ( edu_level )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE student_subject
    ADD CONSTRAINT student_subject_fk1 FOREIGN KEY ( student )
        REFERENCES student ( user_id )
    NOT DEFERRABLE;

ALTER TABLE student_subject
    ADD CONSTRAINT student_subject_fk2 FOREIGN KEY ( subject )
        REFERENCES subject ( id )
    NOT DEFERRABLE;

ALTER TABLE subject
    ADD CONSTRAINT subject_edu_level_fk FOREIGN KEY ( edu_level_id1 )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE timeline
    ADD CONSTRAINT timeline_fk1 FOREIGN KEY ( edu_level_id )
        REFERENCES edu_level ( id )
    NOT DEFERRABLE;

ALTER TABLE user_website
    ADD CONSTRAINT user_website_fk1 FOREIGN KEY ( role )
        REFERENCES roles ( role_id )
    NOT DEFERRABLE;



-- Oracle SQL Developer Data Modeler Summary Report: 
-- 
-- CREATE TABLE                            15
-- CREATE INDEX                             8
-- ALTER TABLE                             51
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              1
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0