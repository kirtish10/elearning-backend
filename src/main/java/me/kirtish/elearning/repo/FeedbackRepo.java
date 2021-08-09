package me.kirtish.elearning.repo;

import me.kirtish.elearning.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepo extends JpaRepository<Feedback,Long> {
}
