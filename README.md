# Employee-Manager

Employee manager program

# Output example

![image](https://github.com/lgomezruiz/Employee-Manager/assets/97950503/33ac7049-9433-4968-bbf0-71480a79ecf6)

# Summary

They ask us to create a program that manages employees.

Employees are defined by having:

• Name

• Age

• Salary

We will also have a constant called PLUS, which will have a value of €300

We have two types of employees: delivery driver and salesperson.

The commercial, apart from the previous attributes, has one more called commission (double).

The delivery person, apart from the employee attributes, has another one called zone (String).

Create your constructors, getters and setters and toString (think about how to take advantage of inheritance).

Objects of the Employee type (the parent class) cannot be created, but their daughters can.

The classes will have a method called plus, which depending on each class will have a different implementation. This bonus basically increases the employee's salary.

• In commercial, if you are over 30 years old and charge a commission of more than 200 euros, the bonus will be applied.

• As a delivery person, if he is under 25 and delivers in “zone 3”, he will receive the bonus.

You can have it return a boolean or not return anything, I'll leave it up to you.

Create an executable class where you create different employees and apply the plus to check that it works.
