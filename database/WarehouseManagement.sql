CREATE DATABASE warehousemanagement;
USE warehousemanagement;

CREATE TABLE adminlogin (adminName VARCHAR(20) NOT NULL, adminPassword VARCHAR(20) NOT NULL, PRIMARY KEY (adminName));
INSERT INTO warehousemanagement.adminlogin (adminName, adminPassword)
    VALUES ('SG', 'SGadmin');

CREATE TABLE products (productID INT NOT NULL AUTO_INCREMENT, productName VARCHAR(20) NOT NULL, Category VARCHAR(20) NOT NULL, Unit VARCHAR(6) NOT NULL, Cost INT NOT NULL, Stock INT NOT NULL, PRIMARY KEY (productID));
INSERT INTO warehousemanagement.products (productName, Category, Unit, Cost, Stock)
    VALUES ('Apples', 'Fruits', 'Kg', 70, 39);
INSERT INTO warehousemanagement.products (productName, Category, Unit, Cost, Stock)
    VALUES ('Kiwi', 'Fruits', 'Kg', 100, 37);
INSERT INTO warehousemanagement.products (productName, Category, Unit, Cost, Stock)
    VALUES ('Carrots', 'Vegetables', 'Kg', 40, 48);
INSERT INTO warehousemanagement.products (productName, Category, Unit, Cost, Stock)
    VALUES ('Broccoli', 'Vegetables', 'Kg', 60, 32);
INSERT INTO warehousemanagement.products (productName, Category, Unit, Cost, Stock)
    VALUES ('Cardamom', 'Spices', 'Kg', 1000, 9);

CREATE TABLE salesmanagers (SMID INT NOT NULL AUTO_INCREMENT, SMName VARCHAR(20) NOT NULL, Contact VARCHAR(20) NOT NULL, Address VARCHAR(40) NOT NULL, Email VARCHAR(30) NOT NULL, Since VARCHAR(10) NOT NULL, password CHAR(20), PRIMARY KEY (SMID));
INSERT INTO warehousemanagement.salesmanagers (SMName, Contact, Address, Email, Since, password)
    VALUES ('Vijay Singla', '9867388474', 'H.No. 56, Krishna Enclave, Delhi', 'vijaysingla@gmail.com', '2002', 'vijay2002');
INSERT INTO warehousemanagement.salesmanagers (SMName, Contact, Address, Email, Since, password)
    VALUES ('Himanshu Mittal', '9563748594', 'H.No. 987, Mundaka, Delhi', 'himanshumittal@gmail.com', '2003', 'himanshu2003');

CREATE TABLE customers (CustomerID INT NOT NULL AUTO_INCREMENT, CustomerName VARCHAR(20) NOT NULL, Contact VARCHAR(20) NOT NULL, Address VARCHAR(40) NOT NULL, Email VARCHAR(30) NOT NULL, Since VARCHAR(10) NOT NULL, PRIMARY KEY (CustomerID));
INSERT INTO warehousemanagement.customers (CustomerName, Contact, Address, Email, Since)
    VALUES ('Chirag Gupta', '8766574839', 'H.No. 564, Sector 43, Noida.', 'chiraggupta@gmail.com', '2016');
INSERT INTO warehousemanagement.customers (CustomerName, Contact, Address, Email, Since)
    VALUES ('Shilpa Arora', '8966574739', 'H.No. 768, Sector 23, Chandigarh', 'shilpaarora@gmail.com', '2018');
INSERT INTO warehousemanagement.customers (CustomerName, Contact, Address, Email, Since)
    VALUES ('Bhumi Singh', '9867434739', 'H.No. 878, Sector 22, Ambala', 'humisingh@gmail.com', '2009');

CREATE TABLE suppliers (supplierID INT NOT NULL AUTO_INCREMENT, supplierName VARCHAR(20) NOT NULL, Contact VARCHAR(20) NOT NULL, Address VARCHAR(40) NOT NULL, Email VARCHAR(30) NOT NULL, Since VARCHAR(10) NOT NULL, PRIMARY KEY (supplierID));
INSERT INTO warehousemanagement.suppliers (supplierName, Contact, Address, Email, Since)
    VALUES ('J K Vegetables', '9823374673', 'J K Vegetables, Sector 29, Noida.', 'jkv@gmail.com', '2011');
