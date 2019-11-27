package com.life.data.productxclient;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.life.pojo.envelope.Envelope;
import com.life.pojo.envelope.Message;
import com.life.pojo.envelope.Status;
import com.life.utils.ResponseCode;
import com.life.utils.RestAPI;

@Service("ProductxClientService")
public class ProductxClientService implements IProductxClientData{
private RestAPI rest;
	private Environment env;
	private Logger log;

	@Value("${log-activator.activate}")
	String logFlag;

	@Autowired
	public ProductxClientService(RestAPI rest,Environment env){

		this.rest = rest;
		this.env = env;
		this.log = LoggerFactory.getLogger("com.life.logger");
	}

	@Override
	public Boolean isValidProductByClient(String idClient,String idProduct,String productType){
		Boolean result = false;
		try{
			if("true".equals(logFlag)){
				log.info("Start isValidProductByClient service call");
			}			
			ParameterizedTypeReference<Message<Status,Boolean>> ptr = new ParameterizedTypeReference<Message<Status, Boolean>>(){};
			Envelope<Status,Boolean> response = rest.call(env.getProperty("config.svc.rest.client-svc.endpoints.is-valid-product"), HttpMethod.GET, null, ptr, idClient,idProduct,productType);			
			if(ResponseCode.SUCCESS.equals(response.getHeader().getCode())){
				result= response.getBody();
				if("true".equals(logFlag)){
					log.info("End isValidProductByClient service call");
				}
			} else {
				log.error("isValidProductByClient Error , code: "+response.getHeader().getCode()+" result: " + response.getHeader().getResult()); 
			}

		}catch (Exception e) {
			log.error("isValidProductByClient Error method fail" + e.getMessage(), e);
		}
		return result;
	}


}