/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acae.eva.connector;

import br.com.acae.eva.connector.qualifier.Json;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Vitor
 */
@RequestScoped @Json
public class JsonRestClient extends RestClient {

    @Override
    protected MediaType getType() { return MediaType.APPLICATION_JSON_TYPE; }
}