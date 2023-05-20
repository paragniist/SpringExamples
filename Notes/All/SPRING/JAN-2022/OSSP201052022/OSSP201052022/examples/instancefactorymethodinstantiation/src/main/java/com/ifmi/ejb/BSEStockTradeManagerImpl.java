package com.ifmi.ejb;

import java.security.SecureRandom;

// assume: ejb
public class BSEStockTradeManagerImpl implements StockTradeManager {
	@Override
	public double getStockPrice(String stockName) {
		return new SecureRandom().nextDouble() * 100;
	}
}
