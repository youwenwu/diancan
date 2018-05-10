package com.demo.diancan.controller;

import com.demo.diancan.model.Store;
import com.demo.diancan.service.StoreService;
import com.demo.diancan.util.PageResult;
import com.demo.diancan.util.RestResult;
import com.demo.diancan.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/store")
public class StoreController {
    private static final Logger logger = LoggerFactory.getLogger(StoreController.class);
    @Autowired
    private StoreService storeService;

    @RequestMapping("/list")
    public PageResult<Store> list(@RequestParam Map<String, Object> map) {
        PageResult<Store> pageResult = new PageResult<Store>();
        int totalCount = storeService.selectCount(map);
        pageResult.setTotalCount(totalCount);
        int pageSize = Integer.parseInt(String.valueOf(map.get("pageSize")));
        int pageCurrent = Integer.parseInt(String.valueOf(map.get("pageCurrent")));
        int start = pageSize * (pageCurrent - 1);
        map.put("start", start < 0 ? 0 : start);
        map.put("size", Integer.parseInt(String.valueOf(map.get("pageSize"))));
        if (map.get("field") != null && !String.valueOf(map.get("field")).trim().isEmpty()) {
            map.put("field", StringUtil.camelToUnderline(String.valueOf(map.get("field"))).toUpperCase());
        }
        List<Store> list = storeService.selectList(map);
        pageResult.setData(list);
        return pageResult;
    }

    @RequestMapping("/create")
    public RestResult create(@RequestParam Map<String, Object> map) {
        return null;
    }

    @RequestMapping("/update")
    public RestResult update(@RequestParam Map<String, Object> map) {
        return null;
    }

    @RequestMapping("/generateSecurityKey")
    public RestResult generateSecurityKey(@RequestParam Map<String, Object> map) {
        return null;
    }

    @RequestMapping("/delete")
    public RestResult delete(@RequestParam Map<String, Object> map) {
        return null;
    }
}
