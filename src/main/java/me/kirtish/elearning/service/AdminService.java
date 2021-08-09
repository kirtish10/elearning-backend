package me.kirtish.elearning.service;


import me.kirtish.elearning.model.Admin;
import me.kirtish.elearning.repo.AdminRepo;
import me.kirtish.elearning.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepo adminRepo;
    private final UserRepo userRepo;


    @Autowired
    public AdminService(AdminRepo adminRepo, UserRepo userRepo) {
        this.adminRepo = adminRepo;
        this.userRepo = userRepo;
    }

    public Admin addCourse(Admin admin) {
        return adminRepo.save(admin);
    }

}
