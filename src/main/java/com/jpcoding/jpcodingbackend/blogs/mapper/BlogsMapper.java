package com.jpcoding.jpcodingbackend.blogs.mapper;

import com.jpcoding.jpcodingbackend.blogs.dto.BlogsDto;
import com.jpcoding.jpcodingbackend.blogs.entity.Blogs;

public class BlogsMapper {

	public static BlogsDto maptoBlogsDto(Blogs blogs) {

		BlogsDto blogsDto = new BlogsDto(blogs.getId(), blogs.getDateCreated(), blogs.getDateModified(),
				blogs.getTitle(), blogs.getDescription(), blogs.getArticle());
		return blogsDto;

	}

	public static Blogs maptoBlogs(BlogsDto blogsDto) {
		Blogs blogs = new Blogs(blogsDto.getId(), blogsDto.getDateCreated(), blogsDto.getDateModified(),
				blogsDto.getTitle(), blogsDto.getDescription(), blogsDto.getArticle());
		return blogs;
	}

}
