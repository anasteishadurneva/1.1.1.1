package com.bank.history.back.controller;

import com.bank.history.back.entity.History;
import com.bank.history.back.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @PostMapping
    public ResponseEntity<?> createHistory(@RequestBody History history) {
        historyService.save(history);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<History>> getAllHistory() {
        List<History> history = historyService.getAll();
        return ResponseEntity.ok(history);
    }
}
