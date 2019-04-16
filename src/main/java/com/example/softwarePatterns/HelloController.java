package com.example.softwarePatterns;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



import come.example.softwarePatterns.items.StockItemRepository;



@Controller
public class HelloController {
	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	

private UserRepository userRepository;
	@Autowired 
	private UserService userservice;
	
//    @GetMapping({"/", "/hello"})
//    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
//        model.addAttribute("name", name);
//        return "hello";
//    }
	
	
    
    @GetMapping(value="/index")
    public String home() {
    	return "index";
    }
    
    @RequestMapping(value="/login", method = RequestMethod.POST)
	public String verifyLogin(@RequestParam String name, @RequestParam String password, HttpServletRequest request, Model model) {
		User user = userservice.login(name, password);
		
	
		if(user == null) {
			model.addAttribute("loginError", "Error logging in, please try again");
			return "login";
			
			
		}
	int id;
		User loggedInUser = user;
		id = loggedInUser.getId();
		model.addAttribute(name, user.getName());
		System.out.print(loggedInUser.getId());
		
		request.getSession().setAttribute("user", loggedInUser);
		session = request.getSession(true);
		//session.setAttribute("loggedInUser", user);
		
		return "success";
	}
	ArrayList<StockItem>items = new ArrayList<>();
    @RequestMapping(value = "/login", method=RequestMethod.GET)
	public String showLogin() {
		return "login";
	}
    
    @GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		
		StockItem item = new StockItem();
		item.setTitle("First item");
		//itemRepo.save(item);
		
		return "Saved";
	}
    private HttpSession session;
    
    
    @GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}
    
    @RequestMapping(value="/register", method = RequestMethod.POST)
	public String registration(@RequestParam String name, @RequestParam String password,@RequestParam String email, @RequestParam String address, @RequestParam String payment) {
		User user = userservice.register(name, password, email,address,payment);
		if(user == null) {
			
			return "login";
			
		}
		else {
		//userservice.addUser(user);s
		userservice.addUser(user);
		return "success";
		}
		
	}
    @RequestMapping(value= "/addItem", method = RequestMethod.POST)
    public String addItem(HttpServletRequest request, Model model) {
    	
    	//User u = (User) request.getSession().getAttribute("user");
    	//System.out.println("WORDS" + u.getEmail()); 
		
		//StockItem item = new StockItem();
		//item.setTitle("First item");
		//itemRepo.save(item);
    	StockItem item = new StockItem();
    	item.setCategory("food");
    	item.setTitle("pizza");
    	StockItem item2 = new StockItem();
    	item2.setCategory("food");
    	item2.setTitle("burger");
    	items.add(item);
    	items.add(item2);
    	model.addAttribute("lists",this.items);
    	User u = (User) request.getSession().getAttribute("user");
    	User u2 = (User) session.getAttribute("user");
    	System.out.println("u2 " + u2.getEmail());
    	System.out.println(u.getEmail());
    	Cart cart = new Cart();
    	cart.getItems().add(item);
    	cart.getItems().add(item2);
    	u.setCart(cart);
    	Order order = new Order();
    	order.setCart(cart);
    	//order.getCart().getItems();
    	u.getOrders().add(order);
    	userRepository.save(u);
    	
    	System.out.print(u.getOrders().toString());
		return "itemHome";
    	
    }
    @RequestMapping(value = "/success")
    public String redirect(Model model) {
    	
		return "itemhome";
    }
   
    @RequestMapping(value = "/startCart", method = RequestMethod.POST)
    public String cartHome(HttpServletRequest request, Model model) {
    	StockItem item = new StockItem();
    	item.setCategory("food");
    	item.setTitle("pizza");
    	StockItem item2 = new StockItem();
    	item2.setCategory("food");
    	item.setImage("http://topqualitypizzas.ca/wp-content/uploads/2015/11/GARDEN-VEGGIE-SUPREME.jpg");
        item2.setImage("https://png.pngtree.com/element_pic/17/02/23/8a1ce248ab44efc7b37adad0b7b2d933.jpg");
        
    	item2.setTitle("burger");
    	items.add(item);
    	items.add(item2);
    	model.addAttribute("lists",this.items);
    	User u = (User) request.getSession().getAttribute("user");
    	//User u2 = (User) session.getAttribute("user");
    	return "cart";
    	
    }

}