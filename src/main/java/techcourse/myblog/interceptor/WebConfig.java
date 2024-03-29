package techcourse.myblog.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer interceptorConfigure() {
        return new WebMvcConfigurer() {
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LogoutInterceptor())
                        .addPathPatterns("/user/show", "/user/edit", "/user/delete");
                registry.addInterceptor(new LoginInterceptor())
                        .addPathPatterns("/user/signup", "user");
            }
        };
    }
}
