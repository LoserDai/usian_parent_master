package com.usian.controller;

import com.usian.feign.SearchItemFeign;
import com.usian.pojo.SearchItem;
import com.usian.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Loser
 * @date 2021年11月26日 21:07
 */
@RestController
@RequestMapping("/frontend/searchItem")
public class SearchItemController {

    @Autowired
    private SearchItemFeign searchItemFeign;

    @RequestMapping("/importAll")
    public Result importAll(){
       Boolean importAll = searchItemFeign.importAll();
       if (importAll){
           return Result.ok();
       }
       return Result.error("导入失败");
    }

    @RequestMapping("/list")
    public List<SearchItem> list(String q, @RequestParam(defaultValue = "1") Long page,
                                 @RequestParam(defaultValue = "20") Integer pageSize){
        return searchItemFeign.list(q,page,pageSize);
    }
}
