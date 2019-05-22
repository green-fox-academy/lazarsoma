CREATE DATABASE IF NOT EXISTS TODO;
USE TODO;
show databases;
use TODO;
create table tasks (
id int auto_increment primary key,
description varchar(50) not null,
status varchar(10),
startedDate date,
endedDate date
);
create table owner (
id int auto_increment primary key,
name varchar(30) not null
);

select * from tasks;
select *from owner;
alter table owner change id oID int unsigned;
alter table tasks change id tID int unsigned;
select * from tasks;

ALTER TABLE tasks DROP COLUMN status;

create table todo (
id int auto_increment primary key,
taskID int unsigned,
ownerID int unsigned,
foreign key (taskID) references tasks(tID),
foreign key (ownerID) references owner(oID),
status varchar(10) not null
);

insert into owner (oID, name)
values (1, "Soma"),
(2, "István"),
(3, "László");


select * from tasks;

insert into tasks (tID, description, startedDate)
values (1, "task1", "2019-01-01"),
(2, "task2", "2019-02-02"),
(3, "task3", "2019-03-03");

select * from tasks;

insert into todo (taskID, ownerID, Status)
values (1,2, "Todo"),
(2, 2, "Doing"),
(3, 3, "Review");

select * from tasks;
select * from owner;
select * from todo;	



