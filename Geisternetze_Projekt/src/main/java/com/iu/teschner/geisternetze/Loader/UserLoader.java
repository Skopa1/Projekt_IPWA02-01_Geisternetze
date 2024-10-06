/*
package com.iu.teschner.geisternetze.Loader;

import com.iu.teschner.geisternetze.model.User;
import com.iu.teschner.geisternetze.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserLoader {

    public class DataLoader implements CommandLineRunner {

        @Autowired
        private UserRepository userRepository;

        @Override
        public void run(String... args) throws Exception {
            loadUserData();
        }

        private void loadUserData() {
            if (userRepository.count() == 0) {
                User user1 = new User();
                user1.setPassword("test");
                user1.setUsername("test");


                userRepository.save(user1);

            }
        }
    }
}

 */