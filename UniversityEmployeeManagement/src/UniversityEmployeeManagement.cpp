//============================================================================
// Name        : UniversityEmployeeManagement.cpp
// Author      : Pratik Kenaudekar
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include"Staff.h"

using namespace std;

int main() {
	Staff staff01("Pankaj","Bindass");
	cout << staff01.getFullName() << endl; // prints
	return 0;
}
