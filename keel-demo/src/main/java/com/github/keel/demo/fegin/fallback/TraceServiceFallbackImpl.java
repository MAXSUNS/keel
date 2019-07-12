package com.github.keel.demo.fegin.fallback;

import com.github.keel.demo.fegin.TraceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TraceServiceFallbackImpl implements TraceService {
    @Override
    public String trace(String name) {
        log.error("调用{}异常:{}", "trace", name);
        return null;
    }
}

