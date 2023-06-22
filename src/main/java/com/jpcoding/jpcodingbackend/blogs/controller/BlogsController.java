package com.jpcoding.jpcodingbackend.blogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpcoding.jpcodingbackend.blogs.dto.BlogsDto;
import com.jpcoding.jpcodingbackend.blogs.service.BlogsService;

@RestController
@RequestMapping(value = "api/blogs/", produces = "application/json", method = { RequestMethod.GET, RequestMethod.POST })
public class BlogsController {

	@Autowired
	private BlogsService blogsService;

	public BlogsController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BlogsController(BlogsService blogsService) {
		super();
		this.blogsService = blogsService;
	}


	@PostMapping("createBlog")
	public ResponseEntity<BlogsDto> savedBlog(@RequestBody BlogsDto blogsDto) {
		BlogsDto savedBlog = blogsService.saveBlog(blogsDto);
		return new ResponseEntity<>(savedBlog, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<BlogsDto>> getBlogs() {
		List<BlogsDto> allBlogs = blogsService.getAllBlogs();
//		System.out.println();
		return new ResponseEntity<>(allBlogs, HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<BlogsDto> getBlog(@PathVariable("id") Long blogId) {
		BlogsDto blogsDto = blogsService.getBlogbyId(blogId);
		return new ResponseEntity<>(blogsDto, HttpStatus.OK);
	}

//	@CrossOrigin


}
