package me.kirtish.elearning.service;


import me.kirtish.elearning.model.Feedback;
import me.kirtish.elearning.repo.FeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private final FeedbackRepo feedbackRepo;

    public FeedbackService(FeedbackRepo feedbackRepo) {
        this.feedbackRepo = feedbackRepo;
    }



    public List<Feedback> getAllFeedback() {
        return feedbackRepo.findAll();
    }

    public Feedback addFeedbackbyUserId(Feedback f) {
        return feedbackRepo.save(f);
    }





}
