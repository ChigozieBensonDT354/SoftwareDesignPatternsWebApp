package com.example.softwarePatterns;

import java.util.ArrayList;
import java.util.List;

public interface SortingStrategy {
	
	
	public ArrayList<StockItem> ascendingSort(ArrayList<StockItem>items);
	public ArrayList<StockItem> descendingSort(ArrayList<StockItem>items);

}
