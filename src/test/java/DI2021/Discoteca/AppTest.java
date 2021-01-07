package DI2021.Discoteca;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import DI2021.Discoteca.utils.AlbumUtils;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    public void shouldBeValid() {
    	String metaInfo = null;
		AlbumUtils.ValidarURLMetadata(metaInfo);
    	assertTrue("La direccion es correcta", true);
    }
    
    public void shouldBeInvalid() {
    	String metaInfo = null;
		AlbumUtils.ValidarURLMetadata(metaInfo);
    	assertTrue("La direccion es incorrecta", false);
    }
}
