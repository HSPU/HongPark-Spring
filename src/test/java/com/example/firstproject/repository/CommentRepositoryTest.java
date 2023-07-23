package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest    // JPA와 연동한 테스트!
class CommentRepositoryTest {

    @Autowired CommentRepository commentRepository;

    @Test
    @DisplayName("특정 게시글의 모든 댓글 조회")
    void findByArticleId() {
        /* Case 1: 4번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 4L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상하기
            Article article = new Article(4L, "풀업", "몇 회?");
            Comment a = new Comment(1L, article, "준명", "40회");
            Comment b = new Comment(2L, article, "한별", "30회");
            Comment c = new Comment(3L, article, "웅진", "28회");
            List<Comment> expected = Arrays.asList(a, b, c);

            // 검증
            assertEquals(expected.toString(), comments.toString(), "4번 글의 모든 댓글을 출력!");
        }

        /* Case 2: 1번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 1L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상하기
            Article article = new Article(1L, "가가가가", "1111");
            List<Comment> expected = Arrays.asList();

            // 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글이 없음");
        }

        /* Case 3: 9번 게시글의 모든 댓글 조회 */
        {}

        /* Case 4: 999번 게시글의 모든 댓글 조회 */
        {}

        /* Case 5: -1번 게시글의 모든 댓글 조회 */
        {}
    }

    @Test
    @DisplayName("특정 닉네임의 모든 댓글 조회")
    void findByNickName() {
        /* Case 1: "준명"의 모든 댓글 조회 */
        {
            // 입력 데이터를 준비
            String nickname = "준명";
            // 실제 수행
            List<Comment> comments = commentRepository.findByNickname(nickname);
            // 예상하기
            Comment a = new Comment(1L, new Article(4L, "풀업", "몇 회?"), "준명", "40회");
            Comment b = new Comment(4L, new Article(5L, "푸쉬업", "몇 회?"), "준명", "70회");
            Comment c = new Comment(7L, new Article(6L, "딥스", "몇 회?"), "준명", "50회");
            List<Comment> expected = Arrays.asList(a, b, c);

            // 검증
            assertEquals(expected.toString(), comments.toString(), "준명의 모든 댓글을 출력!");
        }

        /* Case 2: "한별"의 모든 댓글 조회 */
        {}

        /* Case 3: null 의 모든 댓글 조회 */
        {}

        /* Case 4: ""의 모든 댓글 조회 */
        {}

        /* Case 5: "i"의 모든 댓글 조회 */
        {}
    }
}