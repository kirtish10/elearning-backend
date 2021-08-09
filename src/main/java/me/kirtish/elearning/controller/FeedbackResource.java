package me.kirtish.elearning.controller;


import me.kirtish.elearning.model.Course;
import me.kirtish.elearning.model.Feedback;
import me.kirtish.elearning.service.FeedbackService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackResource {


    private final FeedbackService feedbackService;

    public FeedbackResource(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Feedback>> getAllFeedback() {
        List<Feedback> f = feedbackService.getAllFeedback();
        return new ResponseEntity<>(f, HttpStatus.OK);
    }





}
