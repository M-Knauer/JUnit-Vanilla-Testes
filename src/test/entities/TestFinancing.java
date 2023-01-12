package test.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class TestFinancing {

	@Test
	public void constructorShouldCreatCorrectlyWhenCorrectDatas() {
		// Arrange
		Double totalAmount = 100000D;
		Double income = 2000D;
		Integer month = 80;
		
		// Act
		Financing f = new Financing(totalAmount, income, month);
		
		// Assert
		Assertions.assertTrue(f != null);
	}
	
	@Test
	public void constructorShouldThrowsExceptionsWhenIncorrectDatas() {
		// Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			// Arrange
			Double totalAmount = 100000D;
			Double income = 2000D;
			Integer month = 30;
			
			// Act
			new Financing(totalAmount, income, month);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateValueWhenCorrectData() {
		// Arrange
		Double totalAmount = 100000D;
		Double income = 2000D;
		Integer month = 80;
		Double newTotalAmount = 90000D; 
		Financing f = new Financing(totalAmount, income, month);
		
		// Act
		f.setTotalAmount(newTotalAmount);
		
		// Assert
		Assertions.assertEquals(newTotalAmount, f.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowsExceptionsWhenIncorrectData() {
		// Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			// Arrange
			Double totalAmount = 100000D;
			Double income = 2000D;
			Integer month = 80;
			Double newTotalAmount = 1100000D;
			Financing f = new Financing(totalAmount, income, month);
			
			// Act
			f.setTotalAmount(newTotalAmount);
		});
	}
	
	@Test
	public void setIncomeShouldUpdateValueWhenValid() {
		// Arrange
		Double totalAmount = 100000D;
		Double income = 2000D;
		Double newIncome = 3000D;
		Integer month = 80;
		Financing f = new Financing(totalAmount, income, month);
		
		// Act
		f.setIncome(newIncome);
		
		// Assert
		Assertions.assertEquals(newIncome, f.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowsExceptionsWhenNotValidValue() {
		// Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			// Arrange
			Double totalAmount = 100000D;
			Double income = 2000D;
			Double newIncome = 1000D;
			Integer month = 80;
			Financing f = new Financing(totalAmount, income, month);
			
			// Act
			f.setIncome(newIncome);
		});
	}
	@Test
	public void setMonthShouldUpdateMonthWhenValid() {
		// Arrange
		Double totalAmount = 100000D;
		Double income = 2000D;
		Integer month = 80;
		Integer newMonth = 80;
		Financing f = new Financing(totalAmount, income, month);
		
		// Act
		f.setMonths(newMonth);
		
		// Assert
		Assertions.assertEquals(newMonth, f.getMonths());
	}
	
	@Test
	public void setMonthShouldThrowsExceptionsWhenMonthNotValid() {
		// Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			// Arrange
			Double totalAmount = 100000D;
			Double income = 2000D;
			Integer newMonth = 10;
			Integer month = 80;
			Financing f = new Financing(totalAmount, income, month);
			
			// Act
			f.setMonths(newMonth);
		});
	}
	
	@Test
	public void entryShouldCalculateCorrectlyValue() {
		// Arrange
		Double totalAmount = 100000D;
		Double income = 2000D;
		Integer month = 80;
		Double expectedValue = 20000D;
		Double entry;
		Financing f = new Financing(totalAmount, income, month);
		
		// Act
		entry = f.entry();
		
		// Assert
		Assertions.assertEquals(expectedValue, entry);
		
	}
	
	@Test
	public void quotaShouldCalculateCorrectlyInstallmentValue() {
		// Arrange
		Double totalAmount = 100000D;
		Double income = 2000D;
		Integer month = 80;
		Double expectedValue = 1000D;
		Double quota;
		Financing f = new Financing(totalAmount, income, month);
		
		// Act
		quota = f.quota();
		
		// Assert
		Assertions.assertEquals(expectedValue, quota);
	}
	
}
