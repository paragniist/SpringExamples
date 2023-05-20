package com.ifmi.helper;

import com.ifmi.ejb.BSEStockTradeManagerImpl;

public class AgentTradingSystemServiceLocator {
	public Object lookupAgentTradingSystemServiceLocator(String jndiName) {
		// HashTable ht = new HashTable();
		// populate properties
		// InitialContext ic = new InitialContext(ht);
		if (jndiName.equals("java://bseStockTradeManager")) {
			return new BSEStockTradeManagerImpl();
		}
		return null;
	}
}
