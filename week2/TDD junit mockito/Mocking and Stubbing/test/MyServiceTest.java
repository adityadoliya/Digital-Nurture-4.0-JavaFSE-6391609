package org.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Use mock in service
        MyService service = new MyService(mockApi);

        // Step 4: Test service method
        String result = service.fetchData();

        // Step 5: Assert result
        assertEquals("Mock Data", result);

        
    }
}
