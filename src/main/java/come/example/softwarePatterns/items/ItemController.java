package come.example.softwarePatterns.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.softwarePatterns.StockItemRepository;



@RestController
public class ItemController {
	@Autowired
	private StockItemRepository repo;
//	@RequestMapping(method=RequestMethod.POST, value="/users/{userId}/thoughts")
//	public void addItem(@RequestBody Thought thought, @PathVariable int userId) {
//		//user.setThoughts((Set<Thought>) thought);
//		thought.setUser(new User(userId, "chig", "email", "password"));
//		//thoughtService.addThought(thought);
//	}
	
}
