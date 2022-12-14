package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.entity.*;


@Controller
public class ProductServiceController {
	@Autowired
	private RestTemplate template;
	private Product productArray[];

	@RequestMapping(path="/",method=RequestMethod.GET)
	public String welcomePage() {
		return "index";
	}
	
	   public ProductServiceController() {
		super();
		// TODO Auto-generated constructor stub
	}



	   
	   
		@RequestMapping(path = "/product-home", method = RequestMethod.GET)
		public String getProductHomePage() {
			return "producthomepage";
		}
		@RequestMapping(path = "/order-home", method = RequestMethod.GET)
		public String getOrderHomePage() {
			return "orderhomepage";
		}
	      
	@GetMapping(path = "/show/products")
	    public String getMobilePlans(Model model) {
	        productArray=this.template.getForObject("http://localhost:8080/api/products",Product[].class);
	        model.addAttribute("list", productArray);
	        for (Product product : productArray) {
	            System.out.println(product);
	        }
	        return "showallproducts";
	    }
	
	@GetMapping(path = "/show/available")
	public String getProductsWithInventoryGreaterThanZero(Model model) {
		productArray = this.template.getForObject("http://localhost:8080/api/products/available", Product[].class);
		model.addAttribute("list", productArray);
		for (Product product : productArray) {
			System.out.println(product);
		}
		return "showallproducts";
	}
	
	@GetMapping(path = "/show/not-available")
	public String getProductsWithInventoryEqualToZero(Model model) {
		productArray = this.template.getForObject("http://localhost:8080/api/products/not-available", Product[].class);
		model.addAttribute("list", productArray);
		for (Product product : productArray) {
			System.out.println(product);
		}
		return "showallproducts";
	}

	@RequestMapping(path = "/save", method = RequestMethod.GET)
	public String initAddPage(Model model) {
		model.addAttribute("product", new Product());
		return "addproduct";
	}
	
	@RequestMapping(path= "/save",method = RequestMethod.POST )
	public String addProduct(@ModelAttribute("product") Product product ,Model model) {
		HttpEntity<Product> request = new HttpEntity<>(product);
		Product productObject = this.template.postForObject("http://localhost:8080/api/products/add", request,Product.class);
		model.addAttribute("message","one Record Added");
		return "addproduct";
	}
	
	@RequestMapping(path = "/update", method = RequestMethod.GET)
	public String initUpdatePage(Model model) {
		model.addAttribute("product", new Product());
		return "addproduct";
	}
	
	@RequestMapping(path= "/update",method = RequestMethod.PUT )
	public String updateProduct(@ModelAttribute("product") Product product ,Model model) {
		HttpEntity<Product> request = new HttpEntity<>(product);
		Product productObject = this.template.postForObject("http://localhost:8080/api/products/update", request,Product.class);
		model.addAttribute("message","one Record updated");
		return "updateproduct";
	}
	
	@RequestMapping(path = "/show/productCompanyName", method = RequestMethod.GET)
	public String initSearchCompanyName() {
		return "searchbyCompanyName";
	}
	
	@RequestMapping(path = "/show/productCompanyName", method = RequestMethod.POST)
	public String searchByProductCompanyName(@RequestParam("productCompanyName") String productCompanyName, Model model) {
		model.addAttribute("list", this.template.postForObject("http://localhost:8080/api/products/byCompanyName",productCompanyName ,Product[].class));
		return "showallproducts";
	}
	
	
	
	
	
	
	
	
	
	@GetMapping(path = "/list/orders")
	public String getAllOrders(Model model) {
		model.addAttribute("list", this.template.getForObject("http://localhost:5050/api/orders",Order[].class));
		return "showallorders";
	}

	@RequestMapping(path = "/list/user", method = RequestMethod.GET)
	public String initSearchByUsers() {
		return "searchbyuser";
	}

	@RequestMapping(path = "/list/user", method = RequestMethod.POST)
	public String searchByOrderUser(@RequestParam("user") String user, Model model) {
		Order[] orderList;
		String message = new StringBuilder("Order with Given user name: ").append(user).append(" Not Found").toString();
		orderList = this.template.postForObject("http://localhost:5050/api/orders/byUser", user, Order[].class);
		if (orderList.length != 0) {
			model.addAttribute("list", orderList);
			return "showallorders";
		} else {
			model.addAttribute("message", message);
			return "failure";
		}

	}

	@RequestMapping(path = "/orderId", method = RequestMethod.GET)
	public String initSearchById() {
		return "searchbyorderid";
	}

	@RequestMapping(path = "/orderId", method = RequestMethod.POST)
	public String searchByOrderId(@RequestParam("orderId") int orderId, Model model) {
		List<Order> orderList = new ArrayList<>();
		String message = new StringBuilder("Order with Given OrderId: ").append(orderId).append(" Not Found")
				.toString();
		System.out.println("Hello ");
		orderList.add(this.template.postForObject("http://localhost:5050/api/orders/byOrderId", orderId, Order.class));
		orderList.forEach(System.out::println);
		if (orderList.get(0).getOrderId()!=0) {
			model.addAttribute("list", orderList);
			return "showallorders";
		} else {
			model.addAttribute("message", message);
			return "failure";
		}

	}
}
