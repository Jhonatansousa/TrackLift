package myrealproject.tracklift.security;

public class TrackLiftToken {
    private String token;
    public TrackLiftToken(String token) {
        super();
        this.token = token;
    }
    public TrackLiftToken() {
        super();
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
}
