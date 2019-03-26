create schema if not exists car_workshop collate utf8_polish_ci;

use car_workshop;

create table if not exists customer
(
	id bigint auto_increment
		primary key,
	customerName varchar(255) not null,
	customerSurname varchar(255) not null,
	dateOfBirth date null
);

create table if not exists employee
(
	id bigint auto_increment
		primary key,
	employeeName varchar(255) not null,
	employeeSurname varchar(255) not null,
	manHourCost double not null,
	note varchar(255) null,
	phoneNumber bigint not null
);

create table if not exists vehicles
(
	id bigint auto_increment
		primary key,
	carBrand varchar(255) not null,
	carModel varchar(255) not null,
	nextInspection date not null,
	productionYear varchar(255) not null,
	registrationNo varchar(255) not null,
	customer_id bigint null,
	constraint FKnv4q8530cwfniqo0lb6ia3poi
		foreign key (customer_id) references customer (id)
);

create table if not exists orders
(
	id bigint auto_increment
		primary key,
	componentsCost double null,
	employeeManHour double not null,
	plannedStartRepairDate date not null,
	problemDescription varchar(255) null,
	puttingToRepairDate date not null,
	repairCostForCustomer double not null,
	repairDescription varchar(255) null,
	repairStartDate date not null,
	repairStatus varchar(255) not null,
	workingHours double not null,
	employee_id bigint null,
	vehicle_id bigint null,
	repairEndingDate date null,
	constraint FKog5v9ga2g2ukytypn4ocip6b4
		foreign key (employee_id) references employee (id),
	constraint FKov6eiiyhqkasfj9jlt2s6wj5p
		foreign key (vehicle_id) references vehicles (id)
);

create table if not exists user
(
	id bigint auto_increment
		primary key,
	email varchar(255) not null,
	password varchar(255) not null,
	userName varchar(255) not null
);



