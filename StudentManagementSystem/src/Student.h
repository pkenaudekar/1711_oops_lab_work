/*
 * Student.h
 *
 *  Created on: Aug 2, 2018
 *      Author: Pratik Kenaudekar
 */

#ifndef STUDENT_H_
#define STUDENT_H_
#include<string>

using namespace std;

class Student
{
	protected:
	string firstName;
	string lastName;
	int rollNo;
	int age;

	public:
	Student();
	~Student();
	Student(string firstName);
	Student(string firstName, string lastName,int rollNo,int age);
	string getFirstName()
	{
		return this->firstName;

	}
	string getLastName()
	{
		return this->lastName;

	}
	int getrollNo()
	{
		return this->rollNo;

	}
	int getage()
	{
		return this->age;

	}
	string getStudentDetails();

};


#endif /* STUDENT_H_ */
