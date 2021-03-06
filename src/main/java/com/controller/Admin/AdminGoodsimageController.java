package com.controller.Admin;

import com.controller.BaseController;
import com.dao.GoodsimageMapper;
import com.model.Goodsimage;
import com.model.MsgBean;
import com.service.GoodsimageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/Admin/Goodsimage")
public class AdminGoodsimageController extends BaseController<Goodsimage>  {
    @Autowired
    private GoodsimageService goodsimageService;
    @Autowired
    private GoodsimageMapper goodsimageMapper;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryById(@PathVariable("id")String id) {
        return super.queryById(id, goodsimageService,goodsimageMapper);
    }

    @RequestMapping(value = "/{page}/{count}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryAllByPage(@PathVariable("page") int page, @PathVariable("count") int count) {
        return super.queryAllByPage(page, count, goodsimageService,goodsimageMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseBody
    public MsgBean instertById(@ModelAttribute Goodsimage goodsimage) {

        return super.instertById(goodsimage, goodsimageService,goodsimageMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    @ResponseBody
    public MsgBean updateByKey(@ModelAttribute Goodsimage goodsimage) {
        return super.updateByKey(goodsimage, goodsimageService,goodsimageMapper);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public MsgBean deleteById(@PathVariable("id") String id) {
        return super.deleteById(id, goodsimageService,goodsimageMapper);
    }
}
