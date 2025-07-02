package tnsif.scanner.Encapsulation;

public class Encapsulation {
private int serialnum;
private String name;
private int age;
public int getSerialnum() {
	return serialnum;
}
public void setSerialnum(int serialnum) {
	this.serialnum = serialnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "encapsulation [serialnum=" + serialnum + ", name=" + name + ", age=" + age + "]";
}

}
