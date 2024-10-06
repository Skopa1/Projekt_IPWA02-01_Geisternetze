package com.iu.teschner.geisternetze.service;



import com.iu.teschner.geisternetze.model.User;
import com.iu.teschner.geisternetze.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import com.iu.teschner.geisternetze.model.Netz;
import com.iu.teschner.geisternetze.repository.NetzRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NetzService {

    @Autowired
    private NetzRepository netzRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Netz> findAll() {
        return netzRepository.findAll();
    }

    public Optional<Netz> findById(Long id) {
        return netzRepository.findById(id);
    }

    public Netz save(Netz netz) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = userRepository.findByUsername(username);

        if (netz.getStatus() == null || netz.getStatus().isEmpty()) {
            netz.setStatus("offen");
        }

        if (user != null) {
            netz.setSchiffname(user.getSchiffname());
        }

        return netzRepository.save(netz);
    }

    public void deleteById(Long id) {
        netzRepository.deleteById(id);
    }
}
