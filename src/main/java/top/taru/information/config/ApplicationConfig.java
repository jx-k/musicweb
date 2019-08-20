package top.taru.information.config;

import top.taru.information.interceptor.AtuchInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class ApplicationConfig implements WebMvcConfigurer {
        @Bean
        public  RedisTemplate<String,Object>  redisTemplate(RedisConnectionFactory connectionFactory){
            RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
            redisTemplate.setConnectionFactory(connectionFactory);
            StringRedisSerializer stringRedisSerializer =new StringRedisSerializer();
            JdkSerializationRedisSerializer  jdkSerializer =new JdkSerializationRedisSerializer();
            redisTemplate.setKeySerializer(stringRedisSerializer);
            redisTemplate.setValueSerializer(jdkSerializer);
            redisTemplate.setHashKeySerializer(stringRedisSerializer);
            redisTemplate.setHashValueSerializer(jdkSerializer);
            return  redisTemplate;
        }

    @Bean
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory) {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.setConnectionFactory(factory);
        return stringRedisTemplate;
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(atuchInterceptor()).addPathPatterns("/api/**").excludePathPatterns("/api/login","/api/logout");
    }


    @Bean
    public  AtuchInterceptor atuchInterceptor(){
        return  new  AtuchInterceptor();
    }



}
