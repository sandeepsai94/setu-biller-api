package com.setu.biller.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.logging.Logger;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtUtil {

    private String SECRET_KEY = "setusecretcode";
    private String SCHEMED_ID = "setuschemedid";

    Logger log = Logger.getLogger(JwtUtil.class.getName());
    
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
    private Claims extractAllClaims(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }

    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, username);
    }

    private String createToken(Map<String, Object> claims, String subject) {

		/*
		 * return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new
		 * Date(System.currentTimeMillis())) .setExpiration(new
		 * Date(System.currentTimeMillis() + 1000 * 60 * 30))
		 * .signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
		 */
    	
    	Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
		String token = JWT.create().withAudience(SCHEMED_ID).withIssuedAt(new Date())
				.withClaim("jti", UUID.randomUUID().toString()).sign(algorithm);
		return token;
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
    	token = token.replace("Bearer ", "");
		Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
		JWTVerifier verifier = JWT.require(algorithm).acceptLeeway(10).withAudience(this.SCHEMED_ID).build(); // Reusable
																												// verifier
		try {																										// instance
		DecodedJWT jwt = verifier.verify(token);
		return true;
		}catch (TokenExpiredException e) {
			log.info("Token:[{}] is expired: " + token );
		  } catch (Exception e) {
			log.info("Token:[{}] is illegal: "+  token);
		  }
		  return false;
    }
}