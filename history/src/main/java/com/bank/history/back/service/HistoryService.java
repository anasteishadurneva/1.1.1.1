package com.bank.history.back.service;

import com.bank.history.back.entity.History;
import com.bank.history.back.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public void save(History history) {
        historyRepository.save(history);
    }

    public List<History> getAll() {
        return historyRepository.findAll();
    }
}