package com.example.session.db;

import com.example.session.model.UserDto;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserRepository {

    private List<UserDto> userList = new ArrayList<>();

    public Optional<UserDto> findByName(String name) {
        return userList.stream()
                .filter(it -> {
                    return it.getName().equals(name);
                })
                .findFirst();
    }

    @PostConstruct // 빈이 초기화되었을 때 실행
    public void init() {
        userList.add(
                new UserDto("강승민", "1234")
        );

        userList.add(
                new UserDto("최민석", "1234")
        );

        userList.add(
                new UserDto("강진호", "1234")
        );
    }

}
