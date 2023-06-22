package com.jpcoding.jpcodingbackend.blogs.service;

import java.util.List;

import com.jpcoding.jpcodingbackend.blogs.dto.BlogsDto;

public interface BlogsService {
	BlogsDto saveBlog(BlogsDto blogsDto);

	BlogsDto getBlogbyId(Long blogId);

	List<BlogsDto> getAllBlogs();

}
