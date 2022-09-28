package com.linkedlist;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@Slf4j
public class StackTest {

    Stack<String> stack;

    @Before
    public void setup() {
        stack = new Stack<>();
    }

    @Test
    public void testEmptyStack() {
        assertThat(stack.isEmpty()).isTrue();
        assertThat(stack.size()).isZero();
    }

    @Test(expected = EmptyStackException.class)
    public void should_Throw_EmptyStackException(){
        assertThat(stack.pop()).isEqualTo("Hi");
    }

    @Test
     public void check_push_operation(){
        stack.push("Shrikar");
        assertThat(stack.isEmpty()).isFalse();
    }

     @Test
     public void check_pop_operation(){
         stack.push("Shrikar");
         assertThat(stack.pop()).isEqualTo("Shrikar");
     }

     @After
     public void print_stack_size(){
        int result = stack.size();
         System.out.println(result);
        log.info("Size of satck " , result);
     }

}
