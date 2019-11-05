CREATE TABLE library (
libraryId varchar(30) NOT NULL,
libraryName varchar(40) NOT NULL,
location varchar(30),
address varchar(100),
contactNo varchar(30),
status varchar(30),
PRIMARY KEY (libraryId)
);

insert into library(libraryId,libraryName,location,address,contactNo,status) values('L001','Nenasa','Pannala','pannala','0372246424','active');

select * from library;

