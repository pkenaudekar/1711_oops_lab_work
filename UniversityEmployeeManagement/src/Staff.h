/*
 * Staff.h
 *
 *  Created on: Aug 2, 2018
 *      Author: Pratik Kenaudekar
 */

#ifndef STAFF_H_
#define STAFF_H_
#include<string>

using namespace std;

class Staff
{
	protected:
	string firstName;
	string lastName;

	public:
	Staff();
	~Staff();
	Staff(string firstName);
	Staff(string firstName, string lastName);
	string getFirstName()
	{
		return this->firstName;

	}
	string getLastName()
	{
		return this->lastName;

	}
	string getFullName();

};

#endif /* STAFF_H_ */
