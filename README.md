Introduction

Restaurant Management System:
A new restaurant in Islamabad wants to establish a niche by providing an online reservation system for their customers. The administration wants to use the same system to ensure optimal resource (servers, tables, time) allocation for any impromptu guests. The restaurant plans to stay open between 11:00am – 10:00pm, serving both lunch and dinner. With experienced staff members, the maximum time required to prepare a single item from the full menu (25 items with 4 appetizers, 2 soups, 12 main course dishes, 3 side dishes, and 4 deserts) is 30 mins. The staff members include 4 chef, 6 servers, and 1 manager, besides other support staff. The restaurant has the following tables available:
1.	1 extra-large table with max capacity of 12 people.
2.	3 large tables with max capacity of 6 people.
3.	8 medium tables with max capacity of 4 people.
4.	4 small tables with max capacity of 2 people.
The restaurant wants to prioritize large parties and will allow the parties booking the extra-large table to set their own preferred time-limit for booking the table, without going over restaurant opening timings. For all other tables, the restaurant allocates time; ensuring maximum bookings, while giving enough time for each party to enjoy their food. 

Approach:
The Approach I used to solve this problem is to create a Linked list of the tables and then keep adding all the elements to the list as the reservations are made.
The person interacting with the system is asked to enter the number of person to serve and the time he wants to visit at. First of all the program checks whether the table is available at a given time. 
Once the table is available it is reserved in the name of the person and they are shown a success message else they are shown a error message. 
The visitor can also print all the reserved tables at the time by name so that they can reserve accordingly.

How to run:
To execute the code you need to run the code in a Java IDE from the main class.
Make sure to import all the class files of java as well in the project.

Development Environment:
I created the project in IDEA Intelli J IDE so it contains IDE Specific files. 



