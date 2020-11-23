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

## Troubleshooting

## Next steps
## Contributing
