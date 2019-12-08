package services;



import controllers.LoginCredentials;
import io.jsonwebtoken.impl.TextCodec;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.TimingOutCallback;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;


// jwt

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.rmi.ConnectException;
import java.security.Key;
import io.jsonwebtoken.*;
import org.apache.xmlrpc.client.XmlRpcClientException;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Date;
// end

import java.net.MalformedURLException;
import java.net.URL;


public class LoginService {


    public static String Token ;

    public static String SECRET_KEY = "oeRaYY7Wo24sDqKSX3IM9ASGmdGPmkTd9jo1QTy4b7P9Ze5_9hKolVX8xNrQDcNRfVEdTZNOuOyqEGhXEbdJI-ZQ19k_o9MI0y3eZN2lp9jow55FfXMiINEdt1XR85VipRLSOkT6kSpzs2x-jbLDiz9iFVzkd81YKxMgPA7VfZeQUm4n-mOmnWMaVX30zGFU4L3oPBctYKkl4dYfqYWqRNfrgPJVi5DGFjywgxx0ASEiJHtV72paI3fDR2XwlSkyhhmY-ICjCRmsJN4fX1pdoL8a18-aQrvyu4j0Os6dVPYIoPvvY0SAZtWYKHfM15g7A3HD4cVREf9cUsprCRK93w";



    public boolean connection(String userName ,String pw) throws XmlRpcException, MalformedURLException, XmlRpcClientException {

        try {

            XmlRpcClient client = new XmlRpcClient();
            XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();

            config.setServerURL(new URL("http", "sales.crm.192.168.66.160.xip.io", "/xmlrpc/2/common"));
           // config.setServerURL(new URL("https", "testtest3.odoo.com", "/xmlrpc/2/common"));
            client.setConfig(config);
            //Integer uid = (Integer) client.execute("login", new Object[]{"testtest3", userName, pw});
            Integer uid = (Integer) client.execute("login", new Object[]{"odoo", userName, pw});
            LoginCredentials credentials = new LoginCredentials();
            credentials.setUid(uid);
            credentials.setPassword(pw);


            // aka token



            //The JWT signature algorithm we will be using to sign the token
            SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

            long nowMillis = System.currentTimeMillis();
            Date now = new Date(nowMillis);

            //We will sign our JWT with our ApiKey secret
            byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET_KEY);
            Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

            //Let's set the JWT Claims
            JwtBuilder builder = Jwts.builder().setId(uid.toString())
                    .setIssuedAt(now).claim("ID",uid).claim("password" ,pw)
                    .setSubject("Subject")
                    .setIssuer("Usser")
                    .signWith(signatureAlgorithm, signingKey);


            Token = builder.compact();
            System.out.println(Token);



            //end aka token


            System.out.println("User Id is :" + uid);
            return true;

        }
        catch (MalformedURLException ex) {
            ex.printStackTrace();

        } catch (XmlRpcException ex) {
            ex.printStackTrace();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }








}
