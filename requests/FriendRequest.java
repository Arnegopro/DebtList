package requests;

import logic.User;

public class FriendRequest extends Request {

	public enum FriendRequestStatus {
		/**
		 * The server has not yet handled the request
		 */
		UNHANDLED, 
		/**
		 * The target user has accepted the request
		 */
		ACCEPTED, 
		/**
		 * The target user has declined the request
		 */
		DECLINED,
		/**
		 * The server has registered the request, but the target user has not yet responded
		 */
		PENDING, 
		/**
		 * The target user was not found
		 */
		USER_NOT_FOUND;
	}
	
	/**
	 * Default constructor.
	 * Should not be used by anyone other than the XMLSerializer.
	 */
	public FriendRequest() {}
	
	/**
	 * Creates a new FriendRequest with the given values, and UNHANDLED as status.
	 * @param friendUsername	The target friend's username
	 * @param from				The requesting user
	 */
	public FriendRequest(String friendUsername, User from) {
		setFriendUsername(friendUsername);
		setFromUser(from);
	}
	
	public FriendRequest(long id, String friendUsername, User from, FriendRequestStatus status) {
		this(friendUsername, from);
		setStatus(status);
		setId(id);
	}

	public void setId(long id) {
		setVariable("id", id);
	}
	
	public void setStatus(FriendRequestStatus status) {
		setVariable("status", status);
	}
	
	public void setFriendUsername(String username) {
		setVariable("friendUsername", username);
	}
	
	public void setFromUser(User user) {
		setVariable("fromUser", user);
	}
	
	public User getFromUser() {
		return (User) getVariable("fromUser");
	}
	
	public String getFriendUsername() {
		return (String) getVariable("friendUsername");
	}
	
	public FriendRequestStatus getStatus() {
		return (FriendRequestStatus) getVariable("status");
	}
}