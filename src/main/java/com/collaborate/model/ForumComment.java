package com.collaborate.model;

import java.util.Date;

public class ForumComment 
{
   private int ID,ForumID,UserID;
   private String Comment,Username;
   private Date CommentDate;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public int getForumID() {
	return ForumID;
}
public void setForumID(int forumID) {
	ForumID = forumID;
}
public int getUserID() {
	return UserID;
}
public void setUserID(int userID) {
	UserID = userID;
}
public String getComment() {
	return Comment;
}
public void setComment(String comment) {
	Comment = comment;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public Date getCommentDate() {
	return CommentDate;
}
public void setCommentDate(Date commentDate) {
	CommentDate = commentDate;
}
   
}