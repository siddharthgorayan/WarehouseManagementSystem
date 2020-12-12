# Warehouse Management System

## Overview:
The Warehouse Management System is a project in JAVA which aims at managing a huge quantity of stocks and products and keeping a record of all the produts with their cost, stock, and transactions. It also keeps the record of all the Customers, Suppliers of the stock, Sales Managers and Warehouse Managers while generating the reports for the transactions and login informations of various users.

---

## Login Window:
There are three login buttons for Administrator, Sales Manager and Warehouse Manager.

### Login Window:
![](/Screenshots/loginPage.png)

There is only 1 administrator who can login through the Administrator Login by giving the correct userName and Password.

### Admin Login Window:
![](/Screenshots/enteringPassword.png)

---

## Administrator's Page:
After the login, the admin has various modules on his page. The admin can access all the pages.

### Admin Page:
![](/Screenshots/adminPage.png)


Out of all the modules, the Products, Suppliers, Customers, Warehouse Managers and Sales Managers have 4 basic functionalities:
* Add
* Delete
* View
* Update

### Managing Products:
![](/Screenshots/productsPage.png)
### Managing Suppliers:
![](/Screenshots/supplierPage.png)
### Managing Sales Managers:
![](/Screenshots/salesManagerPage.png)
### Managing Warehouse Managers:
![](/Screenshots/warehouseManagerPage.png)

---

## Adding a Record:

![](/Screenshots/addProducts.png)

---

## Viewing Records:

![](/Screenshots/viewSuppliers.png)

---

## Deleting a Record:

![](/Screenshots/deleteProducts.png)

---

## Updating a Record:
To update a record, enter the ID corresponding to that Product/ Customer/ Supplier/ Manager on their respective page and the records will be shown in the text boxes. Edit the records in the text boxes and save the updates.

### Updating the Record:
![](/Screenshots/updatePage.png)

---

## Transactions Page:
The transaction page shows a table of the products available in the stock so that it's easy to decide whether it is suitable to buy/sell the product at that time.
It has two transaction buttons, for IN and OUT.

### Transaction Page:
![](/Screenshots/transactionsPage.png)

The sales manager has the option to enter a product ID to check it's availability in the stock. According to the availaibility, a message is shown if the transaction can be made or not.

### Suggestions on Transaction Page:
![](/Screenshots/transactionsIn.png)

The manager specifies the units of products and it shows the total Cost of the products according to that.
The manager also has to give the ManagerID to save in the records.
If the manager inputs a wrong ID for either product or manager itself, the application shows an error and the `PROCEED` button is disabled.

### Application shows an Error:
![](/Screenshots/errorInTransaction.png)

### Proceed Button Disbaled:
![](/Screenshots/availabilityForTransaction.png)

After the successfull transaction, the record is saved to the database including the transactionID, productID, Sales Maanger ID, Date and Time of transaction.

---

## Reports:
The reports page shows three options to show the reports of Transaction IN, Transaction OUT and Login Info of Managers.

### Reports Page:
![](/Screenshots/transactionsReport.png)
### Transactions IN Report:
![](/Screenshots/transactionsInReport.png)
### Login Info Report:
![](/Screenshots/loginReport.png)

---

## Change Password:
The admin can change his password by typing the userID and current password and seeting up a new password.

### Change Password Page:
![](/Screenshots/changePassword.png)

If any of the userID or password is wrong, the application shows an error.

### Error! Wrong Credentials
![](/Screenshots/errorChangePass.png)

If the new password doesn't match with the confirm password, the application again shows a message.

### Error! Confirm Password
![](/Screenshots/errorChangePass1.png)

---

## Sales Manager's Page:

Sales Manager only gets the rights to manage the transactions as his work is limited to Sales Department.
It also has change password option which is similar to the previous one.

### Sales Manager's Page:

![](/Screenshots/salesManager.png)

---

## Warehouse Manager's Page:

Sales Manager only gets the rights to manage the products as his work is limited to warehouse Department.
It also has change password option which is similar to the previous one.

### Sales Manager's Page:

![](/Screenshots/warehouseManager.png)

---

## Miscellaneous Features:

1. Every page has a back button so that the user don't have to close the application anytime during the session.
2. The data and time of the login of all the managers is recored and the admin can see the records in the loginInfo, which allows to track the working of the managers.
3. The application offers realtime suggestions on the transaction page for adding the products into the stock when the stock is empty and the item has been searched for transaction.
4. The admin has the data of the passwords of the managers, so he can check in their respective pages for when the passwords are changed.

---

## Database:

The database for this application was made using MySQL on a local host server, so anyone accessing this project won't be able to access database automatically.
The databse file for has been uploaded `WarehouseManagement.sql`.
Use this file to make a local database and run the application.





