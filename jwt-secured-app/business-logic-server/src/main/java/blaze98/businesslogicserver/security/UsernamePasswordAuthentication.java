package blaze98.businesslogicserver.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class UsernamePasswordAuthentication extends UsernamePasswordAuthenticationToken {



    public UsernamePasswordAuthentication(
            Object principal,
            Object credentials,
            Collection<? extends GrantedAuthority> authorities) {

        // sets authentication object as authenticated!
        super(principal, credentials, authorities);
    }

    public UsernamePasswordAuthentication(
            Object principal,
            Object credentials) {

        super(principal, credentials);
    }

}
