package com.example.supportservice.domain.chat.application;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(value = "/application-test.yaml")
@AutoConfigureMockMvc
class ChatCommandControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ChatCommandController chatCommandController;

    @Test
    public void addUserTest() throws Exception {
        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "  \"email\": \"string@sdfsd.fg\",\n" +
                                "  \"password\": \"string\",\n" +
                                "  \"firstName\": \"string\",\n" +
                                "  \"lastName\": \"string\"\n" +
                                "}"))
                .andExpect(status().isCreated());
    }

    @Test
    public void addChatTest() throws Exception {
        mockMvc.perform(post("/chat")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "  \"participantId\": 1,\n" +
                                "  \"comment\": \"string sdfsdf sdfsdfsdf sdfsdf s\"\n" +
                                "}"))
                .andExpect(status().isCreated());
    }
    @Test
    @Sql(value = "/create-test.sql",executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    @Sql(value = "/clearBD.sql",executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void addCommentTest() throws Exception {
        mockMvc.perform(post("/chat/comment")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "  \"chatId\": 1,\n" +
                                "  \"participantId\": 1,\n" +
                                "  \"comment\": \"stringlksalkdf;aksd;flkad 'asd;flkas';dkfa;'sdf a\"\n" +
                                "}"))
                .andExpect(status().isCreated());
    }

    @Test
    public void test() throws Exception {
        mockMvc.perform(get("/chat"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("New chat was added")));
    }


}