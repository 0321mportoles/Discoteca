package DI2021.Discoteca.utils;

public class AlbumUtils {
	public static boolean ValidarURLMetadata(String metaInfo) {
		//Este método debe validar que las url de metadatos de los albums referencian 
		// al sitio web del disco en la wikipedia.
		String cs = "https://en.wikipedia.org/wiki/";
		if ( metaInfo.contentEquals(cs) ) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
