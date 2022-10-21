package br.dev.mhc.teste.interceptors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.SerializationUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.BufferedReader;
import java.util.Map;

@Slf4j
@Component
public class Interceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        request.getParameterMap().forEach((key, value)-> {
            log.info("Requisição interceptada: header.[" + key + "] = " + request.getHeader(key));
        });
        log.info("request.getContentType(): " + request.getContentType());
        log.info("request.getRequestURI(): " + request.getRequestURI());
        log.info("request.getAuthType(): " + request.getAuthType());
        log.info("request.getMethod(): " + request.getMethod());

        // Se o método abaixo for chamado, não será mais possível ler novamente o corpo do body da requisição
        //String bodyResponse = request.getReader().lines().reduce("", String::concat);

        return true;
    }

}
