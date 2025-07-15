package org.example;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingApplicationTest {

    @Test
    public void testGreetingService() {

        // Step 1: Create a mock
        GreetingService mockService = mock(GreetingService.class);

        // Step 2: Inject the mock
        GreetingApplication app = new GreetingApplication(mockService);

        // Step 3: Define behavior (Stubbing)
        when(mockService.greet(anyString())).thenReturn("Hello User");
        
        // Step 4: Test service method
        String result1 = app.greet("Aditya 6391609");
        String result2 = app.greet("John");
        String result3 = app.greet("RandomName");

        // Step 5: Assert
        assertEquals("Hello User", result1);
        assertEquals("Hello User", result2);
        assertEquals("Hello User", result3);

        // Step 6: Verify interaction (optional)
        verify(mockService, times(3)).greet(anyString());

    }
}