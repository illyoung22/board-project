package com.study.boardproject.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;
    private String content;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;

}
