package com.Collections;

public class Cricketer implements Comparable<Cricketer>{
int jerno;
String name;
int rank;
public Cricketer(int jerno, String name, int rank) {
	
	this.jerno = jerno;
	this.name = name;
	this.rank = rank;
}
@Override
public String toString() {
	return "Cricketer [jerno=" + jerno + ", name=" + name + ", rank=" + rank + "]";
}

@Override
public int compareTo( Cricketer o) {
if(this.rank <o.rank) {
	return -1;
}
else if(this.rank >o.rank) {
	return 1;
}
else {
	return 0;
}

}
}