INSERT INTO customer (id, customerName, customerSurname, dateOfBirth) VALUES (1, 'Magdalena', 'Kot', '1989-02-03');
INSERT INTO customer (id, customerName, customerSurname, dateOfBirth) VALUES (2, 'Karol', 'Nowak', '1999-02-02');
INSERT INTO customer (id, customerName, customerSurname, dateOfBirth) VALUES (3, 'Łukasz', 'Żubełko', '1997-01-01');
INSERT INTO customer (id, customerName, customerSurname, dateOfBirth) VALUES (4, 'Konrad', 'Kot', '1979-05-01');
INSERT INTO customer (id, customerName, customerSurname, dateOfBirth) VALUES (5, 'Alicja', 'Nowak', '1999-04-01');
INSERT INTO employee (id, employeeName, employeeSurname, manHourCost, note, phoneNumber) VALUES (1, 'Marian', 'Nowak', 22.6, 'brak', 728678540);
INSERT INTO employee (id, employeeName, employeeSurname, manHourCost, note, phoneNumber) VALUES (2, 'Karol', 'Wawrzak', 20.6, 'brak', 728678540);
INSERT INTO employee (id, employeeName, employeeSurname, manHourCost, note, phoneNumber) VALUES (3, 'Marek', 'Sowa', 20.6, 'brak', 728678540);
INSERT INTO employee (id, employeeName, employeeSurname, manHourCost, note, phoneNumber) VALUES (4, 'Julian', 'Drwal', 20.6, 'brak', 728678540);
INSERT INTO employee (id, employeeName, employeeSurname, manHourCost, note, phoneNumber) VALUES (5, 'Tomasz', 'Kowalik', 18.6, 'brak', 728678540);
INSERT INTO vehicles (id, carBrand, carModel, nextInspection, productionYear, registrationNo, customer_id) VALUES (3, 'Audi', 'A6', '2020-02-01', '2014', 'KR5T897', 1);
INSERT INTO vehicles (id, carBrand, carModel, nextInspection, productionYear, registrationNo, customer_id) VALUES (4, 'Hyundai', 'i20', '2020-02-01', '2013', 'KNT56Y78', 2);
INSERT INTO vehicles (id, carBrand, carModel, nextInspection, productionYear, registrationNo, customer_id) VALUES (5, 'Citroen', 'C3', '2020-02-01', '2014', 'KBR34Y67', 3);
INSERT INTO vehicles (id, carBrand, carModel, nextInspection, productionYear, registrationNo, customer_id) VALUES (6, 'Toyota', 'Yaris', '2020-02-01', '2012', 'KR9S807', 1);
INSERT INTO vehicles (id, carBrand, carModel, nextInspection, productionYear, registrationNo, customer_id) VALUES (7, 'Audi', 'A6', '2020-02-01', '2010', 'KR0T123', 4);
INSERT INTO vehicles (id, carBrand, carModel, nextInspection, productionYear, registrationNo, customer_id) VALUES (8, 'Honda', 'CRV', '2020-02-01', '2014', 'KR4T098', 1);
INSERT INTO orders (id, componentsCost, employeeManHour, plannedStartRepairDate, problemDescription, puttingToRepairDate, repairCostForCustomer, repairDescription, repairStartDate, repairStatus, workingHours, employee_id, vehicle_id, repairEndingDate) VALUES (19, 250.5, 20.6, '2019-04-01', 'uszkodzone nadkole', '2019-08-02', 271.1, 'naprawa nadkola', '2019-08-02', 'In repair', 80, 2, 3, '2019-08-10');
INSERT INTO orders (id, componentsCost, employeeManHour, plannedStartRepairDate, problemDescription, puttingToRepairDate, repairCostForCustomer, repairDescription, repairStartDate, repairStatus, workingHours, employee_id, vehicle_id, repairEndingDate) VALUES (20, 150.5, 20.6, '2019-04-01', 'uszkodzone drzwi', '2019-08-02', 271.1, 'naprawa drzwi', '2019-08-02', 'In repair', 16.5, 2, 3, '2019-08-02');
INSERT INTO orders (id, componentsCost, employeeManHour, plannedStartRepairDate, problemDescription, puttingToRepairDate, repairCostForCustomer, repairDescription, repairStartDate, repairStatus, workingHours, employee_id, vehicle_id, repairEndingDate) VALUES (21, 250.5, 20.6, '2019-04-01', 'uszkodzona felga', '2019-08-02', 271.1, 'wymiana felgi', '2019-08-02', 'In repair', 12.5, 3, 3, '2019-08-02');
INSERT INTO orders (id, componentsCost, employeeManHour, plannedStartRepairDate, problemDescription, puttingToRepairDate, repairCostForCustomer, repairDescription, repairStartDate, repairStatus, workingHours, employee_id, vehicle_id, repairEndingDate) VALUES (22, 35.5, 20.6, '2019-04-01', 'wymiana opon', '2019-08-02', 271.1, 'wymiana opon', '2019-08-02', 'In repair', 120, 3, 3, '2019-08-02');
INSERT INTO orders (id, componentsCost, employeeManHour, plannedStartRepairDate, problemDescription, puttingToRepairDate, repairCostForCustomer, repairDescription, repairStartDate, repairStatus, workingHours, employee_id, vehicle_id, repairEndingDate) VALUES (23, 300.0, 22.6, '2019-04-01', 'uszkodzone drzwi', '2019-08-02', 271.1, 'naprawa drzwi', '2019-08-02', 'In repair', 60, 1, 3, '2019-08-02');
INSERT INTO orders (id, componentsCost, employeeManHour, plannedStartRepairDate, problemDescription, puttingToRepairDate, repairCostForCustomer, repairDescription, repairStartDate, repairStatus, workingHours, employee_id, vehicle_id, repairEndingDate) VALUES (24, 250.5, 22.6, '2019-04-01', 'wymiana oleju', '2019-08-02', 271.1, 'wymiana oleju', '2019-08-02', 'In repair', 12.5, 1, 3, '2019-08-02');
INSERT INTO car_workshop.user (id, email, password, userName) VALUES (18, 'user@op.pl', '$2a$10$.iJbZYlS..dC0u1Ok4.l7.2y8x72nhuAFm6NGrgFgHpV40Gc1HA7W', 'user');