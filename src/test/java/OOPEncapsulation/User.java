package OOPEncapsulation;
//Credentials has private variables and loginpage is the class used to run the same.
//Simple but important concept. Will be using POM and also in API .Powerful concept but we need to use it properly (Python etc).
//Few prop which are private ( 9.40 m) in nature .
//PRivate variables can be accessed within the class ..20.08 video and 20.32
//Getter Setter ......
//Rt click -- Source -----Generate Getter ,setter and choose the variables
//Done as we dont want to give access to private variables 
//We dont want to expose few logic which is internal to bank




public class User {

	public static void main(String[] args) {

	}

	private String name;
	private int age;
	private long phone;

	private void getUserSalary() {
		System.out.println("get user salary");
	}

	public void getUserSalaryInfo() {
		getUserSalary();
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}