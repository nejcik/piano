package sample;


import com.sun.media.jfxmedia.AudioClip;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class KeyTest {

   @Test
    public void initializesItselfProperly() {

        //given
        //when
        Key key = new Key();
        //then
        assertEquals(key.getNote().size(), 24);

    }


}
