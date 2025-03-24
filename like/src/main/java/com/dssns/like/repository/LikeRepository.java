package com.dssns.like.repository;

import com.dssns.like.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository  extends JpaRepository<Like, Long> {

}
