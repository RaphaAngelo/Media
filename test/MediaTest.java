import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediaTest {
    @Test
    void testMedia() {
        assertEquals(5.0, Media.calcularMedia(4, 6));
    }
}