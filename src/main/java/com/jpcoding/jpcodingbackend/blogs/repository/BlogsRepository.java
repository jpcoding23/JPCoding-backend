package com.jpcoding.jpcodingbackend.blogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpcoding.jpcodingbackend.blogs.entity.Blogs;

public interface BlogsRepository extends JpaRepository<Blogs, Long> {

}
