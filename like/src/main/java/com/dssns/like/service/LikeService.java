package com.dssns.like.service;

import com.dssns.like.repository.LikeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class LikeService {
  private final LikeRepository likeRepository;

  public void likePost(Long userNo, Long postNo) {
    // TODO: Validate userNo and postNo
    log.info("Liking post with postNo: {} by userNo: {}", postNo, userNo);
    // Implement the logic to like a post
  }

  public void likeCancelPost(Long userNo, Long postNo) {
    // TODO: Validate userNo and postNo
    log.info("Cancelling like for post with postNo: {} by userNo: {}", postNo, userNo);
    // Implement the logic to cancel like on a post
  }

  public void likeComment(Long userNo, Long commentNo) {
    // TODO: Validate userNo and commentNo
    log.info("Liking comment with commentNo: {} by userNo: {}", commentNo, userNo);
    // Implement the logic to like a comment
  }

  public void likeCancelComment(Long userNo, Long commentNo) {
    // TODO: Validate userNo and commentNo
    log.info("Cancelling like for comment with commentNo: {} by userNo: {}", commentNo, userNo);
    // Implement the logic to cancel like on a comment
  }
}
