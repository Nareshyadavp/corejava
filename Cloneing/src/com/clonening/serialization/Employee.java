package com.clonening.serialization;

import java.io.Serializable;

public class Employee implements Serializable  { //initially class not allowed serialization
public int id;
public String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}
