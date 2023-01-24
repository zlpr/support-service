package com.example.supportservice.infrastructure;


import com.example.supportservice.domain.user.core.UserFacade;
import com.example.supportservice.domain.user.core.ports.incoming.AddNewUser;
import com.example.supportservice.domain.user.core.ports.outgoing.UserPasswordEncoder;
import com.example.supportservice.domain.user.core.ports.outgoing.UserDatabase;
import com.example.supportservice.domain.user.infrastructure.UserPasswordEncoderAdapter;
import com.example.supportservice.domain.user.infrastructure.UserDatabaseAdapter;
import com.example.supportservice.domain.user.infrastructure.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDomainConfig {

    @Bean
    public UserDatabase userDatabase(UserRepository userRepository){
        return new UserDatabaseAdapter(userRepository);
    }

    @Bean
    public UserPasswordEncoder passwordEncoder(){ return new UserPasswordEncoderAdapter(new BCryptPasswordEncoder());}

    @Bean
    public AddNewUser addNewUser(UserDatabase userDatabase,UserPasswordEncoder passwordEncoder){
        return new UserFacade(userDatabase,passwordEncoder);
    }
}
