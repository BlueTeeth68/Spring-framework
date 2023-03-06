package com.example.springjpa.repository;

import com.example.springjpa.domain.KeyWord;
import com.example.springjpa.domain.KeywordId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KeywordRepository extends JpaRepository<KeyWord, KeywordId> {

    List<KeyWord> findByPostIdOrderByNameAsc(Long postId);
}
