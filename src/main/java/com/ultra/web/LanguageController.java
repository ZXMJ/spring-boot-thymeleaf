package com.ultra.web;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 * Created by zhenglian on 2016/10/12.
 */
@Controller
public class LanguageController {

    @RequestMapping("/changeSessionLanauage")
    public String changeSessionLanauage(HttpServletRequest request, HttpServletResponse response, String lang) {
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        localeResolver.setLocale(request, response, new Locale(lang));
        return "redirect:/hello";
    }

}
