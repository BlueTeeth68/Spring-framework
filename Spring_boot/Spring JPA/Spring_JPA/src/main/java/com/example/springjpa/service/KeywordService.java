package com.example.springjpa.service;

import com.example.springjpa.domain.KeyWord;
import com.example.springjpa.domain.KeywordId;
import com.example.springjpa.repository.KeywordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KeywordService {

    private final KeywordRepository keywordRepository;

    public KeyWord createKeyword(KeyWord keyWord) {

        if (keywordRepository.existsById(new KeywordId(keyWord.getName(), keyWord.getPostId()))) {
            throw new RuntimeException("Bad request: keyword is already exists");
        }
        KeyWord result = keywordRepository.save(keyWord);
        return result;
    }

    public KeyWord findById(KeywordId id) {
        KeyWord result = keywordRepository.findById(id).orElse(null);
        return result;
    }

    public List<KeyWord> findByPostIdSortedByName(Long postId) {
        List<KeyWord> result = keywordRepository.findByPostIdOrderByNameAsc(postId);
        return result;
    };



}
