/*
 * Sphere.h
 *
 *  Created on: Aug 21, 2018
 *      Author: Pratik Kenaudekar
 */

#ifndef SPHERE_H_
#define SPHERE_H_

#include "Shape3d.h"

namespace std {

class Sphere: public Shape3d {
public:
	Sphere();
	virtual ~Sphere();
};

} /* namespace std */

#endif /* SPHERE_H_ */
