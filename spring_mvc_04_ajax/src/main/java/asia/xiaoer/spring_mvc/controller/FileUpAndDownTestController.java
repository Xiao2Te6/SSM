package asia.xiaoer.spring_mvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;


/**
 * @author : XiaoEr
 * @date : 2023/3/6
 * <p>
 * 文件上传和下载测试
 */
@Controller
public class FileUpAndDownTestController {

    /**
     * 下载测试
     * @param session 通过session获取完整的文件路径和名称
     * @return ResponseEntity 请求头中完整的报文信息
     * @throws IOException
     */
    @GetMapping("/test/download")
    public ResponseEntity<byte[]> downloadTest(HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("img");
        String fileName = realPath + File.separator + "1.jpg";
        //创建输入流
        InputStream is = new FileInputStream(fileName);
        //创建字节数组
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=1.jpg");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }

    @PostMapping("/test/upload")
    public String uploadTest(MultipartFile photo, HttpSession session) throws IOException {
        //获取文件名
        String filename = photo.getOriginalFilename();

        //截取文件类型
        String hzName = filename.substring(filename.lastIndexOf("."));

        //生成UUID拼接文件类型生成新的文件名
        UUID uuid = UUID.randomUUID();
        filename = uuid + hzName;

        //获取服务器图片将要保存的项目路径，
        File dir = new File(session.getServletContext().getRealPath("img"));
        //判断文件夹是否存在
        if(!dir.exists()){
            dir.mkdirs();
        }
        //创建要写入文件的File对象
        File file = new File(dir,filename);
        photo.transferTo(file);
        return "hello";
    }

}
