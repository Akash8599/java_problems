package algorithms;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class EncryptionDecry {
    public static SecretKey generateKey(int n) throws NoSuchAlgorithmException {
        // Create a KeyGenerator instance for the AES algorithm
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");

        // Initialize the KeyGenerator with the specified key size (n)
        keyGenerator.init(n);

        // Generate a secret key
        SecretKey key = keyGenerator.generateKey();

        // Return the generated secret key
        return key;
    }

    public static void main(String[] args) {

        double  d = 295.04;
        int b = 300;
        byte c = (byte) d;
        byte f = (byte) b;

        System.out.println(c + " " + f);
        try {
            // Example: Generate a 128-bit AES key
            SecretKey generatedKey = generateKey(128);

            // Print the generated key (this is just for demonstration purposes)
            byte[] keyBytes = generatedKey.getEncoded();
            System.out.println("Generated Key: " + bytesToHex(keyBytes));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    // Helper method to convert bytes to hexadecimal string
    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexStringBuilder = new StringBuilder(2 * bytes.length);
        for (byte b : bytes) {
            hexStringBuilder.append(String.format("%02x", b));
        }
        return hexStringBuilder.toString();
    }
}
