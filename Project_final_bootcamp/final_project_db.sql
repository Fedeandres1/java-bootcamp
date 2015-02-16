/*create database  final_project;*/
create table Phone(
id_phone int auto_increment primary key,
number int default null
);
create table Adress(
id_adress int auto_increment primary key,
street varchar(45) default null,
number int default null ,
floor int default null,
zip_code int default null,
 letter char default null
);
create table Category(
id_category int auto_increment primary key,
name varchar(45) default null

);
create table Product(
id_product int auto_increment primary key,
name varchar(45)  default null,
stock int  default null,
id_category int default null,
constraint fk_category foreign key (id_category) references Category(id_category)
);

create table Payment(
id_payment int auto_increment primary key,
paid_date varchar(45) default null,
total float default null,
detail varchar(45) default null
);
create table Shoppingcart(
id_shopping_cart int auto_increment primary key,
date varchar(45) default null
);
create table ShoppingOrder(
number int auto_increment primary key,
order_date varchar(45)  default null,
shipping varchar(45) default null,
id_ship_to_adress int default null,
total float default null,
state varchar(45) default null,
 id_payment int default null,
constraint fk_payment foreign key ShoppingOrder(id_payment) references Payment(id_payment) 
);
create table lineitem(
id_line_item int auto_increment primary key,
quantity int  default null,
price float  default null,
id_product int default null,
id_shopping_cart int default null,
id_order int default null,
constraint fk_id_product foreign key lineitem(id_product) references Product(id_product),
constraint fk_id_shopping foreign key lineitem (id_shopping_cart) references shoppingcart(id_shopping_cart),
constraint fk_order foreign key lineitem(id_order) references  ShoppingOrder(number)
);
create table Account(
id varchar(45)  primary key,
billing_adress int default null,
open_date varchar(45) default null,
is_closed boolean default null, 
close_date varchar(45) default null,
id_order int default null,
id_shopping_cart int default null,
constraint fk_order_account foreign key Account(id_order) references ShoppingOrder(number),
constraint fk_shopping_account foreign key Account(id_shopping_cart) references Shoppingcart(id_shopping_cart)

);






create table WEBUSER(
id_user varchar(45) not null   primary key ,
password varchar(45) not null default "" ,
user_state varchar(45)  default null,
email varchar(45) not null default "",
id_adress int default null,
id_phone int default null,
id_account varchar(45) default null,
id_shopping_cart int default null,
constraint fk_shopping_cart_w foreign key WEBUSER(id_shopping_cart)  references Shoppingcart(id_shopping_cart),
constraint fk_adress_w foreign key WEBUSER(id_adress) references Adress(id_adress),
constraint fk_phone_w foreign key WEBUSER(id_phone) references Phone(id_phone),
constraint fk_account_W foreign key WEBUSER(id_account) references Account(id)

);














