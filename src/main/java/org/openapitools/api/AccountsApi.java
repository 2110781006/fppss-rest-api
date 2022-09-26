/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.openapitools.DbConnector;
import org.openapitools.model.ProviderAccountObject;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.jooq.impl.DSL.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-15T21:38:43.045400+02:00[Europe/Vienna]")
@Validated
@Api(value = "accounts", description = "the accounts API")
public interface AccountsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /accounts/getProviderAccounts
     * get all provider accounts
     *
     * @return successfully query (status code 200)
     */
    @ApiOperation(value = "", nickname = "getProviderAccounts", notes = "get all provider accounts", response = ProviderAccountObject.class, responseContainer = "List", tags={ "developers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successfully query", response = ProviderAccountObject.class, responseContainer = "List") })
    @GetMapping(
        value = "/accounts/getProviderAccounts",
        produces = { "application/json" }
    )
    default ResponseEntity<List<ProviderAccountObject>> getProviderAccounts()
    {
        try
        {
            DbConnector connector = new DbConnector(System.getenv("DB_URL"), System.getenv("DB_USER"), System.getenv("DB_PASSWORD"));
            connector.open();

            Connection conn = connector.getConnection();

            DSLContext query = DSL.using(conn);

            Result result = query
                    .select(field("p.id").as("providerId"))
                    .select(field("p.name").as("providerName"))
                    .select(field("p.fullname").as("providerFullname"))
                    .select(field("p.type").as("providerType"))
                    .select(field("pa.id").as("providerAccountId"))
                    .select(field("pa.username").as("providerAccountUsername"))
                    .select(field("pa.password").as("providerAccountPassword"))
                    .from(table("provider").as("p"))
                    .leftOuterJoin(table("provider_accounts").as("pa")).on(field("p.id").equal(field("pa.id"))).fetch();

            List<ProviderAccountObject> accounts = new ArrayList();

            for (var r : result)
            {
                Record record = (Record)r;
                ProviderAccountObject providerAccountObject = new ProviderAccountObject();

                providerAccountObject.setProviderId(record.get(field("providerId"), Integer.class));
                providerAccountObject.setProviderName(record.get("providerName", String.class));
                providerAccountObject.setProviderFullName(record.get("providerFullname", String.class));
                providerAccountObject.setProviderType(record.get("providerType", Integer.class));
                providerAccountObject.setProviderAccountId(record.get("providerAccountId", Integer.class));
                providerAccountObject.setProviderAccountUsername(record.get("providerAccountUsername", String.class));
                providerAccountObject.setProviderAccountPassword(record.get("providerAccountPassword", String.class));

                accounts.add(providerAccountObject);
            }

            conn.close();

            return new ResponseEntity<>(accounts, HttpStatus.OK);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }

}