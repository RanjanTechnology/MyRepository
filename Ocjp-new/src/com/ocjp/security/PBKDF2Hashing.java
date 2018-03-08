package com.ocjp.security;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.xml.bind.ValidationException;

public class PBKDF2Hashing {
	
	 public static String hash1 (final char[] message, byte[] salt, int iterations, int keyLength, String pseudoRandomFunction) throws ValidationException {
	        if (message == null || message.length == 0)
	            throw new ValidationException(pseudoRandomFunction);
	       
	        String s= "1234345678";
	        if (salt == null || salt.length == 0)
	            salt = s.getBytes();
	 
	        if (iterations == 0)
	            iterations = 10000;
	 
	        // keyLength in bits
	        if (keyLength == 0)
	            keyLength = 256;
	 
	        if (pseudoRandomFunction == null || pseudoRandomFunction.length() == 0) {
	                pseudoRandomFunction = "HmacSHA256";
	        }
	 
	        String hashValue = hash(message, salt, iterations, keyLength, pseudoRandomFunction);
	 
	        return hashValue;
	    }
	 
	    private static String hash (final char[] password, final byte[] salt, final int iterations, final int keyLength, final String pseudoRandomFunction) {
	        try {
	            SecretKeyFactory skf = SecretKeyFactory.getInstance(pseudoRandomFunction);
	            PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, keyLength);
	            SecretKey key = skf.generateSecret(spec);
	            byte[] res = key.getEncoded();
	             
	            return toHex(salt) + ":" + toHex(res);
	  
	       } catch( NoSuchAlgorithmException | InvalidKeySpecException e ) {
	           throw new RuntimeException( e );
	       }
	    }
	    
	    private static String toHex(byte[] array) throws NoSuchAlgorithmException
	    {
	        BigInteger bi = new BigInteger(1, array);
	        String hex = bi.toString(16);
	        int paddingLength = (array.length * 2) - hex.length();
	        if(paddingLength > 0)
	        {
	            return String.format("%0"  +paddingLength + "d", 0) + hex;
	        }else{
	            return hex;
	        }
	    }
	    
}
