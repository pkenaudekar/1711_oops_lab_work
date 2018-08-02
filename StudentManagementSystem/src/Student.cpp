/*
 * Student.cpp
 *
 *  Created on: Aug 2, 2018
 *      Author: Pratik Kenaudekar
 */
#include<iostream>
#include"Student.h"
#include <string>
#include <sstream>

Student::Student()
{
	cout<<"Object Created ....."<<endl;
}

Student::~Student()
{
	cout<<endl<<"Object Destroyed ....."<<endl;
}

Student::Student(string firstName, string lastName,int rollNo,int age)
{
	this->firstName=firstName;
	this->lastName=lastName;
	this->rollNo=rollNo;
	this->age=age;
	cout<<endl<<"Object Created:"<<firstName<<" "<<lastName<<" "<<rollNo<<" "<<age<<endl;
}

string Student::getStudentDetails()
{
	return this->firstName+" "+this->lastName+" "+ to_string(rollNo) +" "+to_string(age) ;
}



