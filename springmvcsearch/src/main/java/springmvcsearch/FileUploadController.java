package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileUploadController 
{
	@RequestMapping("/fileform")
	public String showUploadForm()
	{
		
		return "fileform";
	}

}
