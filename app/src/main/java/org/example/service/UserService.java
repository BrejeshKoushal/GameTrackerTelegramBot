package org.example.service;

import jakarta.transaction.Transactional;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public String registerUser(long chatId, String name){
         var user = userRepository.findByChatId(chatId);
         if (user.isPresent()){
             return "User already exists";
         }
         User newUser = new User();
         newUser.setChatId(chatId);
         newUser.setFirstName(name);
         newUser.setRegisteredAt(LocalDateTime.now());
         userRepository.save(newUser);
        return "✅ Welcome, " + name + "! You have been successfully registered.";
    }
}
