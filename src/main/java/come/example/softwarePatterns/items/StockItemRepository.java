package come.example.softwarePatterns.items;

import org.springframework.data.repository.CrudRepository;

import com.example.softwarePatterns.StockItem;

public interface StockItemRepository extends CrudRepository<StockItem,Integer>{
	StockItem findByTitle(String title);
	
	}
