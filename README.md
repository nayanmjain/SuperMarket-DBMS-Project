# SuperMarket-DBMS-Project
A simple project on DBMS.
A program for Supermarkets to maintain their billing and to find the max and min consumers.

## What this program can do ?
  It can satisfy the basic needs of a supermarket/shop billing.
  * Calculating the total
  * Number of Items 
  * Showing the customer with a total __Max Purchase Amount__.
  * Showing the customer with a total __Max number of Items bought__.
  * Showing the customer with a total __Least Purchase Amount__.

## Frontend of the Program ?
  The program is completely written in Java Programming Language. The frontend is designed using the various Java components which are as available in NetBeans.
  
## Backend of the Program ?
  For the program to connect to the DB. MySQL is runned on localhost in the background. Used JDBC to connect the database with the program.
  
## What all programs/softwares have been used ?
   * NetBeans
   * MySQL WorkBench

## How to Setup ?
  - Setting up the DBMS/MySQL/Program :
      * Downloads:
          - [NetBeans + Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-142931.html)
          - [MySQL](http://dev.mysql.com/downloads/)
          - MySQl Workbench (downloaded with the MySQL)
      1. Install the softwares mentioned above.
      2. Setup a new user in Workbench with username "root" and password "root".
      3. Create a new Database supermarket.
      4. Create a new Table __cust_details__ with the attributes : __ cust_first_name, cust_mobile, cust_total_amt, cust_total_items __.
      5. In NetBeans check for the JDBC connection 
      
          