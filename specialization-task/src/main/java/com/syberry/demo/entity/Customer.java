package com.syberry.demo.entity;

import javax.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Customer {

	@Id
	Integer id;
	String name;
}
