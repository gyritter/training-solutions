package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderStateTest {

    @Test
    public void testCanDeleteOnNew() {
        OrderState state = OrderState.NEW;

        assertTrue(state.canDelete());
    }

    @Test
    public void testCanDeleteOnConfirmed() {
        OrderState state = OrderState.CONFIRMED;

        assertTrue(state.canDelete());
    }

    @Test
    public void testCanDeleteOnPrepared() {
        OrderState state = OrderState.PREPARED;

        assertTrue(state.canDelete());
    }

    @Test
    public void testCanDeleteOnOnboard() {
        OrderState state = OrderState.ONBOARD;

        assertFalse(state.canDelete());
    }
}
