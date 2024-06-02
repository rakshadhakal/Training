package com.eprabidhi.ecom.service;

import java.io.File;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class UploadServiceImpl implements UploadService {

	@Override
	public boolean uploadProductImage(MultipartFile image) {
		File image_dir = new File(UPLOAD_DIR+File.separator+"product_image");
		if(!image_dir.exists()) {
			//create image folder if it doesnot exists
			image_dir.mkdirs();
		}
		String file_name=image.getOriginalFilename();
		File upload_file=new File(image_dir.getAbsoluteFile()+File.separator+file_name);
		try {
			image.transferTo(upload_file);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean uploadUserImage(MultipartFile image) {
		// TODO Auto-generated method stub
		return false;
	}

}
