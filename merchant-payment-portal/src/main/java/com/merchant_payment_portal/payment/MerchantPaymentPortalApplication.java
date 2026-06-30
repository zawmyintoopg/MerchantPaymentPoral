package com.merchant_payment_portal.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MerchantPaymentPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantPaymentPortalApplication.class, args);
	}

}
