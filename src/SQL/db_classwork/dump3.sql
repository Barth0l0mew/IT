PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE employer (
                           id integer not null primary key autoincrement,
                           name varchar(15) not null,
                           job varchar(10),
                           manager_id integer,
                           hire_date text,
                           salary float,
                           commission float,
                           department_id integer);
INSERT INTO employer VALUES(63679,'SANDRINE','CLERK',69062,'1990-12-18',900.0,NULL,2001);
INSERT INTO employer VALUES(64989,'ADELYN','SALESMAN',66928,'1991-02-20',1700.0,400.0,3001);
INSERT INTO employer VALUES(65271,'WADE','SALESMAN',66928,'1991-02-22',1350.0,600.0,3001);
INSERT INTO employer VALUES(65646,'JONAS','MANAGER',68319,'1991-04-02',2957.0,NULL,2001);
INSERT INTO employer VALUES(66564,'MADDEN','SALESMAN',66928,'1991-09-28',1350.0,1500.0,3001);
INSERT INTO employer VALUES(66928,'BLAZE','MANAGER',68319,'1991-05-01',2750.0,NULL,3001);
INSERT INTO employer VALUES(67832,'CLARE','MANAGER',68319,'1991-06-09',2550.0,NULL,1001);
INSERT INTO employer VALUES(67858,'SCARLET','ANALYST',65646,'1997-04-19',3100.0,NULL,2001);
INSERT INTO employer VALUES(68319,'KAYLING','PRESIDENT',NULL,'1991-11-18',6000.0,NULL,1001);
INSERT INTO employer VALUES(68329,'KAYLING2','PRESIDENT',NULL,'1991-11-18',6000.0,NULL,1001);
INSERT INTO employer VALUES(68339,'KAYLING3','PRESIDENT',NULL,'1991-11-18',6000.0,NULL,1001);
INSERT INTO employer VALUES(68454,'TUCKER','SALESMAN',66928,'1991-09-08',1600.0,0.0,3001);
INSERT INTO employer VALUES(68736,'ADNRES','CLERK',67858,'1997-05-23',1200.0,NULL,2001);
INSERT INTO employer VALUES(69000,'JULIUS','CLERK',66928,'1991-12-03',1050.0,NULL,3001);
INSERT INTO employer VALUES(69062,'FRANK','ANALYST',65646,'1991-12-03',3100.0,NULL,2001);
INSERT INTO employer VALUES(69324,'MARKER','CLERK',67832,'1992-01-23',1400.0,NULL,1001);
CREATE TABLE department (
                      id integer not null primary key autoincrement,
                      name varchar(20) not null,
                      location varchar(15));
INSERT INTO department VALUES(1001,'FINANCE','SYDNEY');
INSERT INTO department VALUES(2001,'AUDIT','MELBOURNE');
INSERT INTO department VALUES(3001,'MARKETING','PERTH');
INSERT INTO department VALUES(4001,'PRODUCTION','BRISBANE');
CREATE TABLE salary_grade (
                       grade integer,
                       min_salary integer,
                       max_salary integer);
INSERT INTO salary_grade VALUES(1,800,1300);
INSERT INTO salary_grade VALUES(2,1301,1500);
INSERT INTO salary_grade VALUES(3,1501,2100);
INSERT INTO salary_grade VALUES(4,2101,3100);
INSERT INTO salary_grade VALUES(5,3101,9999);
CREATE TABLE new_employer (id integer not null primary key autoincrement,
                           name varchar(15) not null);
INSERT INTO new_employer VALUES(1,'KAYLING3');
DELETE FROM sqlite_sequence;
INSERT INTO sqlite_sequence VALUES('employer',69324);
INSERT INTO sqlite_sequence VALUES('department',4001);
INSERT INTO sqlite_sequence VALUES('new_employer',1);
CREATE VIEW emp_dep as select e.name, e.job, d.name as department from employer as e
inner join department as d on e.department_id=d.id;
CREATE INDEX idx_name  on employer(name);
CREATE INDEX idx_salary on employer(salary);
CREATE INDEX idx_name_salary on employer(name,salary);
CREATE TRIGGER trg_insert_employer after insert  on employer 
begin 
insert into new_employer(name) values(new.name);
end;
COMMIT;
