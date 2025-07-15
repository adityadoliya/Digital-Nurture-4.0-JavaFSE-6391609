package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class AlertManagerTest {

    @Test
    public void testTriggerAlert() {
        NotificationService mockService = mock(NotificationService.class);
        AlertManager manager = new AlertManager(mockService);

        //  Even without doNothing(), this works — Mockito by default does nothing for voids.
        doNothing().when(mockService).send(anyString());

        manager.triggerAlert("System Down");

        // Verify that the void method was called
        verify(mockService).send("System Down");
    }
}

