package com.collaborate.dao;

import java.util.List;

import com.collaborate.model.BlogComment;




public interface BlogCommentDAO {

	public boolean createBlog(BlogComment blogcomment);
	public BlogComment getBlogcommentdetails(int id);
	public List<BlogComment> getBlogComment();
    public boolean editBlogComment(int id);
	public boolean deleteBlogComment(int id);
}