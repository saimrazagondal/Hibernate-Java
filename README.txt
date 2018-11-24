Name: Saim Raza Gondal

Advanced Programming
Lab 7 - Hibernate

===============================================

Explanation:
An application that stores the information of a person in a 
database using hibernate. 
Firstly the person class was created, then in the pom file, all the required dependencies
were added. 
To run this create a database in your system named as 'identity' and in it create a 
table named 'person'. The username is 'root' and the password is null. 
Reuqired annotations were added to map the person class on to the table in the database. A
hibernate.cfg.xml file was created and placed in the resources folder which had the
details of the database for connection.
The user is asked to enter one out of four (1/2/3/4) choices based on the action he wants
to perform. Based on the choice, the appropriate method is called and the information
taken from the user is used to store, retrieve, update or delete records from the database. 

===============================================