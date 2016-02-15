package util;

/**
 * @author - Srđan Milaković
 */
public class SessionTokenGenerator {
    public static final int DEFAULT_LENGTH = 128;

    private RandomStringGenerator generator;

    public String nextSessionId() {
        return generator.nextString();
    }

    public SessionTokenGenerator() {
        this(DEFAULT_LENGTH);
    }

    public SessionTokenGenerator(int tokenLength) {
        generator = new RandomStringGenerator(tokenLength);
    }

    public int getTokenLength() {
        return generator.getLength();
    }
}
