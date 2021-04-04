package com.study.feignserver.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provide-server")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}