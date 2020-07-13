package com.example.course.entities.enums;

public enum OrderStatus {

	// Associa 0 - WAITING_PA 1 - PAID e assim sucessivamente mas pode trazer problema
	// quando algum programador iniciante adicionar algum enum novo então é melhor colocar
	// o numero entre parenteses para evitar esse tipo de erro.
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus (int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {
		for (OrderStatus value: OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}
