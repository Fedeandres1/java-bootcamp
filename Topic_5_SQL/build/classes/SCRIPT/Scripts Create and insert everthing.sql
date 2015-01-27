create database HIGH_SCHOOL;
CREATE TABLE STUDENT(
first_name varchar(45) ,
last_name varchar(45),
id_registration int not null auto_increment primary key,
date_birth date


);



create table TEACHER(
first_name varchar(45) ,
last_name varchar(45),
id_teacher int not null auto_increment primary key,
date_birth date



);

create table COURSE(
id_course int not null auto_increment primary key,
name varchar(45),
id_teacher int ,
hour_week int,
constraint fk_teacher foreign key (id_teacher) references TEACHER(id_teacher)


);
create table STUDENTXCOURSEXNOTA(
id_student int,
id_course int,
note_1 int,
note_2 int,
note_3 int,
note_final int,
primary key (id_student,id_course),
constraint fk_student foreign key (id_student) references STUDENT(id_registration),
constraint fk_course foreign key (id_course) references COURSE(id_course)

);
create table TEACHERXCOURSE(
id_teacher int not null,
id_course int not null,
 primary key (id_teacher,id_course),
constraint fk_teacherXCORUSE foreign key (id_teacher) references TEACHER(id_teacher),
constraint fk_courseXTEACHER foreign key (id_course) references COURSE(id_course)
);

create table SCHEDULERXCOURSE(
id_scheduler int not null primary key,
day_course date ,
hour_from  time, 
hour_to time,
id_course int ,
constraint fk_course_scheduler foreign key (id_course) references COURSE(id_course),
check (hour_from > hour_to)

);


insert into Teacher(first_name,last_name,date_birth) values ('Analia','Lampido',26/05/1990);
insert into Teacher(first_name,last_name,date_birth) values ('Fernando','Torres',10/01/1910);
insert into Teacher(first_name,last_name,date_birth) values ('Diego','Milito',09/02/1930);


insert into Course(name,hour_week) values('Ingles',3);
insert into Course(name,hour_week) values('Java',6);
insert into Course(name,hour_week) values('Deutsch',7);
insert into Course(name,hour_week) values('Visual Basic',4);
insert into Course(name,hour_week) values('C++',3);



insert into Student(first_name,last_name,date_birth) values('Federico','Solterman','1990-12-10');
 insert into Student(first_name,last_name,date_birth) values('Andres','Seto','1990-12-10');
 insert into Student(first_name,last_name,date_birth) values('Cleto','Super','1990-12-10';
 insert into Student(first_name,last_name,date_birth) values('Homero','Simspson',8/10/1750);
 insert into Student(first_name,last_name,date_birth) values('Sara','Oconer',2/10/1830);
 insert into Student(first_name,last_name,date_birth) values('Aston','SinApellido',22/12/1989);
 insert into Student(first_name,last_name,date_birth) values('Gallardo','Lamborgini',26/10/1810);
 insert into Student(first_name,last_name,date_birth) values('Antonio','Seralio',10/2/1820);
 insert into Student(first_name,last_name,date_birth) values('Fedsadas','26389',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('Federaso','Sodasn',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('Federidsaco','So2lterman',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('Feddwao','S21n',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('Fedawo','Soltdas',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('Feddwad','Soldwan',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('Federidasco','Solte21rman',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('qw','fed',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dsad','sa',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('saadw','sda',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('22ds','wda',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('wdsac','dsa',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dsawd','dsaw',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('Federico','2dsc',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('Sulma','Saragosa',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('Año','Uno',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('Ricardo','Centurion',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('dsa','dsa',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('a','b',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('sa','dsa',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('s','2sd',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dsa','dsa',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('wq','ewq',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('21sd','gweew',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('cdfger','dwqdsac',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwqcds','dwqsda',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dasdas','dsadbfd',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('fwefeefw','dwqdqcs',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwqsasa','dsacewd',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dsadwqd','d3d',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwad','dasad',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('dsadw','dsadw',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('dwqd','dwqd',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('Fededwqdrico','dwqdwq',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('dwq','wqd',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwq','dwqd',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwqdqw','dwq',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwqdwqdq','dwqd',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwqdq','dwqd',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwqdqw','dwq',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwqdqw','dsadasgr',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwqdq','hyk',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwqdq','Solterkuykman',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('dwqdwdq','kuyky',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('trhtrg','uyjh',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('hgfh','kuykku',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('Federitrhtrco','hgf',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('hgfh','htrh',26/10/1990);
insert into Student(first_name,last_name,date_birth) values('hgr','hthgf',26/10/1990); 
 insert into Student(first_name,last_name,date_birth) values('htrh','htrhg',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('Federihgrhtrco','thr',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('Federhtrhtrico','htrhgf',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('Federico','hrtgf',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('htrh','hgfhfg',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('ghfgf','Solterman',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('Federhgfhfico','Solterman',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('Federhrthrtico','Solterman',26/10/1990);
 insert into Student(first_name,last_name,date_birth) values('htrh','hrth','1990-12-10');
insert into Student(first_name,last_name,date_birth) values('htrh','htrh','1990-12-10');
insert into Student(first_name,last_name,date_birth) values('ghfh','Soltehtrhrrman','1990-12-10');
insert into Student(first_name,last_name,date_birth) values('htrhr','rthr','1990-12-10');
insert into Student(first_name,last_name,date_birth) values('htr','tr','1990-12-10');



insert into Student(first_name,last_name,date_birth) values('htr','tr','1990-12-10');




insert into studentXCOURSEXNOTA(id_student,id_course) values(1,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(2,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(73,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(3,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(4,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(5,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(6,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(7,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(8,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(9,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(10,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(11,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(12,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(13,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(14,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(15,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(16,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(17,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(18,1);
insert into studentXCOURSEXNOTA(id_student,id_course) values(19,1);


insert into studentXCOURSEXNOTA(id_student,id_course) values(37,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(38,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(20,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(21,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(22,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(39,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(23,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(24,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(25,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(26,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(27,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(28,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(29,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(30,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(31,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(32,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(33,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(34,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(35,2);
insert into studentXCOURSEXNOTA(id_student,id_course) values(36,2);

insert into studentXCOURSEXNOTA(id_student,id_course) values(37,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(38,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(20,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(21,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(22,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(39,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(23,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(24,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(25,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(26,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(27,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(28,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(29,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(30,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(31,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(32,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(33,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(34,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(35,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(36,3);
insert into studentXCOURSEXNOTA(id_student,id_course) values(55,3);

insert into studentXCOURSEXNOTA(id_student,id_course) values(38,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(20,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(21,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(22,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(39,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(23,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(24,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(25,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(26,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(27,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(28,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(29,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(30,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(31,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(32,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(33,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(34,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(35,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(36,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(37,4);
insert into studentXCOURSEXNOTA(id_student,id_course) values(50,4);

insert into studentXCOURSEXNOTA(id_student,id_course) values(38,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(20,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(21,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(22,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(39,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(23,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(24,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(25,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(26,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(27,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(28,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(29,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(30,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(31,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(32,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(33,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(34,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(35,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(36,5);
insert into studentXCOURSEXNOTA(id_student,id_course) values(80,5);