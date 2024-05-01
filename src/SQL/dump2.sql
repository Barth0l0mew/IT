PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "Mail" (id integer primary key autoincrement, mail text);
INSERT INTO Mail VALUES(1,'mail@mail.com');
INSERT INTO Mail VALUES(2,'mail@mail.com');
INSERT INTO Mail VALUES(3,'a@gmail.com');
INSERT INTO Mail VALUES(4,'b@gmail.com');
INSERT INTO Mail VALUES(5,'ya@ya.ru');
CREATE TABLE Phones (id integer primary key autoincrement, phone text);
INSERT INTO Phones VALUES(1,'+37533333');
INSERT INTO Phones VALUES(2,'+3752900000');
INSERT INTO Phones VALUES(3,'+37544888888');
CREATE TABLE mail_phones (id integer primary key autoincrement, mail_id integer, phone_id integer);
INSERT INTO mail_phones VALUES(1,1,1);
INSERT INTO mail_phones VALUES(2,2,3);
INSERT INTO mail_phones VALUES(3,3,2);
CREATE TABLE users_info(id integer primary key autoincrement, users_id int, mails_phones_id int);
INSERT INTO users_info VALUES(1,1,1);
INSERT INTO users_info VALUES(2,1,2);
INSERT INTO users_info VALUES(3,2,3);
CREATE TABLE users(id integer primary key autoincrement, name text);
INSERT INTO users VALUES(1,'dima');
INSERT INTO users VALUES(2,'petya');
INSERT INTO users VALUES(3,'oleg');
DELETE FROM sqlite_sequence;
INSERT INTO sqlite_sequence VALUES('Mail',5);
INSERT INTO sqlite_sequence VALUES('Phones',3);
INSERT INTO sqlite_sequence VALUES('mail_phones',3);
INSERT INTO sqlite_sequence VALUES('users',3);
INSERT INTO sqlite_sequence VALUES('users_info',3);
COMMIT;
