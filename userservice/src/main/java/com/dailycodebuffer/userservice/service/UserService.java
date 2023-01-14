package com.dailycodebuffer.userservice.service;

import com.dailycodebuffer.userservice.VO.Department;
import com.dailycodebuffer.userservice.VO.ResponseTemplateVO;
import com.dailycodebuffer.userservice.entity.User;
import com.dailycodebuffer.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository ;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        final User user = userRepository.findByUserId(userId);
        responseTemplateVO.setUser(user);


        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);

        responseTemplateVO.setDepartment(department);
        return responseTemplateVO;
    }
}
