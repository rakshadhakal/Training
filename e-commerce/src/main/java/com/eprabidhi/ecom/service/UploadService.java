package com.eprabidhi.ecom.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
	String UPLOAD_DIR = "C://Users//DELL//OneDrive//Desktop//e-commerce";
	public boolean uploadProductImage(MultipartFile image);
	
	public boolean uploadUserImage(MultipartFile image);
}
