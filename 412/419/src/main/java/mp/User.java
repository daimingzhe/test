package mp;

import java.sql.Date;

public class User {
private int id;
private String username;
private Date brithday;
private char sex;
private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Date getBrithday() {
	return brithday;
}
public void setBrithday(Date brithday) {
	this.brithday = brithday;
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String toString() {
	return "User [id=" + id + ", username=" + username + ", brithday="
			+ brithday + ", sex=" + sex + ", address=" + address + "]";
}

}
