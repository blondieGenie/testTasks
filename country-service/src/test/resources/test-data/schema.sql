DROP TABLE CITY;
CREATE TABLE CITY (id NUMBER(5) PRIMARY KEY, country VARCHAR2(256) NOT NULL, capital VARCHAR2(100) NOT NULL, currency VARCHAR2(10) NOT NULL);

DROP TABLE LOG;
CREATE TABLE LOG (id NUMBER(5) GENERATED BY DEFAULT AS IDENTITY (START WITH 1) PRIMARY KEY, registration_date TIMESTAMP(6), type NUMBER(5), id_session NUMBER(5), text BLOB, status NUMBER(5), error VARCHAR2(256), fromm VARCHAR2(256), too VARCHAR2(256));

CREATE SEQUENCE seqLog START WITH 1 INCREMENT BY 1;

CREATE SEQUENCE seqSession START WITH 1 INCREMENT BY 1;