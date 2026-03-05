package com.back.domain.poast.repository;

import com.back.domain.poast.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
