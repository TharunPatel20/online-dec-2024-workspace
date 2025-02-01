package com.demo.spring_boot_rest_collection_project.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductPojo {
	private int productId;
	private String productName;
	private int productCost;
	private String productImageUrl;
}