INSERT INTO warehousemanagement.suppliers (supplierName, Contact, Address, Email, Since)
    VALUES ('Fruit World', '7683287384', 'Fruit World, Sector 14, Sonepat', 'fruitworld@gmail.com', '2005');
INSERT INTO warehousemanagement.suppliers (supplierName, Contact, Address, Email, Since)
    VALUES ('Fruit Kingdom', '8743675844', 'Fruit Kingdom, Chandni Chowk, New Delhi', 'fruitkingdom@gmail.com', '2001');
INSERT INTO warehousemanagement.suppliers (supplierName, Contact, Address, Email, Since)
    VALUES ('Spicy Spices', '9867675674', 'Spicy Spices, Chandni Chowk, New Delhi', 'picyspices@gmail.com', '2003');

CREATE TABLE warehousemanagers (WMID INT NOT NULL AUTO_INCREMENT, WMName VARCHAR(20) NOT NULL, Contact VARCHAR(20) NOT NULL, Address VARCHAR(40) NOT NULL, Email VARCHAR(30) NOT NULL, Since VARCHAR(10) NOT NULL, password CHAR(20), PRIMARY KEY (WMID));
INSERT INTO warehousemanagement.warehousemanagers (WMName, Contact, Address, Email, Since, password)
    VALUES ('Shubham Goyal', '8573849593', 'H.No 45, Vijay Nagar, Delhi', 'dhubhamgoyal@gmai.com', '2001', 'shubham2001');
INSERT INTO warehousemanagement.warehousemanagers (WMName, Contact, Address, Email, Since, password)
    VALUES ('Hitesh Jindal', '7685948384', 'H.No 987, Peeragarhi, Delhi', 'hiteshjindal@gmai.com', '2003', 'hitesh2003');

CREATE TABLE logininfo (loginID INT NOT NULL AUTO_INCREMENT, userID VARCHAR(10), `Date` DATE, `Time` TIME(10), PRIMARY KEY (loginID));
INSERT INTO warehousemanagement.logininfo (userID, `Date`, `Time`)
    VALUES ('15001', '2020-12-11', '23:23:41');
INSERT INTO warehousemanagement.logininfo (userID, `Date`, `Time`)
    VALUES ('14001', '2020-12-11', '23:46:33');
INSERT INTO warehousemanagement.logininfo (userID, `Date`, `Time`)
    VALUES ('15001', '2020-12-11', '23:47:08');

CREATE TABLE transactionin (srno INT NOT NULL AUTO_INCREMENT, productID INT, productName VARCHAR(20), cost INT, units INT, supplierID INT, supplierName VARCHAR(20), totalCost INT, `Date` DATE, `Time` TIME(10), PRIMARY KEY (srno));
INSERT INTO warehousemanagement.transactionin (productID, productName, cost, units, supplierID, supplierName, totalCost, `Date`, `Time`)
    VALUES (11002, 'Kiwi', 100, 2, 12001, 'J K Vegetables', 200, '2020-12-11', '23:41:05');
INSERT INTO warehousemanagement.transactionin (productID, productName, cost, units, supplierID, supplierName, totalCost, `Date`, `Time`)
    VALUES (11004, 'Broccoli', 60, 1, 12001, 'J K Vegetables', 60, '2020-12-11', '23:41:34');
INSERT INTO warehousemanagement.transactionin (productID, productName, cost, units, supplierID, supplierName, totalCost, `Date`, `Time`)
    VALUES (11005, 'Cardamom', 1000, 4, 12004, 'Spicy Spices', 4000, '2020-12-11', '23:42:08');

CREATE TABLE transactionout (srno INT NOT NULL AUTO_INCREMENT, productID INT, productName VARCHAR(20), cost INT, units INT, customerID INT, customerName VARCHAR(20), totalCost INT, `Date` DATE, `Time` TIME(10), PRIMARY KEY (srno));
INSERT INTO warehousemanagement.transactionout (productID, productName, cost, units, customerID, customerName, totalCost, `Date`, `Time`)
    VALUES (11005, 'Cardamom', 1000, 2, 13001, 'Chirag Gupta', 2000, '2020-12-11', '23:42:53');
INSERT INTO warehousemanagement.transactionout (productID, productName, cost, units, customerID, customerName, totalCost, `Date`, `Time`)
    VALUES (11001, 'Apples', 70, 5, 13002, 'Shilpa Arora', 350, '2020-12-11', '23:43:34');

