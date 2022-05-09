package com.clonening.deserialization;

import java.io.Serializable;

public class Employee1 implements Serializable  { //initially class not allowed serialization
transient int id;       //if we are used the transient no one access ourdata ,Ex- pin no,name
transient String name;
public Employee1(int id, String name) {
	super();
	this.id = id;
	this.name = name;// those variable is not participate the the serializable is called transient
}

}
