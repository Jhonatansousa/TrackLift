package myrealproject.tracklift.security;

public class TokenUtil {

    public static final String ISSUER = "TrackLift";
    public static final long EXPIRATION = 1000 * 60 * 60 * 4;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String SECRET_KEY = "0123456789012345678901234567890123";
}
