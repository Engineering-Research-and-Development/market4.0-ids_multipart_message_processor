package it.eng.idsa.multipart.util;

/**
 * 
 * @author Milan Karajovic and Gabriele De Luca
 *
 */

public enum MultipartMessageKey {
	
	EMPTY(""),
	NAME_HEADER("header"),
	NAME_PAYLOAD("payload"),
	NAME_SIGNATURE("signature"),
	CONTENT_TYPE("Content-Type"),
	FORWARD_TO("Forward-To"),
	CONTENT_DISPOSITION("Content-Disposition"),
	CONTENT_TRANSFER_ENCODING("Content-Transfer-Encoding"),
	CONTENT_LENGTH("Content-Length");
 
    public final String label;
 
    private MultipartMessageKey(String label) {
        this.label = label;
    }
    
}

