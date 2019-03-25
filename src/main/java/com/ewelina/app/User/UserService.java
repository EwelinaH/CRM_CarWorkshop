package com.ewelina.app.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void save(User user){
        String hashpassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashpassword);
        userRepository.save(user);
    }

    public User find(Long id){
        return userRepository.findOne(id);
    }

    public void update(User user){
        userRepository.save(user);

    }

    public void delete(Long id){
        userRepository.delete(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

}
