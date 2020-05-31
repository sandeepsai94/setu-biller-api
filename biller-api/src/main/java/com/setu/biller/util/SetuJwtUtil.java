/*
 * package com.setu.biller.util;
 * 
 * import com.auth0.jwt.JWT; import com.auth0.jwt.JWTVerifier; import
 * com.auth0.jwt.algorithms.Algorithm; import
 * com.auth0.jwt.exceptions.JWTVerificationException; import
 * com.auth0.jwt.exceptions.TokenExpiredException; import
 * com.auth0.jwt.interfaces.DecodedJWT; import
 * com.setu.biller.controller.CustomerController;
 * 
 * import java.util.Date; import java.util.UUID; import
 * java.util.logging.Logger;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * 
 * @Service public class SetuJwtUtil { private String schemedId; private String
 * secret;
 * 
 * Logger log = Logger.getLogger(SetuJwtUtil.class.getName());
 * 
 * public SetuJwtUtil(String secret, String schemedId) { this.schemedId =
 * schemedId; this.secret = secret; }
 * 
 * public void setSchemedId(String schemedId) { this.schemedId = schemedId; }
 * 
 * public void setSecret(String secret) { this.secret = secret; }
 * 
 * public String yieldBearerToken() { Algorithm algorithm =
 * Algorithm.HMAC256(this.secret); String token =
 * JWT.create().withAudience(this.schemedId).withIssuedAt(new Date())
 * .withClaim("jti", UUID.randomUUID().toString()).sign(algorithm); return
 * "Bearer " + token; }
 * 
 * public boolean verifyBearerToken(String bearerToken) throws
 * JWTVerificationException { bearerToken = bearerToken.replace("Bearer ", "");
 * Algorithm algorithm = Algorithm.HMAC256(this.secret); JWTVerifier verifier =
 * JWT.require(algorithm).acceptLeeway(10).withAudience(this.schemedId).build();
 * // Reusable // verifier try { // instance DecodedJWT jwt =
 * verifier.verify(bearerToken); return true; }catch (TokenExpiredException e) {
 * log.info("Token:[{}] is expired: " + bearerToken ); } catch (Exception e) {
 * log.info("Token:[{}] is illegal: "+ bearerToken); } return false;
 * 
 * } }
 */