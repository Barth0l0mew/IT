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
CREATE TABLE department (
                      id integer not null primary key autoincrement,
                      name varchar(20) not null,
                      location varchar(15));
CREATE TABLE salary_grade (
                       grade integer,
                       min_salary integer,
                       max_salary integer);
DELETE FROM sqlite_sequence;
COMMIT;
department    employer      salary_grade
department    employer      salary_grade
