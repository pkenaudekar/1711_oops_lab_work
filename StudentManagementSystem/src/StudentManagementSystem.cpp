//============================================================================
// Name        : StudentManagementSystem.cpp
// Author      : Pratik Kenaudekar
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "Student.h"
using namespace std;

int main() {
	Student stud01("Pankaj","Bindass",025,24);
	Student stud02("Varun","Kumar",026,21);
	Student stud03("Tanis","Dass",027,22);

	cout << stud01.getStudentDetails() << endl; // prints
	cout << stud02.getStudentDetails() << endl;
	cout << stud03.getStudentDetails() << endl;
	return 0;
}
