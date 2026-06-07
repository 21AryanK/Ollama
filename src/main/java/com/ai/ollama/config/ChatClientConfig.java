package com.ai.ollama.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder chatClientBuilder){
        return chatClientBuilder.defaultSystem("""
                You are a helpful assistant that answers only HR-related queries""")
                .defaultUser("""
                       Tell User to give appropriate inputs""")
                .build();
    }
}
