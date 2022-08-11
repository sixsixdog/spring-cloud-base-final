package com.sixsixdog.controller;

import com.sixsixdog.entity.CBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Package: controller
 * @ClassName: BookController
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-08 13:54
 * @Description:
 */
@RestController
public class BookController {

    private String REST_URL_PREFIX = "http://CLOUD-PAY";
    private DiscoveryClient discoveryClient;

    @Autowired
    public void setDiscoveryClient(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @Autowired
    private RestTemplate restTemplate;

    /**
     * restTemplate已开启负载均衡
     * @see com.sixsixdog.request.RestTemplateConfig#getRestTemplate
     */
    @GetMapping("/addBook")
    public CBook addBook(@RequestBody CBook cBook) {
        final ResponseEntity<CBook> rsb = restTemplate.postForEntity(REST_URL_PREFIX+"/addBook", cBook, CBook.class);
        return rsb.hasBody() ?rsb.getBody():null;
    }

    /**
     * restTemplate已开启负载均衡
     * @see com.sixsixdog.request.RestTemplateConfig#getRestTemplate
     */
    @GetMapping("/web/book/{id}")
    public CBook getBook(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/getBook/" + id, CBook.class);
    }

    /**
     * restTemplate已开启负载均衡
     * @see com.sixsixdog.request.RestTemplateConfig#getRestTemplate
     */
    @GetMapping("/bookCheck")
    public Integer checkBook()
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/bookCheck",Integer.class);
    }

    @GetMapping("/cloud-server/discovery")
    public Object discovery() {
        final List<String> Services = discoveryClient.getServices();
        for (String region : Services) {
            System.out.println("Region: " + region);
        }
        final List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAY");

        return instances;
    }
}
