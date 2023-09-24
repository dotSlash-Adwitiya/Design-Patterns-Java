import java.util.*;

class User {
	
	private String name;
	private String userId;
	
	public User(String name, String userId) {
		
		this.name = name;
		this.userId = userId;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

interface MyIterator {
  boolean hasNext(); //* Check if there exists another elemnt or not */
  Object next();  // * Object can be of any tyoe even user defined 
}

class MyIteratorImple implements MyIterator {
  List<User> userList;
  private int length;
  private int pos = 0;

  public MyIteratorImple(List<User> userList) {
    this.userList = userList;
    this.length = userList.size();
  }

  @Override
  public boolean hasNext() {
    // * if currPos exceeds lenght then no more elements exists
    if(pos >= length)
      return false;
    else 
      return true;
  }

  public Object next() {
    User user = userList.get(pos);
    pos++;
    return user;
  }

}

class UserManagement {
	
	private List<User> userList = new ArrayList<>();
	
	public void addUser(User user)
	{
		userList.add(user);
	}
	
	public User getUser(int index)
	{
		return userList.get(index);
	}
	
	public MyIterator getIterator()
	{
		return new MyIteratorImple(userList);
	}

}


public class IteratorDesignGeeksForGeeks {
  public static void main(String args[]) {
    //* Creating new instance of user management */
    UserManagement userManagement = new UserManagement();

    //* Adding new users */
    userManagement.addUser(new User ("Adwitiya", "user_01"));
    userManagement.addUser(new User ("Aman", "user_02"));
    userManagement.addUser(new User ("Rosy", "user_03"));
    userManagement.addUser(new User ("Freya", "user_04"));

    //* Traversing users through provided iterators! */
    MyIterator myIterator = userManagement.getIterator();
		while(myIterator.hasNext())
		{
			User user = (User)myIterator.next();
			System.out.println(user.getName()+" "+user.getUserId());
		}
  }
}
