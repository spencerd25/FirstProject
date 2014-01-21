package first.controller;

import first.model.Friend;

public class FriendController
{
	private Friend myFriend;
	
	public void start()
	{
		jordanFriend();
		shivaFriend();
		fernandoFriend();
		meFriend();
	}

	private void jordanFriend()
	{
		setMyFriend(new Friend("Jordan", 17, "Weird", false, 156.9, "Dance"));
	}
	
	private void shivaFriend()
	{
		setMyFriend(new Friend("Shiva", 17, "Fun", false, 130.34, "Volleyball"));
	}
	
	private void fernandoFriend()
	{
		setMyFriend(new Friend("Fernando", 17, "Cool", false, 162.54, "Computers"));
	}
	
	private void meFriend()
	{
		setMyFriend(new Friend("Josh", 16, "Tired", false, 158.64, "Tennis"));
	}

	public Friend getMyFriend()
	{
		return myFriend;
	}

	public void setMyFriend(Friend myFriend)
	{
		this.myFriend = myFriend;
	}
}