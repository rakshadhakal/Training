package com.eprabidhi.ecom.controller;



import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.eprabidhi.ecom.model.Category;
import com.eprabidhi.ecom.model.Product;
import com.eprabidhi.ecom.service.CategoryService;
import com.eprabidhi.ecom.service.ProductService;
import com.eprabidhi.ecom.service.UploadService;



@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@Autowired
	private CategoryService categoryService;

	
	@Autowired
	UploadService uploadService;
	
	@GetMapping("/admin/product/add")
	public String productPage(Model model) {
		List<Product> productList= productService.getAllProducts();
		model.addAttribute("product_list",productList);
		List<Category> catList= categoryService.getAllCategoryies();
		model.addAttribute("cat_list",catList);
		return "admin/product";
	}
	
	@PostMapping("/admin/product/add")
	public String saveProduct(
			@RequestParam("product_name") String name,
			@RequestParam("product_description") String description,
			@RequestParam("product_quantity") int quantity,
			@RequestParam("product_doe") String dateOfEntry,
			@RequestParam("product_image") MultipartFile image,
			@RequestParam("product_price") double price,
			@RequestParam("product_category") Category category
			) {
		Product product = new Product();
		product.setName(name);
		product.setDescription(description);
		product.setQuantity(quantity);
		product.setDateOfEntry(LocalDate.parse(dateOfEntry));
		product.setImage(image.getOriginalFilename());
		product.setPrice(price);
		product.setCategory(category);
		
		if(! uploadService.uploadProductImage(image)) {
			return "redirect:/admin/product/add/image_upload_failed=true";
		}
		
		
		productService.addProduct(product);
		
		return"redirect:/admin/product/add";
	}
	@GetMapping("/admin/product/show")
	public String showProducts(Model model) {
		List<Product> productList= productService.getAllProducts();
		model.addAttribute("product_list",productList);
		return "admin/product";
	}
	
	@GetMapping("/admin/product/edit/{id}")
	public String edit (Model model, @PathVariable("id") int id) {
		Product editProduct=productService.getProductById(id);
		model.addAttribute("product_edit", editProduct);
		model.addAttribute("edit", true);
		List<Product> productList = productService.getAllProducts();
		model.addAttribute("product_list", productList);
		List<Category> catList = categoryService.getAllCategoryies();
		model.addAttribute("cat_list", catList);
		return "admin/product";
	}
	
	@PostMapping("/admin/product/edit")
	public String updateProduct(
			       @RequestParam("product_id") int id,
					@RequestParam("product_name") String name,
					@RequestParam("product_description") String description,
					@RequestParam("product_quantity") int quantity,
					@RequestParam("product_doe") String dateOfEntry,
					@RequestParam(value="product_image" ,required=false) MultipartFile image,
					@RequestParam("original_image") String original_image,
					@RequestParam("product_price") double price,
					@RequestParam("product_category") Category category
					) 
             {
		        String image_name=null;
		        if(image!=null && !"".equals(image.getOriginalFilename())) {
		        	image_name=image.getOriginalFilename();
		        	uploadService.uploadProductImage(image);
		        }else {
		        	image_name=original_image;
		        }
            	 Product product= new Product(id,name,description,quantity,LocalDate.parse(dateOfEntry),image_name,price,category);
            	 productService.updateProduct(product);
				return "redirect:/admin/product/show";
			}
	
	@GetMapping("/admin/product/delete/{id}")
	public String deleteProduct(@PathVariable("id") int id ) {
		
		Product product = new Product();
		product.setId(id);
		productService.deleteProduct(product);
		return "redirect:/admin/product/show";
	}

}

