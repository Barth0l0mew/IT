drop table if exists inventory;
drop table if exists character;
drop table if exists race;
drop table if exists class;
drop table if exists item;

CREATE TABLE character (
                           id integer not null primary key auto_increment,
                           name text not null,
                           race_id integer,
                           class_id integer);

CREATE TABLE race (
                      id integer not null primary key auto_increment,
                      name text not null);

CREATE TABLE class (
                       id integer not null primary key auto_increment,
                       name text not null);

CREATE TABLE item (
					id integer not null primary key auto_increment,
                    name text not null,
                    price integer default 0, 
					weight float,
                    rarity integer default 1,
                    maximum integer default 1,
					CHECK(rarity>=1 and rarity<=5));

CREATE TABLE inventory (
                           id integer not null primary key auto_increment,
                           character_id integer,
                           item_id integer); 