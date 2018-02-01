package com.awesome.context;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainContext {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
