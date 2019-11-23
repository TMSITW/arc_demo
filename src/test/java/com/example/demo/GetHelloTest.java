package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
public class GetHelloTest {
    HelloController controller = new HelloController();

    @Test
    void getHelloTest() {
        assertTrue("I`am not greeting you!", controller.getHello().equals("Hallo world!"));
    }

}
