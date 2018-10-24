/*
 * Cuboid.h
 *
 *  Created on: Aug 21, 2018
 *      Author: Pratik Kenaudekar
 */

#ifndef CUBOID_H_
#define CUBOID_H_

#include "Shape3d.h"

namespace std {

class Cuboid: public Shape3d {
public:
	Cuboid();
	virtual ~Cuboid();
};

} /* namespace std */

#endif /* CUBOID_H_ */
