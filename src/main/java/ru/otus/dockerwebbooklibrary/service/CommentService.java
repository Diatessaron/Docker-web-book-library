package ru.otus.dockerwebbooklibrary.service;

import ru.otus.dockerwebbooklibrary.domain.Comment;

import java.util.List;

public interface CommentService {
    String saveComment(String bookTitle, String commentContent);

    Comment getCommentById(String id);

    List<Comment> getCommentByContent(String content);

    List<Comment> getCommentsByBook(String bookTitle);

    List<Comment> getAll();

    String updateComment(String id, String commentContent);

    String deleteComment(String id);
}
