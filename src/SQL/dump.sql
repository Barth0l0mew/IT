PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE Mail(mail String);
INSERT INTO Mail VALUES('mail@mail.com');
INSERT INTO Mail VALUES('mail@mail.com');
COMMIT;

