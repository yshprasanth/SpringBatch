drop table yalamanchili.tutorials;

create table yalamanchili.tutorials(
	id int(10) NOT NULL,
    author varchar(30) NOT NULL,
    title varchar(50) NOT NULL,
    date varchar(20) NOT NULL,
    icon varchar(100),
    description varchar(200)
);
