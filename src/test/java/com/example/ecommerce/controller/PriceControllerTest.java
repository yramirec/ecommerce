package com.example.ecommerce.controller;

import com.example.ecommerce.model.PriceResponse;
import com.example.ecommerce.service.PriceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PriceController.class)
public class PriceControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private PriceService priceService;

	@Test
	public void test01() throws Exception {
		PriceResponse priceResponse = new PriceResponse();
		priceResponse.setProductId(35455L);
		priceResponse.setBrandId(1L);
		priceResponse.setPriceList(1L);
		priceResponse.setStartDate(LocalDateTime.parse("2023-11-14T10:00:00"));
		priceResponse.setEndDate(LocalDateTime.parse("2023-11-14T23:59:59"));
		priceResponse.setPrice(BigDecimal.valueOf(100.00));
		priceResponse.setCurrency("USD");
		when(priceService.getPrice(any(LocalDateTime.class), eq(35455L), eq(1L))).thenReturn(priceResponse);

		mockMvc.perform(get("/api/prices/getPrice")
						.param("applicationDate", "2023-11-14T10:00:00")
						.param("productId", "35455")
						.param("brandId", "1"))
				.andExpect(status().isOk())
				.andExpect(content().json("{\"productId\":35455,\"brandId\":1,\"priceList\":1,\"startDate\":\"2023-11-14T10:00:00\",\"endDate\":\"2023-11-14T23:59:59\",\"price\":100.0,\"currency\":\"USD\"}"))
		;
	}
	@Test
	public void test02() throws Exception {
		PriceResponse priceResponse = new PriceResponse();
		priceResponse.setProductId(35455L);
		priceResponse.setBrandId(1L);
		priceResponse.setPriceList(1L);
		priceResponse.setStartDate(LocalDateTime.parse("2023-11-14T16:00:00"));
		priceResponse.setEndDate(LocalDateTime.parse("2023-11-14T23:59:59"));
		priceResponse.setPrice(BigDecimal.valueOf(100.00));
		priceResponse.setCurrency("USD");
		when(priceService.getPrice(any(LocalDateTime.class), eq(35455L), eq(1L))).thenReturn(priceResponse);

		mockMvc.perform(get("/api/prices/getPrice")
						.param("applicationDate", "2023-11-14T16:00:00")
						.param("productId", "35455")
						.param("brandId", "1"))
				.andExpect(status().isOk())
				.andExpect(content().json("{\"productId\":35455,\"brandId\":1,\"priceList\":1,\"startDate\":\"2023-11-14T16:00:00\",\"endDate\":\"2023-11-14T23:59:59\",\"price\":100.0,\"currency\":\"USD\"}"))
		;
	}

	@Test
	public void test03() throws Exception {
		PriceResponse priceResponse = new PriceResponse();
		priceResponse.setProductId(35455L);
		priceResponse.setBrandId(1L);
		priceResponse.setPriceList(1L);
		priceResponse.setStartDate(LocalDateTime.parse("2023-11-14T21:00:00"));
		priceResponse.setEndDate(LocalDateTime.parse("2023-11-14T23:59:59"));
		priceResponse.setPrice(BigDecimal.valueOf(100.00));
		priceResponse.setCurrency("USD");
		when(priceService.getPrice(any(LocalDateTime.class), eq(35455L), eq(1L))).thenReturn(priceResponse);

		mockMvc.perform(get("/api/prices/getPrice")
						.param("applicationDate", "2023-11-14T21:00:00")
						.param("productId", "35455")
						.param("brandId", "1"))
				.andExpect(status().isOk())
				.andExpect(content().json("{\"productId\":35455,\"brandId\":1,\"priceList\":1,\"startDate\":\"2023-11-14T21:00:00\",\"endDate\":\"2023-11-14T23:59:59\",\"price\":100.0,\"currency\":\"USD\"}"))
		;
	}

	@Test
	public void test04() throws Exception {
		PriceResponse priceResponse = new PriceResponse();
		priceResponse.setProductId(35455L);
		priceResponse.setBrandId(1L);
		priceResponse.setPriceList(1L);
		priceResponse.setStartDate(LocalDateTime.parse("2023-11-15T10:00:00"));
		priceResponse.setEndDate(LocalDateTime.parse("2023-11-15T23:59:59"));
		priceResponse.setPrice(BigDecimal.valueOf(100.00));
		priceResponse.setCurrency("USD");
		when(priceService.getPrice(any(LocalDateTime.class), eq(35455L), eq(1L))).thenReturn(priceResponse);

		mockMvc.perform(get("/api/prices/getPrice")
						.param("applicationDate", "2023-11-15T10:00:00")
						.param("productId", "35455")
						.param("brandId", "1"))
				.andExpect(status().isOk())
				.andExpect(content().json("{\"productId\":35455,\"brandId\":1,\"priceList\":1,\"startDate\":\"2023-11-15T10:00:00\",\"endDate\":\"2023-11-15T23:59:59\",\"price\":100.0,\"currency\":\"USD\"}"))
		;
	}

	@Test
	public void test05() throws Exception {
		PriceResponse priceResponse = new PriceResponse();
		priceResponse.setProductId(35455L);
		priceResponse.setBrandId(1L);
		priceResponse.setPriceList(1L);
		priceResponse.setStartDate(LocalDateTime.parse("2023-11-16T21:00:00"));
		priceResponse.setEndDate(LocalDateTime.parse("2023-11-16T23:59:59"));
		priceResponse.setPrice(BigDecimal.valueOf(100.00));
		priceResponse.setCurrency("USD");
		when(priceService.getPrice(any(LocalDateTime.class), eq(35455L), eq(1L))).thenReturn(priceResponse);

		mockMvc.perform(get("/api/prices/getPrice")
						.param("applicationDate", "2023-11-16T21:00:00")
						.param("productId", "35455")
						.param("brandId", "1"))
				.andExpect(status().isOk())
				.andExpect(content().json("{\"productId\":35455,\"brandId\":1,\"priceList\":1,\"startDate\":\"2023-11-16T21:00:00\",\"endDate\":\"2023-11-16T23:59:59\",\"price\":100.0,\"currency\":\"USD\"}"))
		;
	}
}