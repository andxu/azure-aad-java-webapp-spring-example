# OAuth 2.0 Sample for Azure AD Spring Boot Starter client library for Java

## Key concepts
This sample illustrates how to use `azure-active-directory-spring-boot-starter` package to work with OAuth 2.0 and OpenID Connect protocols on Auzre.


## Getting started

### Register your application with your Azure Active Directory Tenant

Follow the guide [here](https://docs.microsoft.com/azure/active-directory/develop/quickstart-register-app).


## Examples

### Configure application.properties

```properties
spring.security.oauth2.client.registration.azure.client-id=xxxxxx-your-client-id-xxxxxx
spring.security.oauth2.client.registration.azure.client-secret=xxxxxx-your-client-secret-xxxxxx
# Please comment the following configuration when you are running locally
spring.security.oauth2.client.registration.azure.redirect-uri=https://${WEBSITE_HOSTNAME}/login/oauth2/code/{registrationId}

azure.activedirectory.tenant-id=xxxxxx-your-tenant-id-xxxxxx
```

### Run with Maven locally

```shell
mvn clean spring-boot:run -DskipTests
```

### Check the authentication and authorization

1. Open page: http://localhost:8080/login#
2. Click Azure button
3. Follow the login process

### Deploy to Azure Webapps


### <strong>*</strong> Uncomment the redirect-uri property

If you want to deploy the webapp to Azure Web App, please add the following configuration property.

```properties
spring.security.oauth2.client.registration.azure.redirect-uri=https://${WEBSITE_HOSTNAME}/login/oauth2/code/{registrationId}
```

```shell
mvn clean package azure-webapp:deploy -DskipTests
```

Open page: https://<your site name>.azure/login#

## Troubleshooting

### JsonParseException during login
If you meet this error:

```
java.util.concurrent.ExecutionException: com.microsoft.aad.msal4j.MsalClientException: com.fasterxml.jackson.core.JsonParseException: Unexpected character ('<' (code 60)): expected a valid value (JSON String, Number, Array, Object or token 'null', 'true' or 'false')
 at [Source: (String)"<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN""http://www.w3.org/TR/html4/strict.dtd">
<HTML><HEAD><TITLE>Bad Request</TITLE>
<META HTTP-EQUIV="Content-Type" Content="text/html; charset=us-ascii"></HEAD>
<BODY><h2>Bad Request</h2>
<hr><p>HTTP Error 400. The request is badly formed.</p>
</BODY></HTML>
"; line: 1, column: 2]
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395) ~[na:na]
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999) ~[na:na]
	at com.microsoft.azure.spring.autoconfigure.aad.AzureADGraphClient.acquireTokenForGraphApi(AzureADGraphClient.java:208) ~[azure-spring-boot-2.3.5.jar:na]
	at com.microsoft.azure.spring.autoconfigure.aad.AADOAuth2UserService.loadUser(AADOAuth2UserService.java:60) ~[azure-spring-boot-2.3.5.jar:na]
	at com.microsoft.azure.spring.autoconfigure.aad.AADOAuth2UserService.loadUser(AADOAuth2UserService.java:27) ~[azure-spring-boot-2.3.5.jar:na]
```
please check whether your tenant id starts or ends with space. 
 
## Next steps
## Contributing
