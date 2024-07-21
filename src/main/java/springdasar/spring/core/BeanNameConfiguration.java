package springdasar.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import springdasar.spring.core.data.Foo;

public class BeanNameConfiguration {

    @Primary
    @Bean(name = "fooFirst")
    public Foo foo1() {
        Foo foo = new Foo();
        return foo;
    }

    @Bean(name = "fooSecond")
    public Foo foo2() {
        Foo foo = new Foo();
        return foo;
    }
}
