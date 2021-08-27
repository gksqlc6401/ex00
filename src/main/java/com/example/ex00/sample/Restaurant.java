package com.example.ex00.sample;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
@RequiredArgsConstructor //final
@Setter
public class Restaurant {

//    @Autowired
//    private chef chef;

//    @Qualifier("englandChaf")//나는 잉글랜드 셰프를 고를거야, 클래스의 앞글자가 소문자로 변함
//    @Autowired
    private Chef Chef;
}
