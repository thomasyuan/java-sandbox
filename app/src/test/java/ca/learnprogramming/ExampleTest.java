package ca.learnprogramming;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExampleTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    Example sample;

    final static String mockedValue = "HelloMockito";

    @Test
    public void test_normalMethod() {
        // The real implementation always return "I'm Final class"
        // When the mock works, we should get "HelloMockito" here.
        when(sample.normalMethod()).thenReturn(mockedValue);
        assertEquals(mockedValue, sample.normalMethod());
    }

    @Test
    public void test_finalMethod() {
        when(sample.finalMethod(anyString())).thenReturn(10);
        // The real implementation always return the length of the input string.
        // In this case, if the mock doesn't work, it should return 5.
        // When the mock works, we should get 10 here.
        assertEquals(10, sample.finalMethod("Hello"));
    }

    @Test
    public void test_staticMethod_withoutParameter() {
        // without mock
        assertEquals(1, Example.staticMethod());

        try (MockedStatic<Example> example = Mockito.mockStatic(Example.class)) {
            example.when(Example::staticMethod).thenReturn(100);
            // The real implementation always return 1.
            // When the mock works, we should get 100 here.
            assertEquals(100, Example.staticMethod());
        }

        // without mock
        assertEquals(1, Example.staticMethod());
    }

    @Test
    public void test_staticMethod_withParameter() {
        // without mock
        assertEquals(100, Example.staticMethod(100));

        try (MockedStatic<Example> example = Mockito.mockStatic(Example.class)) {
            example.when(() -> Example.staticMethod(anyInt())).thenReturn(0);
            // The real implementation always return the input, in this case, it's 100.
            // When the mock works, we should get 0 here.
            assertEquals(0, Example.staticMethod(100));
        }

        // without mock
        assertEquals(20, Example.staticMethod(20));
    }
}
