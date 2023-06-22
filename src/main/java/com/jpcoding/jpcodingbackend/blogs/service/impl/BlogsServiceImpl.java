package com.jpcoding.jpcodingbackend.blogs.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpcoding.jpcodingbackend.blogs.dto.BlogsDto;
import com.jpcoding.jpcodingbackend.blogs.entity.Blogs;
import com.jpcoding.jpcodingbackend.blogs.mapper.BlogsMapper;
import com.jpcoding.jpcodingbackend.blogs.repository.BlogsRepository;
import com.jpcoding.jpcodingbackend.blogs.service.BlogsService;

@Service
public class BlogsServiceImpl implements BlogsService {

	@Autowired
	private BlogsRepository blogsRepository;

	public BlogsServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BlogsServiceImpl(BlogsRepository blogsRepository) {
		super();
		this.blogsRepository = blogsRepository;
	}

	@Override
	public BlogsDto saveBlog(BlogsDto blogsDto) {
		// TODO Auto-generated method stub
		Blogs blog = BlogsMapper.maptoBlogs(blogsDto);
		Blogs savedBlog = blogsRepository.save(blog);
		BlogsDto savedBlogDto = BlogsMapper.maptoBlogsDto(savedBlog);
		return savedBlogDto;
	}


	@Override
	public BlogsDto getBlogbyId(Long blogId) {
		// TODO Auto-generated method stub
		Blogs blog = blogsRepository.findById(blogId).get();
		BlogsDto foundBlogDto = BlogsMapper.maptoBlogsDto(blog);
		return foundBlogDto;
	}

	@Override
	public List<BlogsDto> getAllBlogs() {
		// TODO Auto-generated method stub
		List<Blogs> blogs = blogsRepository.findAll();
		List<BlogsDto> foundBlogsDto = blogs.stream().map(blog -> BlogsMapper.maptoBlogsDto(blog))
				.collect(Collectors.toList());
		return foundBlogsDto;
	}
}
