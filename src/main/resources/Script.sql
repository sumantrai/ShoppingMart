--<ScriptOptions statementTerminator=";"/>

ALTER TABLE ACCOUNT DROP CONSTRAINT FK_THRU6R2HHSF81950A4NLCTUOO;

ALTER TABLE ACCOUNT DROP CONSTRAINT SYS_C005251;

DROP INDEX SYS_C005251;

DROP TABLE ACCOUNT;

